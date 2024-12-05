package com.lin.static_.staticMethod.innerclass;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer04.Inner04 inner04 = new Outer04.Inner04();
    }
}

class Outer04{
    private int n1 = 10;
    private static int n2 = 20;
    static class Inner04{
        private int n3 = 20;
        public void show () {
            System.out.println(n2);
        }
    }
}
