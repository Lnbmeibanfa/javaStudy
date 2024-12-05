package com.lin.static_.staticMethod.innerclass;

public class MemberClass {
    public static void main(String[] args) {
        Outer03.Inner03 inner03 = new Outer03().new Inner03();
        inner03.say();
    }
}

class Outer03 {
    private int n1 = 10;
    public void say() {
        System.out.println("n1:" +  n1);
    }

    class Inner03 {
        private int n2 = 10;
        public void say() {
            System.out.println("n1:" + Outer03.this.n1);
        }
    }
}

