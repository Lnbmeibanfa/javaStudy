package com.itheima.chapter8.object_;

public class Equals01 {

    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = a;
        System.out.println(b == c);
    }
}

class A{

}
