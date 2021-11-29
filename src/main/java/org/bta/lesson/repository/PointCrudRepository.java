package org.bta.lesson.repository;

import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

//CRUD - Create Update Delete - Определение абревиатуры

public class PointCrudRepository implements CrudRepository {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "Sanek229";

    public PointCrudRepository() {
    }


    @Override
    public Point create(Point item) {
        final String sql = "insert into point (x,y) values (" + item.getX() + ", " + +item.getY() + ")";
        Point result = null;
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                Point point = new Point();
                point.setX(resultSet.getInt("x"));
                point.setY(resultSet.getInt("y"));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public Point update(Point item) {
        return null;
    }

    @Override
    public Point delete(Point item) {
        return null;
    }

    @Override
    public Collection<Point> selectAll() {
        final Collection<Point> result = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from country")) {

            while (resultSet.next()) {
                Point point = new Point();
                point.setX(resultSet.getInt("x"));
                point.setY(resultSet.getInt("y"));
                result.add(point);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public Collection findOne(Long id) {
        return null;
    }

    @Override
    public void create(Triangle item) {
    }

    @Override
    public Triangle update(Triangle item) {
        return null;
    }

    @Override
    public Triangle delete(Triangle item) {
        return null;
    }

    @Override
    public Collection<Triangle> selectAllTriangle() {
        return null;
    }

    @Override
    public Collection findOne1(Long id) {
        return null;
    }
}
