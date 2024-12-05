package com.lin.static_.staticMethod.interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {

    }
}

interface X {
    int x = 1;
}

class Y {
    int x = 2;
}

class Z extends Y implements X {
    public void pX() {
        System.out.println(X.x);
        System.out.println(super.x);
    }
}
