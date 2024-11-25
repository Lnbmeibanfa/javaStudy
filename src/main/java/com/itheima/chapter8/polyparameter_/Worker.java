package com.itheima.chapter8.polyparameter_;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void worker () {
        System.out.println("Worker" + getName() + " is working");
    }
}
