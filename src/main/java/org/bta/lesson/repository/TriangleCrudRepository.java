package org.bta.lesson.repository;

import org.bta.lesson.model.Triangle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class TriangleCrudRepository implements
        CrudRepository<Triangle> {

    private static final String URL = "jdbc:postgresql://localhost:5433/um";
    private static final String USERNAME = "um";
    private static final String PASSWORD = "um123";

    @Override
    public Triangle create(Triangle item) {
        final String sqlInsert = "insert into triangle (a_id, b_id, c_id) values (?, ?, ?)";
        final String sqlSelect = "select id from triangle where a_id=? and b_id=? and c_id=?";
        final Long aId = item.getA().getId();
        final Long bId = item.getB().getId();
        final Long cId = item.getC().getId();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statementInsert = connection.prepareStatement(sqlInsert);
             PreparedStatement statementSelect = connection.prepareStatement(sqlSelect);
        ) {
            statementInsert.setLong(1, aId);
            statementInsert.setLong(2, bId);
            statementInsert.setLong(3, cId);
            statementInsert.executeUpdate();
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
    public Collection<Triangle> selectAll() {
        return null;
    }

    @Override
    public Triangle findOne(Long id) {
        return null;
    }
}
