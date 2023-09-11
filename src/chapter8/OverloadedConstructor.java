package chapter8;

public class OverloadedConstructor {
    private int hour;
    private int minute;
    private int second;

    public OverloadedConstructor(){
        this(0, 0, 0);
    }

    public OverloadedConstructor(int hour){
        this(hour, 0, 0);
    }

    public OverloadedConstructor(int hour, int minute){
        this(hour, minute, 0);
    }

    public OverloadedConstructor(int hour, int minute, int second){
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static void validate(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    public static void validateHour(int hour){
        boolean isHourValid = hour < 0 || hour >= 24;
        if (isHourValid){
            throw new IllegalArgumentException("Hour must be 0-23");
        }
    }

    public static void validateMinute(int minute){
        boolean isMinuteValid = minute < 0 || minute >= 60;
        if (isMinuteValid){
            throw new IllegalArgumentException("Minutes must be 0-59");
        }
    }

    public static void validateSecond(int second){
        boolean isSecondValid = second < 0 || second >= 60;
        if (isSecondValid){
            throw new IllegalArgumentException("Second must be 0-59");
        }
    }

    public OverloadedConstructor(OverloadedConstructor time){
        this(time.hour, time.minute, time.second);
    }

    public void setTime(int hour, int minute, int second){
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public String toUniversalString(){
        return String.format("%d:%02d:%02d %s",
                ((getHour() ==0 || getHour() ==12) ? 12 : getHour() % 12),getMinute(), getSecond(),
                (getHour() < 12 ? "AM" : "PM"));
    }

    public String toString(){
        return String.format("%d:%02d%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getHour(),(getMinute() < 12 ? "AM" : "PM"));
    }
}
