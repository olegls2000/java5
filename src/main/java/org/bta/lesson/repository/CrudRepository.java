package org.bta.lesson.repository;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

import java.sql.SQLException;
import java.util.Collection;

public interface CrudRepository<T> {
        T create(T item);
        void update(T item);
        void delete(T item);
        Collection<Point> selectAll();
        T findOne(Long id);
    }

