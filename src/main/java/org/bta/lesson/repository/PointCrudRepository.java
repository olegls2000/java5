package org.bta.lesson.repository;

import org.bta.lesson.model.Point;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class PointCrudRepository implements CrudRepository {

    private static final String URL = "jdbc:postgresql://pgctcd1-primary.db.int.kn:5432/um_uat_db";
    private static final String USERNAME = "um_uat";
    private static final String PASSWORD = "ApVPQtdQeamGQ9Z";


    @Override
    public void create(Point item) {
        final String sql = "insert into point (x, y) values (" + item.getX() + ",  " + item.getY() + ")";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
        ) {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Point update(Point item) {
        return null;
    }

    @Override
    public Point delete(Point item) {
        final String sql = "delete from point where id=?";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setLong(1, item.getId());
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Collection<Point> selectAll() {
        final String sql = "select * from point";
        final Collection<Point> result = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Point point = new Point();
                point.setX(resultSet.getInt("x"));
                point.setY(resultSet.getInt("y"));
                point.setId(resultSet.getLong("id"));
                result.add(point);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Point findOne(Long id) {
        return null;
    }
}
