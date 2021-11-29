package org.bta.lesson.lesson25;

import org.bta.lesson.exception.InvalidTriangleException;
import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;
import org.bta.lesson.repository.CrudRepository;
import org.bta.lesson.repository.PointCrudRepository;
import org.bta.lesson.repository.TriangleRepository;

public class Classwork {
    public static void main(String[] args) throws InvalidTriangleException {
        CrudRepository pointRepository = new PointCrudRepository();
        System.out.println(pointRepository.selectAll());

        Point a = new Point(88, 99);
        Point b = new Point(82, 91);
        Point c = new Point(81, 44);

        pointRepository.create(a);
        pointRepository.create(b);
        pointRepository.create(c);


        System.out.println(pointRepository.selectAll());
        Triangle triangle = new Triangle(a, b, c);
    }
}
