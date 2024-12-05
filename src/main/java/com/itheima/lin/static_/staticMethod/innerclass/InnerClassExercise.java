package com.lin.static_.staticMethod.innerclass;

public class InnerClassExercise {
    public static void main(String[] args) {

        f1(new IL() {
            @Override
            public void show() {
                System.out.println("我真牛逼");
            }
        });
    }
    static void f1 (IL il) {
        il.show();
    }
}

interface IL {
    void show();
}
