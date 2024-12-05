package com.lin.static_.staticMethod;

import javax.sound.midi.Soundbank;

// 静态代码的调用顺序
public class CodeBlock02 {
    public static void main(String[] args) {
        SortOfClass sortOfClass = new SortOfClass();
    }
}

class SortOfClass {
    public int a2 = getVal2(2);


    {
        System.out.println("普通代码块被执行");
    }
    static {
        System.out.println("静态代码块执行");
    }

    public static int a = getVal(1);

    public int getVal2(int a2){
        System.out.println("普通方法执行");
        return a2;
    }

    public static int getVal(int a) {
        System.out.println("静态方法执行");
        return a;
    }

    public SortOfClass () {
        System.out.println("构造函数被执行");
    }
}
