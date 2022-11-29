package com.curso.v8;

import java.sql.*;

public class ConexionWithResource {

	public static void main(String[] args) throws SQLException {

		try (Connection conn = getConnection(); 
				Statement stmt = conn.createStatement()) {
			// Regresa un JDBC Connection

			ResultSet rs = stmt.executeQuery("select * from empleado");
			// ejecuta consulta
			// cierra rs, stmt, conn
			// interta en pojos
		} 
	}

	static Connection getConnection() {
		return null;
	}

	public static void viewTable(Connection con) throws SQLException {

		String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

		try (Statement stmt = con.createStatement()) {
			
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				String coffeeName = rs.getString("COF_NAME");
				int supplierID = rs.getInt("SUP_ID");
				float price = rs.getFloat("PRICE");
				int sales = rs.getInt("SALES");
				int total = rs.getInt("TOTAL");

				System.out.println(coffeeName + ", " + supplierID + ", " + price + ", " + sales + ", " + total);
			}
		} 
	}

}