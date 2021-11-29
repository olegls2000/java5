package org.bta.lesson.lesson25;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;
import org.bta.lesson.reposytory.CrudRepository;
import org.bta.lesson.reposytory.PointCrudRepository;
import org.bta.lesson.reposytory.TriangleCrudRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassWork {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        CrudRepository pointRepository = context.getBean(PointCrudRepository.class);
        CrudRepository pointRepository2 = context.getBean(PointCrudRepository.class);
        CrudRepository triangleRepository = context.getBean(TriangleCrudRepository.class);
        CrudRepository triangleRepository2 = context.getBean(TriangleCrudRepository.class);

        System.out.println(pointRepository.selectAll());

        Point a = new Point(88, 99);
        Point b = new Point(82, 91);
        Point c = new Point(81, 44);

        pointRepository.create(a);
        pointRepository.create(b);
        pointRepository.create(c);


        System.out.println(pointRepository.selectAll());
        Triangle triangle = new Triangle(a, b, c);
        triangleRepository.create(triangle);
    }
}
