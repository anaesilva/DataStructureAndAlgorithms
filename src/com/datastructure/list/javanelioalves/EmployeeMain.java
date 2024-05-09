package com.datastructure.list.javanelioalves;

import com.datastructure.list.javanelioalves.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> ls = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n =  sc.nextInt();
        System.out.println();


        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine(); //limpeza do buffer
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            ls.add(employee);
        }


        System.out.print("Enter the employee id that will have salary increase: ");
        int filterId = sc.nextInt();
//        Integer findById = hasId(ls, filterId);

        Employee findById = ls.stream().filter(x -> x.getId() == filterId).findFirst().orElse(null);

        if (findById == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
//          ls.get(findById).increaseSalary(percentage);
            findById.increaseSalary(percentage);
        }

        System.out.println("\n-------------------");
        System.out.println("List of employees:");

        for (Employee employee : ls) {
            System.out.println(employee.toString());
        }

        sc.close();
    }

//    public static Integer hasId(List<Employee> ls, int id) {
//        for (int i = 0; i < ls.size(); i++) {
//            if (ls.get(i).getId() == id) {
//                return i;
//            }
//        }
//        return null;
//    }
}
