package org.bta.lesson.reposytory;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class TriangleCrudRepository implements CrudRepository<Triangle> {

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
            if (affectedRow != 1) {
                throw new RuntimeException("Insert failed!!!");
            }
            statementSelect.setLong(1, a_id);
            statementSelect.setLong(2, b_id);
            statementSelect.setLong(3, c_id);
            ResultSet rs = statementSelect.executeQuery();
            if (rs.next()) {
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

        final String sql = "update point where id = ?";
        final Long a_id = item.getA().getId();
        final Long b_id = item.getB().getId();
        final Long c_id = item.getC().getId();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setLong(1, a_id);
            ps.setLong(2, b_id);
            ps.setLong(3, c_id);

            int executeUpdate = ps.executeUpdate();

            if (executeUpdate == 1) {
                System.out.println("Point is updated");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Triangle item) {
        final String sql = "delete from point where id=?";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setLong(1, item.getId());
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Collection<Point> selectAll() {

    final Collection<Point> result = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from point"))

    {

        while (resultSet.next()) {
            Point point = new Point();
            point.setX(resultSet.getInt("x"));
            point.setY(resultSet.getInt("y"));
            point.setId(resultSet.getLong("id"));
            result.add(point);
        }

    } catch(
    SQLException e)

    {

        e.printStackTrace();

    }
        return result;
}

    @Override
    public Triangle findOne(Long id) {
        return null;
    }
}
