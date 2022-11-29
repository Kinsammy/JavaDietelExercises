package chapter4;

public class Cryptography {

    public static String encrypt(int digits) {
        int result = 0;
        int firstDigit = digits / 1000;
        int secondDigit = (digits % 1000) / 100;
        int thirdDigit = (digits % 1000 % 100) / 10;
        int fourthDigit = digits % 1000 % 100 % 10;

        firstDigit += 7;
        secondDigit += 7;
        thirdDigit += 7;
        fourthDigit += 7;

        firstDigit %= 10;
        secondDigit %= 10;
        thirdDigit %= 10;
        fourthDigit %= 10;

        int temp = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = temp;

        temp = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = temp;

        return  "" + firstDigit + secondDigit + thirdDigit + fourthDigit;
    }

    public static int decrypt(int digits){
        int result = 0;
        int firstDigit = digits / 1000;
        int secondDigit = (digits % 1000) / 100;
        int thirdDigit = (digits % 1000 % 100) / 10;
        int fourthDigit = digits % 1000 % 100 % 10;

        int temp = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = temp;

        temp = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = temp;

        firstDigit %= 10;
        if (firstDigit + 10 < 16)
            firstDigit += 10;

        secondDigit %= 10;
        secondDigit = (secondDigit + 10 < 16) ? 10 : secondDigit;
        thirdDigit %= 10;
        thirdDigit = (thirdDigit + 10 < 16) ? 10 : thirdDigit;
        fourthDigit %= 10;
        fourthDigit= (fourthDigit + 10 < 16) ? 10 : fourthDigit;

        firstDigit -= 7;
        secondDigit -= 7;
        thirdDigit -= 7;
        fourthDigit -= 7;

        firstDigit *= 1000;
        secondDigit *= 100;
        thirdDigit *= 10;
        result = firstDigit + secondDigit + thirdDigit + fourthDigit;

        return result;
    }
}
