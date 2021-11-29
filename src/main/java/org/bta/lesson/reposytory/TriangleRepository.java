package org.bta.lesson.reposytory;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class TriangleRepository implements CrudRepository<Triangle>{

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "macbook";
    private static final String PASSWORD = "Gettherefast1";

    @Override
    public Triangle create(Triangle item) {
        final String sqlInsert = "insert into point (a_id, b_id, c_id) values (?, ?, ?)";
        final String sqlSelect = "select id from triangle where a_id =? and b_id =? and c_id =?";
        final Long a_id = item.getA().getId();
        final Long b_id = item.getB().getId();
        final Long c_id = item.getC().getId();

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sqlInsert);
             PreparedStatement statementSelect = connection.prepareStatement(sqlSelect);
        ) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public void update(Triangle item) {

    }

    @Override
    public void delete(Triangle item) {

    }

    @Override
    public Collection<Point> selectAll() {
        return null;
    }

    @Override
    public Triangle findOne(Long id) {
        return null;
    }
}
