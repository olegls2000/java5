package org.bta.lesson.repository;

import org.bta.lesson.model.Point;

import java.util.Collection;

public interface CrudRepository<T> {
    void create(Point item);
    T update(T item);
    T delete(T item);
    Collection<T> selectAll();
    T findOne(Long id);
}
