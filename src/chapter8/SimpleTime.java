package chapter8;

public class SimpleTime {
    private final int hour;
    private final int minute;
    private final int second;

    public SimpleTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String buildingString(){
        return String.format("%24s: %s%n%24s %s", "this.universalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    }

    private String toUniversalString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

}
