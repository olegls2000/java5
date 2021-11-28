package org.bta.lesson.repository;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

import java.util.Collection;

public interface CrudRepository {
    Point create(Point item);
    Point update(Point item);
    Point delete(Point item);
    Collection<Point> selectAll();
    Collection findOne(Long id);

    Triangle create(Triangle item);
    Triangle update (Triangle item);
    Triangle delete (Triangle item);
    Collection<Triangle> selectAllTriangle();
    Collection findOne1(Long id);
    }

