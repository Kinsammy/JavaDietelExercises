package chapter8.composition;

public class EmployeeApp {
    public static void main(String[] args) {
        Date birthDate = new Date(7, 7, 1992);
        Date hiredDate = new Date(16, 7, 2022);
        Employee employee = new Employee("Fanu", "Samuel", birthDate, hiredDate);

        System.out.println(employee);
    }
}
