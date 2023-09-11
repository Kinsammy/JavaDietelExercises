package chapter17.streamAPI.stream;

import chapter8.composition.Employee;

import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeApp {
    public static void main(String[] args) {
        Set<Employee> employees = Set.of(
                new Employee("Amirah", 20),
                new Employee("Amaka", 30),
                new Employee("Shola", 50)
        );
//        System.out.println(employees);
        System.out.println(employees.stream()
                .filter(employee -> employee.getAge()>20)
                .collect(Collectors.toList()));
    }
}
