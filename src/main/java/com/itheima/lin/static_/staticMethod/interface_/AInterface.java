package com.lin.static_.staticMethod.interface_;

public interface AInterface {
    // 属性可以有
    public int n1 = 10;
    // 方法可以实现,但是必须default
    public default void hi() {
        System.out.println("hi");
    }
}

class A implements AInterface {

}
