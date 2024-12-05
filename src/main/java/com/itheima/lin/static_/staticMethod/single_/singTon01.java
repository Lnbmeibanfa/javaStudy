package com.lin.static_.staticMethod.single_;

public class singTon01 {

    public static void main(String[] args) {
        Circle c = new Circle(3);
        System.out.println(c.getArea());
    }

}

class Circle {
    public static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }

}