package classWork;

public class FormattingString {
    private String strings;

    public String stringMethod(String strings) {
        return strings;
    }

    public int digitSelectorMethod(String strings) {
        int digit = 0;
        for (int index = 0; index < strings.length(); index++){
            if (strings.charAt(index) >= '0' && strings.charAt(index) <= '9'){
                digit++;
            }
        }
        return digit;
    }

    public static int digitBatteryIncludedSelector(String strings){
        return strings.replaceAll("\\D","").length();
    }

    public int digitSelector2Method(String text) {
        int digit = 0;
        for (int index = 0; index < text.length(); index++){
            if (Character.isDigit(text.charAt(index))){
                digit++;
            }
        }
        return digit;
    }

    public int digitCounterMethod(String text) {
        String digitOfString = "0123456789";
        int digit = 0;
        for (int index = 0; index < text.length(); index++){
            if (digitOfString.contains(String.valueOf(text.charAt(index)))){
                digit++;
            }
        }
        return digit;
    }
}
