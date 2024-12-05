package com.lin.static_.staticMethod;

public class Detail01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.addPay(100);
        s2.addPay(100);
        Student.showPay();
    }
}

class Student {
    public static double pay;

    public static void addPay(double pay) {
        Student.pay += pay;
    }

    public static void showPay () {
        System.out.println(pay);
    }
}
