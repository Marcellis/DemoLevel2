package com.example.marmm.demolevel2;

public class Reminder {
    private String mReminderText;

    public Reminder(String reminderText) {
        this.mReminderText = reminderText;
    }

    public String getReminderText() {
        return mReminderText;
    }

    public void setReminderText(String reminderText) {
        this.mReminderText = reminderText;
    }

    @Override
    public String toString() {
        return mReminderText;
    }
}
