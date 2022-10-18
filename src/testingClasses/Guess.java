package testingClasses;

public class Guess {

    public String guess(int guess) {
        if (guess == 55)
             return "is  the right Number";
        return null;
    }

    public String outcome(int guess) {
        if ( guess < 55)
            return "is too low";
        if (guess > 55)
            return "is too high";
        return null;
    }
}
