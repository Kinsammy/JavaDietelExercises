package chapter8.composition;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString() {
        return String.format("Employee Information:%n" +
                "First Name: %s%n" +
                "Last Name: %s%n" +
                "Birthdate: %s%n" +
                "Hired Date: %s", firstName, lastName, birthDate, hireDate);
    }
}
