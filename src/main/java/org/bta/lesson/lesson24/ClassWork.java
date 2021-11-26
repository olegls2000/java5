package org.bta.lesson.lesson24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassWork {
	public static void main(String[] args) throws SQLException {
		final String url = "jdbc:postgresql://pgctcd1-primary.db.int.kn:5432/um_uat_db";
		final String username = "um_uat";
		final String password = "ApVPQtdQeamGQ9Z";

		Connection connection = DriverManager.getConnection(url, username, password);
		if (connection != null) {
			System.out.println("Connected to DB!!!");
		}
	}
}
