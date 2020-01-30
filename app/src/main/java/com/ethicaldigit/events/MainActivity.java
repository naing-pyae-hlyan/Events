package com.ethicaldigit.events;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ethicaldigit.events.DataModel.DateTimeModel;
import com.ethicaldigit.events.Utils.Helper;

public class MainActivity extends AppCompatActivity {
    private EditText etEventName, etStartDay, etStartTime, etEndDay, etEndTime, etLocation, etDetails, etCoHost;
    private Button btnAddPhoto, btnEventCreate;
    private SwitchCompat switchInvite;
    private DateTimeModel model;

    private int mYears, mMonths, mDays, mHour, mMinutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        buttonClick();
    }

    private void initUI(){
        etEventName = findViewById(R.id.et_event_name);
        etStartDay = findViewById(R.id.et_start_date);
        etStartTime = findViewById(R.id.et_start_time);
        etEndDay = findViewById(R.id.et_end_date);
        etEndTime = findViewById(R.id.et_end_time);
        etLocation = findViewById(R.id.et_location);
        etDetails = findViewById(R.id.et_details);
        etCoHost = findViewById(R.id.et_co_hosts);

        btnAddPhoto = findViewById(R.id.btn_add_image);
        btnEventCreate = findViewById(R.id.btn_event_create);

        switchInvite = findViewById(R.id.switch_invite_friends);


        etStartDay.setInputType(InputType.TYPE_NULL);
        etStartTime.setInputType(InputType.TYPE_NULL);
        etEndDay.setInputType(InputType.TYPE_NULL);
        etEndTime.setInputType(InputType.TYPE_NULL);
        etLocation.setInputType(InputType.TYPE_NULL);
        etCoHost.setInputType(InputType.TYPE_NULL);
    }

    private void buttonClick(){
        etStartDay.setOnClickListener(v -> {
            Helper.getDateAndMonth(this);
        });
        etStartTime.setOnClickListener(v -> {
            Helper.getHourAndMinute(this);
        });
        etEndDay.setOnClickListener(v -> {
            Helper.getDateAndMonth(this);
        });

        etLocation.setOnClickListener(v -> {});
        etCoHost.setOnClickListener(v -> {});
    }
}
