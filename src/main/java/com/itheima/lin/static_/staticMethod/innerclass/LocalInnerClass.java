package com.lin.static_.staticMethod.innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        new Outer().hi();
    }
}

class Outer {
    private int n = 1;

    public void m2() {
        System.out.println("这里是m2");
    }
    public void hi () {
        System.out.println("hi");
        final class Inner {
            public void innerHi () {
                System.out.println("n:" + n);
                m2();
            }
        }
        Inner inner = new Inner();
        inner.innerHi();
    }
}


