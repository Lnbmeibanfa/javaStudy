package com.lin.static_.staticMethod;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        Test.show();
    }
}


class Test {
    static {
        System.out.println("静态代码块被加载了");
    }

    public static void show() {
        System.out.println("你好");
    }
}