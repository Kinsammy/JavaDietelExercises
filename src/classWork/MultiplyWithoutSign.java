package classWork;

public class MultiplyWithoutSign {


    public static int operationWithoutSign(int firstNumber, int secondNumber){
        int answer =0;
        if (firstNumber == 0){
            return 0;
        }


        for(int number=1; number <= secondNumber; number++){
            answer += firstNumber;
            if (number < 0){
                answer += secondNumber;
            }

        }
        return answer;
    }


}
