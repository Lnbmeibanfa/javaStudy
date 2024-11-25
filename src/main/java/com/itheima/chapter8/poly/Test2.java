package com.itheima.chapter8.poly;

public class Test2 {
    public static void main(String[] args) {
        Son son = new Son();
        son.display(); // 20
        Father father = son;
        System.out.println(father == son); // true
        System.out.println(father.count); // 20
        father.display(); //20

    }
}

class Father {
    int count = 10;
    public void display () {
        System.out.println(this.count);
    }
}

class Son extends Father {
    int count = 20;
    public void display () {
        System.out.println(this.count);
    }
}
