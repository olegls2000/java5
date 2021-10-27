package Lesson10;

import Lesson10.Interfaces.WithArea;
import Lesson10.Interfaces.WithPerimeter;
import utils.BtaUtils;

public class ClassWork {
    public static void main(String[] args) {
        int age = WithPerimeter.AGE;
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        WithPerimeter[]shapes = new WithPerimeter[9];

        for (int i = 0; i < shapes.length; i++) {
            int random = BtaUtils.getRandom(0,3);
            switch (random){
                case 0:
                    shapes[i] = new Circle();
                    break;
                case 1:
                    shapes[i] = new Triangle();
                    break;
                default:
                    shapes[i] = new Square();
            }
        }
        WithPerimeter maxPerimeterShape = shapes[0];
        for (WithPerimeter shape:shapes) {
            if (shape.getPerimeter() > maxPerimeterShape.getPerimeter()){
                maxPerimeterShape = shape;
            }
        }
        System.out.println("Max perimeter shape is: " + maxPerimeterShape);
        WithArea[] shapesArea = new WithArea[22];
        WithArea maxAreaShapes = shapesArea[0];


    }

}
