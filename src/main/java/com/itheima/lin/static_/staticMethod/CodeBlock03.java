package com.lin.static_.staticMethod;

public class CodeBlock03 {
    public static void main(String[] args) {
        Son son = new Son();
    }
}

class Father {
    static {
        System.out.println("Father静态代码块");
    }
    public Father () {
        System.out.println("父类构造器调用");
    }
}

class Son extends Father {
    {
        System.out.println("子类代码块被调用");
    }

    static {
        System.out.println("son静态代码块");
    }



    public Son () {
        // super()
        // 子类代码块
        System.out.println("子类构造器调用");
    }
}