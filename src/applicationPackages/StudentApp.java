package applicationPackages;

import static applicationPackages.Student.*;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student();
        student.firstDisplay();
        for(int i = 1; i <= student.getNumberOfStudent(); i++) {
            for(int j = 1; j <= student.getNumberOfSubject(); j++) {
            student.secondDisplay(i, j);
            }
        }
        student.displayTable();
    }
}
