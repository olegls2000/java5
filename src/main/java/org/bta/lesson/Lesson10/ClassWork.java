package org.bta.lesson.Lesson10;

import org.bta.lesson.Lesson10.Interfaces.WithArea;
import org.bta.lesson.Lesson10.Interfaces.WithPerimeter;
import org.bta.lesson.utils.BtaUtils;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class ClassWork {
    public static void main(String[] args) {
        int age = WithPerimeter.AGE;
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();


        WithPerimeter seed = new Circle();
        WithPerimeter[] shapes = (WithPerimeter[]) Stream.iterate(seed, wp -> {

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

        Arrays.stream(shapes)
                .max(Comparator.comparingInt(WithPerimeter::getPerimeter))
                .ifPresent(mps -> System.out.println("Max Perimeter shape" + mps));

        WithArea[] shapesArea = new WithArea[22];
        WithArea maxAreaShapes = shapesArea[0];


    }

}
