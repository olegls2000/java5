package org.bta.lesson.lesson24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassWork {


    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String username = "Java5-db";
        final String password = "Sanek229";

        Connection connection = DriverManager.getConnection(url, username, password);
        if( connection != null){
            System.out.println("Connected to DataBase!");
        }
    }
}
