package org.bta.lesson.lesson10;

import org.bta.lesson.lesson10.interfaces.WithPerimeter;
import org.bta.lesson.lesson10.interfaces.WithPerimeter;
import org.bta.lesson.utils.BtaUtils;


// INTERFEISY
public class ClassWork {
    public static void main(String[] args) {

        int age = WithPerimeter.AGE;
        //   WithPerimeter.AGE = 300;   - znachenie neizmenno  .!!!!

        //   final int square.getPerimeter();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        WithPerimeter[] shapes = new WithPerimeter[90];


        for (int i = 0; i < shapes.length; i++) {
            int random = BtaUtils.getRandom(0, 4);
            switch (random) {
                case 1:
                    shapes[i] = (WithPerimeter) new Circle();
                    break;
                case 2:
                    shapes[i] = (WithPerimeter) new Triangle();
                    break;
                default:
                    shapes[i] = new Square();
                    break;
            }
        }
        WithPerimeter maxPerimeterShape = shapes[0];
        for (WithPerimeter shape : shapes){
            if (shape.getPerimeter() > maxPerimeterShape.getPerimeter());
            maxPerimeterShape=shape;
        }

//massiv ploschadei
        // TODO


  /*      WithArea[] shapes = new WithArea[][90];
        for (int i = 0; i < shapes.length; i++) {
            int random = BtaUtils.getRandom(0, 4);
            switch (random) {
                case 1:
                    shapes[i] = new Circle();
                    break;
                case 2:
                    shapes[i] = new Triangle();
                    break;
                default:
                    shapes[i] = new Square();
                    break;
            }
        }
        WithPerimeter maxPerimeterShape = shapes[0];
        for (WithPerimeter shape : shapes){
            if (shape.getPerimeter() > maxPerimeterShape.getPerimeter());
            maxPerimeterShape=shape;
        }

*/


    }

}
