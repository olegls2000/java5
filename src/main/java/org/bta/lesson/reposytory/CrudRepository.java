package org.bta.lesson.reposytory;

import org.bta.lesson.model.Point;

import java.util.Collection;

public interface CrudRepository {
    void create(Point item);
    Point update(Point item);
    Point delete(Point item);
    Collection<Point> selectAll();
    Point findOne(Long id);
}
