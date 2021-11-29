package org.bta.lesson.lesson25;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;
import org.bta.lesson.repository.CrudRepository;
import org.bta.lesson.repository.PointCrudRepository;

public class ClassWork {
    public static void main(String[] args) {
        CrudRepository pointRepository = new PointCrudRepository();

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
