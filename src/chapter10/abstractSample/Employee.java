package chapter10.abstractSample;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String toString(){
        return String.format("First Name: %s%nLast Name:%s%nSocial Security Number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earning();
}
