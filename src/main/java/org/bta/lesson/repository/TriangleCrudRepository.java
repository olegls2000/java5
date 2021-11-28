package org.bta.lesson.repository;

import org.bta.lesson.exception.InvalidTriangleException;
import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

import java.sql.*;
import java.util.Collection;

public class TriangleCrudRepository implements CrudRepository{


    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "Sanek229";


    @Override
    public Point create(Point item) {
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
        return null;
    }

    @Override
    public Collection findOne(Long id) {
        return null;
    }

    @Override
    public Triangle create(Triangle item) {

        final String sql = "insert into triangle (a_id, b_id, c_id) values ("+ item.getA()
                + ", " + item.getB()
                + ", " + item.getC() + ")";
        Triangle result = null;
        try(Connection connection = DriverManager.getConnection((URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()){
                Triangle triangle = new Triangle();
                triangle.setA((Point) resultSet.getObject("a"));
                triangle.setA((Point) resultSet.getInt("b"));
                triangle.setA(resultSet.getInt("c"));
            }
        } catch(SQLException | InvalidTriangleException e){
            e.printStackTrace();
        }
        return null;
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
