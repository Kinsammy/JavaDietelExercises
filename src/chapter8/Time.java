package chapter8;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {

        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public int getSecond() {
        return second;
    }

    private static void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private static void validateSecond(int second) {
        boolean isSecondValid = second > 59  || second < 0 ;
        if (isSecondValid)
            throw new IllegalArgumentException("The second is invalid");
    }

    private static void validateMinute(int minute) {
        boolean isMinuteValid = minute > 59  || minute < 0;
        if (isMinuteValid)
            throw new IllegalArgumentException("The minute is invalid");
    }

    private static void validateHour(int hour) {
        boolean isHourValid = hour > 23  || hour < 0;
        if (isHourValid)
            throw new IllegalArgumentException("The hour is invalid");
    }

    public void setTime(int hour, int minute, int second){
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString(){
        return String.format("%02d:%02d:%02d %s" ,(hour == 0 ||hour == 12 ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }



}
