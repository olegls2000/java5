package org.bta.lesson.lesson10;


import org.bta.lesson.lesson10.interfaces.WithArea;
import org.bta.lesson.lesson10.interfaces.WithPerimeter;
import org.bta.lesson.utils.BtaUtils;

public class ClassWork {
	public static void main(String[] args) {
		int age = WithPerimeter.AGE;

		Square square = new Square();
		Triangle triangle = new Triangle();
		Circle circle = new Circle();

		WithPerimeter[] shapes = new WithPerimeter[9];

		for (int i = 0; i < shapes.length; i++) {
			int random = BtaUtils.getRandom(0, 3);
			switch (random) {
				case 1:
					shapes[i] = new Circle();
					break;
				case 2:
					shapes[i] = (WithPerimeter) new Triangle();
					break;
				default:
					shapes[i] = (WithPerimeter) new Square();
			}
		}
		WithPerimeter maxPerimeterShape = shapes[0];
		for (WithPerimeter shape : shapes) {
			if (shape.getPerimeter() > maxPerimeterShape.getPerimeter()) {
				maxPerimeterShape = shape;
			}
		}
		System.out.println("Max perim shape: " + maxPerimeterShape);

		WithArea[] shapesArea = new WithArea[22];
		//TODO find mar Area element.....
	}
}
