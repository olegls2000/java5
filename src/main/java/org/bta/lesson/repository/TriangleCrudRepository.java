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
    public void create(Triangle item) throws SQLException {
        final String sql = "insert into triangle (a_id, b_id, c_id) values (?,?,?)";
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement statement = connection.prepareStatement(sql)
        ){
            statement.setLong(1,item.getA().getId());
            statement.setLong(2,item.getB().getId());
            statement.setLong(3,item.getC().getId());
            statement.executeUpdate(sql);

        }catch(SQLException e){
            e.printStackTrace();
        }
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
