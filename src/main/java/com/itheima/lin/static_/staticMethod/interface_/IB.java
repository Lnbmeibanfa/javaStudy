package com.lin.static_.staticMethod.interface_;

public interface IB {
    int n = 1;
    void cry();
}

class B implements IB {
    @Override
    public void cry() {
        System.out.println("cry");
    }
}