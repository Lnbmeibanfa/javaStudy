package com.lin.static_.staticMethod.innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new OuterClass().test();
    }
}

class OuterClass {
    public void test() {
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        tiger.cry();
        System.out.println("tiger类型" + tiger.getClass());
        InnerClass i = new InnerClass() {
            @Override
            public void cry() {
                System.out.println("匿名内部类重写方法");
            }
        };
        System.out.println(i.getClass());
        i.cry();
    }

}

interface IA {
    void cry();
}

class InnerClass implements IA{
    @Override
    public void cry() {
        System.out.println("老虎叫唤");
    }
}