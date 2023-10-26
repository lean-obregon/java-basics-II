package Encapsulation;

public class Employee extends Person {
    int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public String speak() {
        return "My name is " + firstName + " " + lastName + " and my salary is $" + salary;
    }
}