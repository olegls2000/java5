package org.bta.lesson.lesson10;

import org.bta.lesson.lesson10.interfaces.WithArea;
import org.bta.lesson.lesson10.interfaces.WithPerimeter;
import org.bta.lesson.utils.BtaUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ClassWork {
    public static void main(String[] args) {

        int age = WithPerimeter.AGE;
        //WithPerimeter.AGE = 300;

        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        //WithPerimeter[] shapes = new WithPerimeter[9];

        WithPerimeter seed = new Circle();
        WithPerimeter[] shapes = (WithPerimeter[]) Stream.iterate(seed, previous -> {
            switch (BtaUtils.getRandom(0, 3)) {
                case 1:
                    return new Circle();
                case 2:
                    return new Triangle();
                default:
                    return new Square();
            }
        }).limit(9).toArray();

        WithPerimeter maxPerimeterShape = shapes[0];
        for (WithPerimeter shape : shapes) {
            if (shape.getPerimeter() > maxPerimeterShape.getPerimeter()) {
                maxPerimeterShape = shape;
            }
        }

        System.out.println("Max perimeter shape: " + maxPerimeterShape);


        Arrays.stream(shapes)
                .max(Comparator.comparingInt(WithPerimeter::getPerimeter))
                .ifPresent(mps -> System.out.println("Max perimeter shape: " + mps));


        WithArea[] shapesArea = new WithArea[22];
        //TODO find max Area element...
        for (int i = 0; i < shapes.length; i++) {
            int random = BtaUtils.getRandom(0, 3);
            switch (random) {
                case 1:
                    shapes[i] = new Circle();
                    break;
                case 2:
                    shapes[i] = new Triangle();
                    break;
                default:
                    shapes[i] = new Square();
            }
        }
        WithArea maxAreaShape = shapesArea[0];
        for (WithArea shape : shapesArea) {
            if (shape.getArea() > maxAreaShape.getArea()) {
                maxAreaShape = shape;
            }
        }

        System.out.println("Max area shape: " + maxAreaShape);

    }
}
