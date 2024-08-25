package org.example;

import org.example.Model.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee(1, "Adam", "HR", 5000, 25);
        Employee employeeTwo = new Employee(2, "John", "Engineering", 1000, 21);
        Employee employeeThree = new Employee(3, "Zoe", "Engineering", 3000, 23);
        Employee employeeFour = new Employee(4, "Yash", "Marketing", 5000, 25);
        Employee employeeFive = new Employee(5, "Beau", "Marketing", 3000, 27);
        Employee employeeSix = new Employee(6, "Gilly", "Sales", 4000, 29);
        Employee employeeSeven = new Employee(7, "Newton", "Sales", 1000, 30);
        Employee employeeEight = new Employee(8, "Albert", "Sales", 1000, 45);
        Employee employeeNine = new Employee(9, "Lusie", "HR", 2000, 39);
        Employee employeeTen = new Employee(10, "Rachael", "HR", 2000, 22);

        List<Employee>employeeList = Arrays.asList(employeeOne, employeeTwo, employeeThree, employeeFour, employeeFive,
                                                employeeSix, employeeSeven, employeeEight, employeeNine, employeeTen);

        employeeList.stream()
                    .filter(employee -> employee.getSalary() > 3000 && employee.getDepartment() == "HR")
                    .map(employee -> employee.getName())
                    .collect(Collectors.toList())
                    .forEach(System.out::println);

        System.out.println("\n\nEmployees default sorting order:");
        employeeList.stream().forEach(System.out::println);

        System.out.println("\n\nEmployees sorted by age:");
        Collections.sort(employeeList, Comparator.comparing(Employee::getAge));
        employeeList.stream().forEach(System.out::println);
        System.out.println("\n\nEmployees sorted by name:");
        Collections.sort(employeeList, Comparator.comparing(Employee::getName));
        employeeList.stream().forEach(System.out::println);
    }
}