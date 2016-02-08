package database;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {

	private static String url = "jdbc:mysql://localhost:3306/companydb";
	private static String username = "student";
	private static String password = "student";
	private static Connection conn;

	public static ArrayList<ArrayList<String>> table;

	public static ArrayList<String> row = new ArrayList<>();

	public ArrayList<ArrayList<String>> databaseconnection(String s) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password);
		String sqlText = s;
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sqlText);
		ResultSetMetaData rs1 = rs.getMetaData();
		table = new ArrayList<>();
		//int uc = stmt.executeUpdate(sqlText);

		System.out.println(rs1.getColumnCount());
        
		ArrayList<String> header = new ArrayList<>();
        
        for (int col = 1; col <= (rs1.getColumnCount()); col++) {
            header.add(rs.getMetaData().getColumnName(col));
           }
        table.add(header);
		
        while (rs.next()) {

			row = new ArrayList<>();
			for (int i = 1; i < rs1.getColumnCount() + 1; i++)

			{

				// System.out.println(rs.getString(1) + " " + rs.getString(2) +
				// " " + rs.getString(3));
				row.add(rs.getString(i));
				// System.out.println(i);
				System.out.println(rs.getString(i));

			}

			table.add(row);

		}

		for (ArrayList<String> row : table) {
			for (String string : row) {

				System.out.println(string);
			}

		}
		// System.out.println(table.get(0).to);
		rs.close();
		conn.close();
		return table;
	}
	
	public int getUpdate (String s) throws SQLException, ClassNotFoundException {
		
		System.out.println(s);
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password);
		String sqlText = s;
		Statement stmt = conn.createStatement();
		
		int update = 0;
		update = stmt.executeUpdate(s);
		return update;
	}

}
