package org.opu_newbee_education.java_oop_2015.lab4;

/**
 * Created by salterok on 01.10.2015.
 */
public final class TimeStamp {
    private int hours = 0;
    private int minutes = 0;

    public TimeStamp(int hours, int minutes) {
        addInternal(hours, minutes);
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public TimeStamp add(int hours, int minutes) {
        TimeStamp stamp = new TimeStamp(this.hours, this.minutes);
        stamp.addInternal(hours, minutes);
        return stamp;
    }

    public TimeStamp add(TimeStamp timeStamp) {
        TimeStamp stamp = new TimeStamp(this.hours, this.minutes);
        stamp.addInternal(timeStamp.hours, timeStamp.minutes);
        return stamp;
    }

    public double getTotalHours() {
        return this.hours + this.minutes / 60d;
    }

    private void addInternal(int hours, int minutes) {
        int tempMins = this.minutes + minutes;
        this.hours += hours + (tempMins / 60);
        this.minutes = tempMins % 60;

    }
}
