package com.lin.static_.staticMethod.abstract_;

public class Job1 extends Template{
    Job1(String name) {
        super(name);
    }

    @Override
    public void job() {
        int num = 0;
        for (int i = 0;i < 1000000000;i++) {
            num += 1;
        }
    }
}
