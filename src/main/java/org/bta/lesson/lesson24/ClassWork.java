package org.bta.lesson.lesson24;

import java.sql.*;

public class ClassWork {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String username = "postgres";
        final String password = "123456789";

        Connection connection = DriverManager.getConnection(url, username, password);
        if (connection != null) {
            System.out.println("Connected to DB!!!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from country");
            while (resultSet.next()){
                Long id = resultSet.getLong("id");
                String countryName = resultSet.getString("name");
                System.out.println(id +", " + countryName);
            }
        }
    }
}
