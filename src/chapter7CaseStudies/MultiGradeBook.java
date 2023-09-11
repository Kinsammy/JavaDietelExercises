package chapter7CaseStudies;

public class MultiGradeBook {
    private String courseName;
    private final int[][] grades;

    public MultiGradeBook(String courseName, int[][] grades){
        this.courseName = courseName;
        this. grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

   public void processGrades(){
        outputGrades();

       System.out.printf("%n%s %d%n%s %d%n%n",
               "Lowest grade in the grade book is", getMinimum(),
               "Highest grade in the grade book is", getMaximum());

       outputBarChart();
    }

    private void outputBarChart() {
        System.out.println("Overall grade distribution:");
        int[] freguency = new int[11];
        for (int[] studentGrade : grades){
            for (int grade : studentGrade){
                ++freguency[grade / 10];
            }
        }
        for (int count = 0; count < freguency.length; count++){
            if (count == 10){
                System.out.printf("%5d: ", 100);
            }
            else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            for (int star = 0; star < freguency[count]; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private Object getMaximum() {
        int highGrade = grades[0][0];
        for (int[] studentGrade : grades){
            for (int grade : studentGrade){
                if (grade > highGrade){
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    private Object getMinimum() {
        int lowGrade = grades[0][0];
        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
                if (grade < lowGrade){
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    private void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("              ");

        for (int test = 0; test < grades[0].length; test++){
            System.out.printf("Test %d  ", test + 1);
        }
        System.out.println("Average");
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
            for (int test : grades[student]) {
                System.out.printf("%8d", test);
            }
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }

    public static double getAverage(int[] setOfGrades){
        int total = 0;
        for (int grade : setOfGrades) {
                total += grade;
        }

        return (double) total / setOfGrades.length;
    }


}
