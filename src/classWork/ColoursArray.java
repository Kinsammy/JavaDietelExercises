package classWork;

public class ColoursArray {
    public static void main(String[] args) {
        String [] colours = new String[7];
        colours[0] = "Red";
        colours[1] = "Pink";
        colours[2] = "Blue";
        colours[3] = "Yellow";
        colours[4] = "Violet";
        colours[5] = "White";
        colours[6] = "Black";
        //String [] colours = {"Red","Pink","Blue","Yellow","Violet","White","Black"};

        for (int index = 0; index < colours.length; index++){
            System.out.println(colours[index]);
        }
    }
}
