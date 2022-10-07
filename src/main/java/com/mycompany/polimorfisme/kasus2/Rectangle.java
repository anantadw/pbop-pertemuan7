package com.mycompany.polimorfisme.kasus2;

public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        String result = super.toString();

        result += "\nRectangle area: " + area();

        return result;
    }
}
