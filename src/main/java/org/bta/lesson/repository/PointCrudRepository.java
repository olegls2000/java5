package org.bta.lesson.repository;

import org.bta.lesson.model.Point;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class PointCrudRepository implements CrudRepository<Point> {

    private static final String URL = "jdbc:postgresql://localhost:5433/um";
    private static final String USERNAME = "um";
    private static final String PASSWORD = "um123";

    @Override
    public Point create(Point item) {
        final String sql = "insert into point (x, y) values (?,  ?)";
        final String sqlSelect = "select id from point where x=? and y=?";
        final int x = item.getX();
        final int y = item.getY();

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql);
             PreparedStatement statementSelect = connection.prepareStatement(sqlSelect);
        ) {
            statement.setInt(1, x);
            statement.setInt(2, y);
            int affectedRow = statement.executeUpdate();
            if (affectedRow != 1) {
                throw new RuntimeException("Insert Failed!!!");
            }
            statementSelect.setInt(1, x);
            statementSelect.setInt(2, y);
            final ResultSet rs = statementSelect.executeQuery();
            if(rs.next()){
                final Long id = rs.getLong("id");
                item.setId(id);
            } else {
                throw new RuntimeException("Insert Failed!!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return item;
    }

    @Override
    public void update(Point item) {

    }

    @Override
    public void delete(Point item) {
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
