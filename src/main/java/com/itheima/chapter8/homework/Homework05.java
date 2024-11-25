package com.itheima.chapter8.homework;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker(5000);
        Peasant peasant = new Peasant(5000);
        Teacher teacher = new Teacher(5111, 200, 30);
        Scientist scientist = new Scientist(6444, 20000);
        System.out.println("工人年薪资" + worker.getAnnualSalary());
        System.out.println("农民年薪资" + peasant.getAnnualSalary());
        System.out.println("老师年薪资" + teacher.getAnnualSalary());
        System.out.println("科学家年薪资" + scientist.getAnnualSalary());
    }
}
class Employee {
    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }
}

class Worker extends Employee {
    public Worker(double salary) {
        super(salary);
    }
}

class Peasant extends Employee {
    public Peasant(double salary) {
        super(salary);
    }
}

class Teacher extends Employee {
    private final int classDay;
    private final double classSal;
    public Teacher(double salary, int classDay, double classSal) {
        super(salary);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + classDay * classSal;
    }
}

class Scientist extends Employee {
    private final double bonus;
    public Scientist(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + bonus;
    }
}
