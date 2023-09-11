package chapter8.composition;

public class Employee implements Comparable{
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    private int age;



    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public Employee(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String toString() {
        return String.format("Employee Information:%n" +
                "First Name: %s%n" +
                "Last Name: %s%n" +
                "Birthdate: %s%n" +
                "Hired Date: %s%n"  +
                "Age: %d", firstName, lastName, birthDate, hireDate, age);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int getAge() {
        return age;
    }
}
