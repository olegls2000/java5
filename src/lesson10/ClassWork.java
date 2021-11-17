package lesson10;

import lesson10.interfaces.WithArea;
import lesson10.interfaces.WithPerimeter;
import utils.BtaUtils;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class ClassWork {
    public static void main(String[] args) {

        int age = WithPerimeter.AGE;
        //WithPerimeter.AGE = 300;

        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

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
                .max((sh1, sh2) -> sh1.getPerimeter() - sh2.getPerimeter())
                .ifPresent(mps -> System.out.println("Max perimeter shape: " + mps));


        WithArea[] shapesArea = new WithArea[22];
        //TODO find max Area element ....

    }
}
