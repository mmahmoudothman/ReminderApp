


package com.jshealth.reminderapp;

// Reminder class
public class Reminder {
    private int mID;
    private String mTitle;
    private String mDate;
    private String mTime;
    private String mActive;


    public Reminder(int ID, String Title, String Date, String Time, String Active) {
        mID = ID;
        mTitle = Title;
        mDate = Date;
        mTime = Time;
        mActive = Active;
    }

    public Reminder(String Title, String Date, String Time, String Active) {
        mTitle = Title;
        mDate = Date;
        mTime = Time;
        mActive = Active;
    }

    public Reminder() {
    }

    public int getID() {
        return mID;
    }

    public void setID(int ID) {
        mID = ID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

    public String getActive() {
        return mActive;
    }

    public void setActive(String active) {
        mActive = active;
    }
}
