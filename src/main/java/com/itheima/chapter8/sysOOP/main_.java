package com.itheima.chapter8.sysOOP;

public class main_ {
    public static void main(String[] args) {
        SmallChargeSys scSys = new SmallChargeSys();
        int choice;
        boolean loop = true;
        do {
            choice = scSys.getChoice();
            if (!scSys.execute(choice)) {
                loop = false;
            }
        } while (loop);
    }
}
