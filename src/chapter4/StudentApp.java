package chapter4;

public class StudentApp {
    public static void main(String[] args) {
        Student firstStudent = new Student("Ade", 90);

        System.out.println("Name: "+ firstStudent.getName() + "\n"+ "Grade: " + firstStudent.getLetterGrade());
    }
}
