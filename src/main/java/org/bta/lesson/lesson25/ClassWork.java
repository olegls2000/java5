package org.bta.lesson.lesson25;

import org.bta.lesson.model.Point;
import org.bta.lesson.reposytory.CrudRepository;
import org.bta.lesson.reposytory.PointCrudRepository;

public class ClassWork {
    public static void main(String[] args) {
        CrudRepository pointRepository = new PointCrudRepository();
        System.out.println(pointRepository.selectAll());

        pointRepository.create(new Point(22,33));
        System.out.println(pointRepository.selectAll());
    }
}
