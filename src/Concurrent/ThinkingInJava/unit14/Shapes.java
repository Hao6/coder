package Concurrent.ThinkingInJava.unit14;

import cn.edu.redSkyline.Util;


import java.util.Arrays;
import java.util.List;

/**
 * Created by hao on 17-5-10.
 */
abstract class Shape {
    void draw() {
        System.out.println(this.toString() + " draw()");
    }
    int sign;
    void setSign(int sign){
        sign=sign;
    }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        if (sign == 1)
            return "Circle was signed";
        else
            return "Circle";

    }
}

class Square extends Shape {
    public String toString() {
        if (sign == 1)
            return "Square was signed";
        else
            return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        if (sign == 1)
            return "Triangle was signed";
        else
            return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        if (sign == 1)
            return "Rhomboid was signed";
        else
            return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(),
                new Triangle(), new Rhomboid());
        for (Shape shape : shapeList) {
            rotate(shape);
            showShape(shape);
            shape.draw();

        }

        Util.printDividingLine(30);
        Rhomboid rh = new Rhomboid();
        Shape rh2sh = rh;
        if (rh2sh instanceof Rhomboid) {
            Rhomboid rh2sh2rh = (Rhomboid) rh2sh;
        }
        if (rh2sh instanceof Circle) {
            Circle rh2sh2cir = (Circle) rh2sh;    //运行时异常，java.lang.ClassCastException
        }
        List<Shape> rhList = Arrays.asList(rh, rh2sh);
        for (Shape shape : rhList) {
            shape.draw();
        }

    }

    public static void rotate(Shape shape) {
        if (shape.getClass().equals(Circle.class)) {
            return;
        } else {
            System.out.println(shape + " rotate");
        }
    }
    public static void showShape(Shape shape){
        if(shape.getClass().equals(Circle.class)){
            shape.sign=1;
        }
    }


}

