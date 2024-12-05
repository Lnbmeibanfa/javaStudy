package com.lin.static_.staticMethod.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        phone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        phone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("周思涵起床了");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock (Bell bell) {
        bell.ring();
    }
}