package com.lin.static_.staticMethod.abstract_;

public class AbstractTest {
    public static void main(String[] args) {
        Job1 job1 = new Job1("算100000");
        job1.caculate();
    }
}

abstract class Employee {
    private String name;
    private Integer id;
    private double salary;

    public Employee(String name, Integer id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void work() ;
}

class Manager extends Employee {
    public Manager(String name, Integer id, double salary) {
        super(name, id, salary);
    }

    @Override
    void work() {
        System.out.println("Manager work");
    }
}

class CommonWorker extends Employee {
    public CommonWorker(String name, Integer id, double salary) {
        super(name, id, salary);
    }
    @Override
    void work() {
        System.out.println("CommonWorker work");
    }
}
