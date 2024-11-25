package com.itheima.chapter8.poly;

public class PolyDetail {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count);

        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);
        BB bb = new BB();
        System.out.println(bb instanceof AA);
        System.out.println(bb instanceof BB);
    }
}

class Base {
    public int count = 10;
}

class Sub extends Base {
    public int count = 20;
}

class AA {}

class BB extends AA {}
