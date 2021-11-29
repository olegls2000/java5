package org.bta.lesson.lesson25;

import org.bta.lesson.repository.CrudRepository;
import org.bta.lesson.repository.PointCrudRepository;
import org.bta.lesson.repository.TriangleCrudRepository;

public class Classwork {
    public static void main(String[] args) {
        CrudRepository pointRepository = new PointCrudRepository();
        System.out.println(pointRepository.selectAll());
        CrudRepository triangleRepository = new TriangleCrudRepository();
        System.out.println(triangleRepository.selectAll());
    }
}
