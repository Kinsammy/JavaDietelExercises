package chapter14;

public class Sample {
    public static void main(String[] args) {
        String text = """
                1. We are Paragons
                2. I am a Software Engineer
                3. The devil is a liar
                4.  I'm in Semicolon Africa
                """;

//        String digitWithinTest = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int counter = 0; counter < text.length(); counter++){
            char currentCharacter = text.charAt(counter);
            if (Character.isDigit(currentCharacter)){
                stringBuilder.append(currentCharacter) ;
            }
        }

        String digits = stringBuilder.toString();
        System.out.println(digits);
        System.out.println("Reverse string " +stringBuilder.reverse());
    }
}
