package com.lin.static_.staticMethod.abstract_;

abstract class Template {
    private String name;
    Template(String name) {
        this.name = name;
    }
    public void caculate() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println(name + "执行耗时" + (end - start) + "ms");
    }

    abstract void job() ;
}
