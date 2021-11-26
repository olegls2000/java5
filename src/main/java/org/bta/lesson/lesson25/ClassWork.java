package org.bta.lesson.lesson25;

import org.bta.lesson.model.Point;
import org.bta.lesson.repository.CrudRepository;
import org.bta.lesson.repository.PointCrudRepository;

public class ClassWork {
    public static void main(String[] args) {
        CrudRepository pointRepository = new PointCrudRepository();

        pointRepository.create(new Point(88,99));
        System.out.println(pointRepository.selectAll());
    }
}
