package org.bta.lesson.lesson24;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClassWork {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String username = "macbook";
        final String password = "Gettherefast1";

        Connection connection = DriverManager.getConnection(url, username, password);
        List<Country> countries = new ArrayList<>();
        if (connection != null) {
            System.out.println("Connected to DB");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from country");
            while (resultSet.next()) {
                countries.add(mapToCountry(resultSet));
            }
        }
        System.out.println(countries);

        List<Citizen> citizens = new ArrayList<>();
        Statement citizenStatement = connection.createStatement();
        ResultSet citizenRs = citizenStatement.executeQuery("select * from citizen");
        while (citizenRs.next()) {
            citizens.add(mapToCitizen(citizenRs));
        }
        System.out.println(citizens);
    }


    private static Country mapToCountry(ResultSet resultSet) throws SQLException {
        Country fromDB = new Country();
        fromDB.setName(resultSet.getString("name"));
        fromDB.setId(resultSet.getLong("id"));
        fromDB.setDescription(resultSet.getString("discription"));
        fromDB.setCode(resultSet.getString("code"));
        return fromDB;
    }

    private static Citizen mapToCitizen(ResultSet resultSet) throws SQLException {
        Citizen fromDB = new Citizen();
        fromDB.setFirstName(resultSet.getString("firstName"));
        fromDB.setLastName(resultSet.getString("lastName"));
        fromDB.setId(resultSet.getLong("id"));
        fromDB.setBirth_day(resultSet.getDate("birth_day"));
        fromDB.setCity_id(resultSet.getInt("city_id"));
        return fromDB;
    }
}
