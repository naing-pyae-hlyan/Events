package com.ethicaldigit.events.DataModel;

public class DateTimeModel {
    int mYears, mMonths, mDays, mHour, mMinutes;

    public DateTimeModel(int mYears, int mMonths, int mDays) {
        this.mYears = mYears;
        this.mMonths = mMonths;
        this.mDays = mDays;
    }

    public DateTimeModel(int mHour, int mMinutes) {
        this.mHour = mHour;
        this.mMinutes = mMinutes;
    }

    public int getmYears() {
        return mYears;
    }

    public void setmYears(int mYears) {
        this.mYears = mYears;
    }

    public int getmMonths() {
        return mMonths;
    }

    public void setmMonths(int mMonths) {
        this.mMonths = mMonths;
    }

    public int getmDays() {
        return mDays;
    }

    public void setmDays(int mDays) {
        this.mDays = mDays;
    }

    public int getmHour() {
        return mHour;
    }

    public void setmHour(int mHour) {
        this.mHour = mHour;
    }

    public int getmMinutes() {
        return mMinutes;
    }

    public void setmMinutes(int mMinutes) {
        this.mMinutes = mMinutes;
    }
}
