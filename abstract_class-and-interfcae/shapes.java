import java.util.*;
import java.lang.System;

abstract class shape{
    abstract double area();
    abstract void printArea();
}

interface Resizable{
    void resize(double factor);
}

class Circle extends shape implements Resizable{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area() {
        return Math.PI*radius*radius;
    }
    @Override
    void printArea() {
        System.out.println("Area of Circle: "+area());
    }
    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println(radius);
    }
}

public class shapes{
    static void main() {
        Circle c = new Circle(5);
        c.printArea();
        c.resize(2);
        System.out.println(c.area());
    }
}