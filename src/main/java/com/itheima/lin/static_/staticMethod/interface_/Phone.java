package com.lin.static_.staticMethod.interface_;

public class Phone implements UsbInterface {
    @Override
    public void start () {
        System.out.println("手机工作");
    }

    @Override
    public void stop () {
        System.out.println("手机停止工作");
    }
}
