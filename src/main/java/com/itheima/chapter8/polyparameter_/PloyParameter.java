package com.itheima.chapter8.polyparameter_;

public class PloyParameter {
    public static void main(String[] args) {
        Employee e = new Manager("Sire", 20000, 123);
        showEmpAnnal(e);
    }
    public static void showEmpAnnal(Employee e) {
        System.out.println(e.getName() + "的年薪是" + e.getAnnual());
        if (e instanceof Worker) {
            ((Worker) e).worker();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }
}
