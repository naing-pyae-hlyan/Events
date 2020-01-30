package com.ethicaldigit.events.Utils;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.TimePicker;

import com.ethicaldigit.events.DataModel.DateTimeModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Helper {

    public static int mYear;
    public static int mMonth;
    public static int mDay;
    public static int mHour;
    public static int mMinute;

    public static void getDateAndMonth(Context context){

        final List<DateTimeModel> list = new ArrayList<>();

        final Calendar calendar = Calendar.getInstance();
        mYear = calendar.get(Calendar.YEAR);
        mMonth= calendar.get(Calendar.MONTH);
        mDay = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog picker = new DatePickerDialog(context,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        DateTimeModel dateTimeModel = new DateTimeModel(year, month, dayOfMonth);
                        list.add(dateTimeModel);
                    }
                }, mYear, mMonth, mDay);
        picker.show();
    }
    public static void getHourAndMinute(Context context){
        final List<DateTimeModel> list = new ArrayList<>();

        final Calendar calendar = Calendar.getInstance();
        mHour = calendar.get(Calendar.HOUR_OF_DAY);
        mMinute = calendar.get(Calendar.MINUTE);

        TimePickerDialog picker = new TimePickerDialog(context,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        DateTimeModel model = new DateTimeModel(hourOfDay, minute);
                        list.add(model);
                    }
                }, mHour, mMinute, false);
        picker.show();
    }
}
