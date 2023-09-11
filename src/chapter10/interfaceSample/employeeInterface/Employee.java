package chapter10.interfaceSample.employeeInterface;

public abstract class Employee implements Payable {
    public final String firstName;
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
        return String.format("%s %s%nSocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earning();

    @Override
    public double getPaymentAmount() {
        return earning();
    }
}
