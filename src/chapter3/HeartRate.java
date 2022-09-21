package chapter3;

import java.time.LocalDate;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private static int year;

    public HeartRate(String firstName, String lastName, int day, int month, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setDay(int day){
        this.day= day;
    }
    public int getDay(){
        return day;
    }

    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }

    public void setYear(int year){
        this.year = year;
    }
    public static int getYear(){
        return year;
    }

    public int getAge(){
        return LocalDate.now().getYear() - year;
    }
    public int maximumHeartRate(){
        int maxHeartRate = 220 - getAge();
        return maxHeartRate;
    }

    public double targetHeartRate(){
        double target = maximumHeartRate() * 0.85;
        return target;
    }


}
