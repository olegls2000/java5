package org.bta.lesson.lesson25;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;
import org.bta.lesson.repository.CrudRepository;
import org.bta.lesson.repository.PointCrudRepository;
import org.bta.lesson.repository.TriangleCrudRepository;

public class ClassWork {
    public static void main(String[] args) {
        CrudRepository<Point> pointRepository = new PointCrudRepository();
        CrudRepository<Triangle> triangleRepository = new TriangleCrudRepository();

        Point a = new Point(53, 99);
        Point b = new Point(55, 91);
        Point c = new Point(53, 44);

        pointRepository.create(a);
        pointRepository.create(b);
        pointRepository.create(c);
        System.out.println(pointRepository.selectAll());
        Triangle triangle = new Triangle(a, b, c);
        triangleRepository.create(triangle);
    }
}
