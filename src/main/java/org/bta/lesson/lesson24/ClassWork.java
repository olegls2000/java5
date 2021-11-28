package org.bta.lesson.lesson24;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClassWork {


    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String username = "postgres";
        final String password = "Sanek229";

        Connection connection = DriverManager.getConnection(url, username, password);

        List<Country> countries = new ArrayList<>();


        if (connection != null) {
            System.out.println("Connected to DataBase!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from country");
            while (resultSet.next()) {
                countries.add(mapToEntityCountry(resultSet));
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
    }

    private static Country mapToEntityCountry(ResultSet resultSet) throws SQLException {
        Country fromDB = new Country();
        fromDB.setId(resultSet.getLong("id"));
        fromDB.setCode(resultSet.getString(3));
        fromDB.setCountryName(resultSet.getString("countryName"));
        fromDB.setDiscription(resultSet.getString("discription"));

        return fromDB;
    }

    private static Citizen mapToCitizen(ResultSet resultSet) throws SQLException {
        Citizen fromDB = new Citizen();
        fromDB.setId(resultSet.getLong("id"));
        fromDB.setFirstName(resultSet.getString("firstName"));
        fromDB.setLastName(resultSet.getString("lastName"));
        fromDB.setCity_id(resultSet.getLong("city_id"));
        fromDB.setBirth_day(resultSet.getDate("birth_day"));

        return fromDB;
    }
}
