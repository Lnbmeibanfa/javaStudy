package com.lin.static_.staticMethod;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie("111", 12.0);
    }
}

class Movie {
    private String name;
    private Double price;
    {
        System.out.println("电影马上要开始了");
    }

    public Movie() {}

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
