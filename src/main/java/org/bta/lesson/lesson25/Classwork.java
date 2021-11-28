package org.bta.lesson.lesson25;

import org.bta.lesson.repository.CrudRepository;
import org.bta.lesson.repository.PointCrudRepository;

public class Classwork {
    public static void main(String[] args) {
        CrudRepository pointRepository = new PointCrudRepository();
        System.out.println(pointRepository.selectAll());
    }
}
