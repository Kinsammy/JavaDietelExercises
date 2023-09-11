package applicationPackages;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static applicationPackages.StudentMethod.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> studentList = new ArrayList<>();
        ArrayList<Integer> subjectList = new ArrayList<>();
        ArrayList<Integer> firstSubjectList = new ArrayList<>();
        ArrayList<Integer> secondSubjectList = new ArrayList<>();
        ArrayList<Integer> thirdSubjectList = new ArrayList<>();
        ArrayList<Integer> totalList= new ArrayList<>();
        ArrayList<Integer> averageList = new ArrayList<>();
        ArrayList<Integer> positionList = new ArrayList<>();
        while (true){
            System.out.println("How many students do you have? ");
            int student = input.nextInt();
            studentList.add(student);
            System.out.println("How many subject do they offer? ");
            int subject = input.nextInt();
            subjectList.add(subject);
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);
            System.out.println("Entering score for student 1");
            System.out.println("Enter score for subject 1");
            int firstStudentFirstSubject = input.nextInt();
            firstSubjectList.add(firstStudentFirstSubject);
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);

            System.out.println("Entering score for student 2");
            System.out.println("Enter score for subject 2");
            int secondStudentSecondSubject = input.nextInt();
            secondSubjectList.add(secondStudentSecondSubject);
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);

            System.out.println("Entering score for student 2");
            System.out.println("Enter score for subject 1");
            int secondStudentFirstSubject = input.nextInt();
            firstSubjectList.add(secondStudentFirstSubject);
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);

            System.out.println("Entering score for student 1");
            System.out.println("Enter score for subject 2");
            int firstStudentSecondSubject = input.nextInt();
            secondSubjectList.add(firstStudentSecondSubject);
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);


            System.out.println("Entering score for student 3");
            System.out.println("Enter score for subject 2");
            int thirdStudentSecondSubject = input.nextInt();
            secondSubjectList.add(thirdStudentSecondSubject);
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);

            System.out.println("Entering score for student 3");
            System.out.println("Enter score for subject 1");
            int thirdStudentFirstSubject = input.nextInt();
            firstSubjectList.add(thirdStudentFirstSubject);
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);

            System.out.println("Entering score for student 2");
            System.out.println("Enter score for subject 3");
            int secondStudentThirdSubject = input.nextInt();
            thirdSubjectList.add(secondStudentThirdSubject);
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);

            System.out.println("Entering score for student 1");
            System.out.println("Enter score for subject 3");
            int firstStudentThirdSubject = input.nextInt();
            thirdSubjectList.add(firstStudentThirdSubject);
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);

            System.out.println("Entering score for student 3");
            System.out.println("Enter score for subject 3");
            int thirdStudentThirdSubject = input.nextInt();
            thirdSubjectList.add(thirdStudentThirdSubject);
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);

            System.out.println("Any other entering? ");
            String option = input.next().toLowerCase();
            if(!Objects.equals(option, "yes")){
                totalList.add(firstTotal(firstStudentFirstSubject, firstStudentSecondSubject, firstStudentThirdSubject));
                totalList.add(secondTotal(secondStudentFirstSubject, secondStudentSecondSubject, secondStudentThirdSubject));
                totalList.add(thirdTotal(thirdStudentFirstSubject, thirdStudentSecondSubject, thirdStudentThirdSubject));
                System.out.printf("""
                        =======================================================
                        %s%15s%5s%5s%5s%10s%5s
                        =======================================================
                        """, "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
                for (int index = 0; index < studentList.size(); index++){
                    System.out.printf("%n%d%15d%5d%5d%10d%n", studentList.get(index), firstSubjectList.get(index),
                            secondSubjectList.get(index), thirdSubjectList.get(index), totalList.get(index));
                }
                break;
            }

        }

    }
}