import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCondensedCodeExample2 {
	// Database Driver
	static final String JDBC_DRIVER = "org.h2.Driver";

	// URL & Credentials
	static final String JDBC_URL = "jdbc:h2:~/test";
	static final String USER = "sa";
	static final String PWD = "";

	// SQL Statements
	static final String USER_REG_TABLE_CREATE_QUERY = "Create table User_Registration(ID INTEGER NOT NULL, FNAME VARCHAR(200), LNAME VARCHAR(200), AGE INTEGER, PRIMARY KEY(ID))";
	static final String USER_REG_TABLE_SAMPLE_DATA_INSERT_QUERY = "INSERT INTO User_Registration VALUES(100, 'ZARA','ALI', 25)";
	static final String USER_REG_TABLE_READ_QUERY = "SELECT * FROM USER_REGISTRATION";
	static final String USER_REG_TABLE_SAMPLE_UPDATE_QUERY = "UPDATE USER_REGISTRATION SET Age=22 where id=103";
	static final String USER_REG_TABLE_SAMPLE_DELETE_QUERY = "DELETE FROM USER_REGISTRATION where id=103";

	public static void main(String[] args) {
		System.out.println("Starting the JDBC example program. \n");
		try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PWD);
				Statement stmt = conn.createStatement();) {
			// 1. Register JDBC Driver
			System.out.println("1. Registering the JDBC Driver");
			Class.forName(JDBC_DRIVER);

			// 2. Open a connection
			System.out.println("2. Opening a connection using try with resources");

			// 3. Execute the query
			System.out.println("3. Executing the query");

			createUserRegTable(stmt); // Create Table
			insertUserRegSampleData(stmt); // Insert Data
			readUserRegData(stmt); // Read data from table
			updateUserRegSampleData(stmt); // Update data in the table
			deleteUserRegSampleData(stmt); // Delete record from table
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 4. Clean up activity
		System.out.println("4. The clean up activity is already taken care by try with resources block.");

		System.out.println("\nTerminating the program.");
	}

	private static void createUserRegTable(Statement stmt) throws ClassNotFoundException, SQLException {
		String sql = USER_REG_TABLE_CREATE_QUERY;
		stmt.executeUpdate(sql);
		System.out.println("Table Created.");
	}

	private static void insertUserRegSampleData(Statement stmt) throws SQLException {
		String sql = USER_REG_TABLE_SAMPLE_DATA_INSERT_QUERY;
		stmt.executeUpdate(sql);

		sql = "INSERT INTO User_Registration VALUES(101, 'Ayan','Ghosh', 32)";
		stmt.executeUpdate(sql);

		sql = "INSERT INTO User_Registration VALUES(102, 'Balaji','M.S.', 35)";
		stmt.executeUpdate(sql);

		sql = "INSERT INTO User_Registration VALUES(103, 'Mohit','Gupta', 20)";
		stmt.executeUpdate(sql);

		sql = "INSERT INTO User_Registration VALUES(104, 'Shehnaz','Khan', 25)";
		stmt.executeUpdate(sql);

		System.out.println("Sample data inserted in the table.");
		readUserRegData(stmt); // Read and Print the ResultSet
	}

	private static void readUserRegData(Statement stmt) throws SQLException {
		System.out.println("Reading the data in the table");
		String sql = USER_REG_TABLE_READ_QUERY;
		ResultSet rs = stmt.executeQuery(sql);

		printResultSet(rs); // Print the ResultSet
	}

	private static void updateUserRegSampleData(Statement stmt) throws SQLException {
		String sql = USER_REG_TABLE_SAMPLE_UPDATE_QUERY;
		stmt.executeUpdate(sql);
		System.out.println("A Record is updated in the table.");
		readUserRegData(stmt); // Read and Print the ResultSet
	}

	private static void deleteUserRegSampleData(Statement stmt) throws SQLException {
		String sql = USER_REG_TABLE_SAMPLE_DELETE_QUERY;
		stmt.executeUpdate(sql);
		System.out.println("A Record is deleted from the table.");

		readUserRegData(stmt); // Read and Print the ResultSet
	}

	private static void printResultSet(ResultSet rs) throws SQLException {
		// Go through the resultset
		while (rs.next()) {
			// Retrieve by column
			int id = rs.getInt("id");
			int age = rs.getInt("age");
			String fName = rs.getString("fname");
			String lName = rs.getString("lname");

			// Print values
			System.out.print("ID: " + id);
			System.out.print(", Age: " + age);
			System.out.println(", Name: " + fName + " " + lName);
		}
		rs.close();
	}

}
