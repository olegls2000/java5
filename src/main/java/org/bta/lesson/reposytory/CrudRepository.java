package org.bta.lesson.reposytory;

import org.bta.lesson.model.Point;

import java.util.Collection;

public interface CrudRepository<T> {
    T create(T item);
    void update(T item);
    void delete(T item);
    Collection<Point> selectAll();
    T findOne(Long id);
}
