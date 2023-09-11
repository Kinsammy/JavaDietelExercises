package applicationPackages;

import java.util.Scanner;

public class Student {
    static Scanner input = new Scanner(System.in);
    private int numberOfSubject;
    private int numberOfStudent;
    private int[][] scores;

    public  void firstDisplay(){
        System.out.println("How many students do you have?");
        numberOfStudent = input.nextInt();
        System.out.println("How many subject do they have?");
        numberOfSubject = input.nextInt();
        scores = new int[numberOfStudent][numberOfSubject];
        savingMode();
    }

    public void secondDisplay(int studentNumber, int subjectNumber){
        System.out.printf("Entering score for student %d%n", studentNumber);
        System.out.printf("Enter score for subject %d%n", subjectNumber);
        int score = input.nextInt();
        scores[studentNumber - 1][subjectNumber - 1] = score;
        savingMode();
    }

    public void displayTable(){
        System.out.printf("%-17s%-10s%-10s%-10s%-10s%-10s%s%n", "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
        for (int row = 0; row < numberOfStudent; row++){
            System.out.printf("Student%-10d", row + 1);
            for (int column = 0; column < numberOfSubject; column++) {
                System.out.printf("%-10d", scores[row][column]);
            }
            System.out.printf("%-10d%-10.2f%d", totalPerStudent(row + 1), averagePerStudent(row + 1),
                    getPositionPerStudent(row + 1));
            System.out.println();
        }
        
    }

    public int getPositionPerStudent(int studentNumber) {
        int[] totals = new int[numberOfStudent];
        for(int i = 0; i < numberOfStudent; i++) {
            totals[i] = totalPerStudent(i + 1);
        }

        for(int i = 0; i < numberOfStudent; i++) {
            for(int j = i + 1; j < numberOfStudent; j++) {
                if( totals[i] < totals[j]) {
                    int temp = totals[i];
                    totals[i] = totals[j];
                    totals[j] = temp;
                }
            }
        }

        int position = 0;
        for(int i = 0; i < numberOfStudent; i++) {
            if (totals[i] == totalPerStudent(studentNumber)){
                position = i + 1;
            }
        }

        return position;
    }

    public int totalPerStudent(int studentNumber){
        int total = 0;
        for (int column = 0; column < numberOfSubject; column++) {
            total += scores[studentNumber - 1][column];
        }
        return total;
    }



    public double averagePerStudent(int studentNumber){
        return (double) totalPerStudent(studentNumber) / numberOfSubject;
    }

    public static void savingMode(){
        System.out.println( """
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);
    }

//    public static void scoreEntering(){
//        System.out.println("Enter student number");
//        int studentNumber = input.nextInt();
//        System.out.println("Enter score number");
//        int subjectNumber = input.nextInt();
//        secondDisplay(studentNumber, subjectNumber);
//    }

    public int getNumberOfSubject() {
        return numberOfSubject;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }
}
