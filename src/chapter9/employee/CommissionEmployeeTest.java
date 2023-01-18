package chapter9.employee;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
                "Fanu",
                "Samuel",
                "222-22-2222",
                100000,
                0.06
                );

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("Full name is %s %s%nSocial Security Number is %s%nGross sales is %.2f%nCommission rate is %.2f",
                employee.getFirstName(), employee.getLastName(), employee.getSocialSecurityNumber(), employee.getGrossSales(), employee.getCommissionRate());

        employee.setGrossSales(50000);
        employee.setCommissionRate(0.1);
        System.out.printf("%n%s:%n%n%s%n","Updated employee information obtained by toString method", employee);

    }
}
