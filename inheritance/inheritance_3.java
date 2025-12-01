import java.util.*;
import java.lang.System;


class Employee {
    String name;
    int id;
    double baseSalary;
    Employee(String name, int id, double baseSalary) {
        this.name=name;
        this.id=id;
        this.baseSalary=baseSalary;
    }
    double calculateSalary() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    double salesAmount;
    double commissionRate;
    SalesEmployee(String name, int id, double baseSalary,double salesAmount,double commissionRate) {
        super(name, id, baseSalary);
        this.salesAmount=salesAmount;
        this.commissionRate=commissionRate;
    }
    @Override
    double calculateSalary() {
        double commission = salesAmount * commissionRate;
        return baseSalary + commission;
    }


}

public class inheritance_3{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, 50000);
        SalesEmployee emp2 = new SalesEmployee("Bob", 102, 40000, 200000, 0.05);

        System.out.println("Employee: " + emp1.name + ", Salary: " + emp1.calculateSalary());
        System.out.println("Sales Employee: " + emp2.name + ", Salary: " + emp2.calculateSalary());
    }
}