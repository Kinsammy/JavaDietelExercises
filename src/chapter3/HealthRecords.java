package chapter3;

import java.time.LocalDate;

public class HealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private double height;
    private double weight;

    public HealthRecords(String firstName, String lastName, String gender, int month, int day, int year, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender =gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public int getAge(){
        return LocalDate.now().getYear()-year;
    }

    public int maximumHeartRate(){
        return 220 - getAge();
    }

    public double targetHeartRate(){
        return maximumHeartRate() * 0.85;
    }

    public double getBmi(){
        return (weight * 703) /(height * height);
    }

}
