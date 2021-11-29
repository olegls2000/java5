package org.bta.lesson.lesson25;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;
import org.bta.lesson.repository.CrudRepository;
import org.bta.lesson.repository.PointCrudRepository;
import org.bta.lesson.repository.TriangleCrudRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassWork {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        CrudRepository<Point> pointRepository = (CrudRepository<Point>) context.getBean("pointRepository");
        CrudRepository<Point> pointRepository2 = context.getBean(PointCrudRepository.class);
        CrudRepository<Triangle> triangleRepository = context.getBean(TriangleCrudRepository.class);
        CrudRepository<Triangle> triangleRepository2 = context.getBean(TriangleCrudRepository.class);

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
