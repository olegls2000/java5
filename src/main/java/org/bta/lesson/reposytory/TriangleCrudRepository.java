package org.bta.lesson.reposytory;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

import java.sql.*;
import java.util.Collection;

public class TriangleCrudRepository implements CrudRepository<Triangle>{

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "macbook";
    private static final String PASSWORD = "Gettherefast1";

    @Override
    public Triangle create(Triangle item) {
        final String sqlInsert = "insert into triangle (a_id, b_id, c_id) values (?, ?, ?)";
        final String sqlSelect = "select id from triangle where a_id =? and b_id =? and c_id =?";
        final Long a_id = item.getA().getId();
        final Long b_id = item.getB().getId();
        final Long c_id = item.getC().getId();

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sqlInsert);
             PreparedStatement statementSelect = connection.prepareStatement(sqlSelect);
        ) {

            statement.setLong(1, a_id);
            statement.setLong(2, b_id);
            statement.setLong(3, c_id);
            int affectedRow = statement.executeUpdate();
            if(affectedRow != 1) {
                throw new RuntimeException("Insert failed!!!");
            }
            statementSelect.setLong(1, a_id);
            statementSelect.setLong(2, b_id);
            statementSelect.setLong(3, c_id);
            ResultSet rs = statementSelect.executeQuery();
            if(rs.next()) {
                final Long id = rs.getLong("id");
                item.setId(id);
            } else {
                throw new RuntimeException("Insert failed!!!");
            }

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
