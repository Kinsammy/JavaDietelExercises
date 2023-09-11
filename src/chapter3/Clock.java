package chapter3;

import java.io.PrintStream;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
        if (hour > 23){
            hour = 0;
        }
        this.hour = hour;

        if (minute > 59){
            minute = 0;
        }
        this.minute = minute;

        if (second > 59){
            second = 0;
        }
        this.second = second;
    }

    public void setHour(int hour){
        if (hour > 23){
            hour = 0;
        }
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }

    public void setMinute(int minute){
        if (minute > 59){
            minute = 0;
        }
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second){
        if (second > 59){
            second = 0;
        }
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public int displayTime(){
        int display = 0;
        System.out.printf("%d:%d:%d",getHour(),getMinute(),getSecond());
        return display;
    }
}
