package org.bta.lesson.reposytory;

import org.bta.lesson.model.Point;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class PointCrudRepository implements CrudRepository {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "macbook";
    private static final String PASSWORD = "Gettherefast1";

    @Override
    public void create(Point item) {

        final String sql = "insert into point ( x, y) values (" + item.getX() + ", " + item.getY() + ")";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
        ) {

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
            statement.setLong(0, item.getId());
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Collection<Point> selectAll() {
        final Collection<Point> result = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from point")) {

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



