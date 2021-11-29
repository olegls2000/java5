package org.bta.lesson.repository;

import java.util.Collection;

public interface CrudRepository<T> {
    T create(T item);
    void update(T item);
    void delete(T item);
    Collection<T> selectAll();
    T findOne(Long id);
}
