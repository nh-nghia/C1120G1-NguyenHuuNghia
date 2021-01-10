package ss06_inheritance.exercise.ex04_thiet_ke_va_trien_khai_lop_triangle;

import ss06_inheritance.practice.p01_he_cac_doi_tuong_hinh_hoc.Shape;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1d;
        side2 = 1d;
        side3 = 1d;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", color=" + color
                + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
    }

}
