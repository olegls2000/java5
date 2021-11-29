package org.bta.lesson.repository;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

//CRUD - Create Update Delete - Определение абревиатуры

public class PointCrudRepository implements CrudRepository<Point> {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "Sanek229";

    @Override
    public Point create(Point item) {

        final String sql = "insert into point (x, y) values (?, ?)";
        final String sqlSelect = "select id from point where x =? and y =?";
        final int x = item.getX();
        final int y = item.getY();

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql);
             PreparedStatement statementSelect = connection.prepareStatement(sqlSelect);
        ) {


            statement.setInt(1, item.getX());
            statement.setInt(2, item.getY());
            int affectedRow = statement.executeUpdate();
            if(affectedRow != 1) {
                throw new RuntimeException("Insert failed!!!");
            }
            statementSelect.setInt(1, item.getX());
            statementSelect.setInt(2, item.getY());
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
    public void update(Point item) {

    }

    @Override
    public void delete(Point item) {

        final String sql = "delete from point where id=?";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setLong(0, item.getId());
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