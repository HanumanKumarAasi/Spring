package org.example;

public class Employee {

    //property for setter injection
    private int age;

    private Computer computer;

    public Employee(){
        System.out.println("Employee Bean created...");
    }

    public Employee(int age, Computer computer) {
        this.age = age;
        this.computer = computer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        System.out.println("coding...");
        computer.compile();
    }
}
