package org.bta.lesson.lesson24;

import java.sql.*;
import java.util.*;

public class ClassWork {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:postgresql://pgctcd1-primary.db.int.kn:5432/um_uat_db";
        final String username = "um_uat";
        final String password = "ApVPQtdQeamGQ9Z";

        Connection connection = DriverManager.getConnection(url, username, password);
        List<Country> countries = new ArrayList<>();
        if (connection != null) {
            System.out.println("Connected to DB!!!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from country");
            while (resultSet.next()) {
                countries.add(mapToCountry(resultSet));
            }

            System.out.println(countries);

            List<Citizen> citizens = new ArrayList<>();
            Statement citizenSatement = connection.createStatement();
            ResultSet citizenRs = citizenSatement.executeQuery("select * from citizen");
            while (citizenRs.next()) {
                citizens.add(mapToCitizen(citizenRs));
            }
            System.out.println(citizens);
        }
    }

    private static Country mapToCountry(ResultSet resultSet) throws SQLException {
        Country fromDB = new Country();
        fromDB.setId(resultSet.getLong("id"));
        fromDB.setName(resultSet.getString("name"));
        fromDB.setDescription(resultSet.getString("discription"));
        fromDB.setCode(resultSet.getString("code"));
        return fromDB;
    }

    private static Citizen mapToCitizen(ResultSet resultSet) throws SQLException {
        Citizen fromDB = new Citizen();
        fromDB.setId(resultSet.getLong("id"));
        fromDB.setFirstName(resultSet.getString("firstName"));
        fromDB.setLastName(resultSet.getString("lastName"));
        fromDB.setBirthDate(resultSet.getDate("birth_day"));
        fromDB.setCity_id(resultSet.getLong("city_id"));
        return fromDB;
    }
}
