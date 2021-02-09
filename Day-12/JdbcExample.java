import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
*  ExerciseProgram additional details
*	H2 database download location: https://www.h2database.com/html/main.html
*	Jar location: https://mvnrepository.com/artifact/com.h2database/h2/1.4.200
*
*/
public class JdbcExample {
	// Database Driver
	static final String JDBC_DRIVER = "org.h2.Driver";

	// URL & Credentials
	static final String JDBC_URL = "jdbc:h2:~/test";
	static final String USER = "sa";
	static final String PWD = "";

	// Query Statements
	static final String USER_REG_TABLE_CREATE_QUERY = "Create table User_Registration(ID INTEGER NOT NULL, FNAME VARCHAR(200), LNAME VARCHAR(200), AGE INTEGER, PRIMARY KEY(ID))";
	static final String USER_REG_TABLE_SAMPLE_DATA_INSERT_QUERY = "INSERT INTO User_Registration VALUES(100, 'ZARA','ALI', 25)";
	static final String USER_REG_TABLE_READ_QUERY = "SELECT * FROM USER_REGISTRATION";
	
	static final String USER_REG_TABLE_SAMPLE_UPDATE_QUERY = "UPDATE USER_REGISTRATION SET Age=22 where id=103";
	static final String USER_REG_TABLE_SAMPLE_DELETE_QUERY = "DELETE FROM USER_REGISTRATION where id=103";
	

	public static void main(String[] args) {
		System.out.println("Starting the JDBC example program. \n");
		try {
			// createUserRegTable();
			// insertUserRegSampleData();
			//readUserRegData();
			//updateUserRegSampleData();
			deleteUserRegSampleData();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nTerminating the program.");
	}

	private static void createUserRegTable() throws ClassNotFoundException, SQLException {
		// 1. Register JDBC Driver
		System.out.println("1. Registering the JDBC Driver");
		Class.forName(JDBC_DRIVER);

		// 2. Open a connection
		System.out.println("2. Opening a connection");
		Connection conn = DriverManager.getConnection(JDBC_URL, USER, PWD);

		// 3. Execute the query
		System.out.println("3. Executing the query");
		Statement stmt = conn.createStatement();
		String sql = USER_REG_TABLE_CREATE_QUERY;

		stmt.executeUpdate(sql);

		// 4. Clean up activity
		System.out.println("4. Starting the clean up activity");
		stmt.close();
		conn.close();
	}

	private static void insertUserRegSampleData() {// 1. Register JDBC Driver
		Connection conn = null;
		Statement stmt = null;
		try {
			System.out.println("1. Registering the JDBC Driver");
			Class.forName(JDBC_DRIVER);

			// 2. Open a connection
			System.out.println("2. Opening a connection");
			conn = DriverManager.getConnection(JDBC_URL, USER, PWD);

			// 3. Execute the query
			System.out.println("3. Executing the query");
			stmt = conn.createStatement();

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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 4. Clean up activity
		System.out.println("4. Starting the clean up activity");

	}

	private static void readUserRegData() {// 1. Register JDBC Driver
		Connection conn = null;
		Statement stmt = null;
		try {
			System.out.println("1. Registering the JDBC Driver");
			Class.forName(JDBC_DRIVER);

			// 2. Open a connection
			System.out.println("2. Opening a connection");
			conn = DriverManager.getConnection(JDBC_URL, USER, PWD);

			// 3. Execute the query
			System.out.println("3. Executing the query");
			stmt = conn.createStatement();

			String sql = USER_REG_TABLE_READ_QUERY;
			ResultSet rs = stmt.executeQuery(sql);

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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 4. Clean up activity
		System.out.println("4. Starting the clean up activity");

	}

	private static void updateUserRegSampleData() {// 1. Register JDBC Driver
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL, USER, PWD);
				Statement stmt = conn.createStatement();) {
			System.out.println("1. Registering the JDBC Driver");
			Class.forName(JDBC_DRIVER);
			
			// 2. Open a connection
			System.out.println("2. Opening a connection using try with resources");
			
			// 3. Execute the query
			System.out.println("3. Executing the query");
			String sql = USER_REG_TABLE_SAMPLE_UPDATE_QUERY;
			stmt.executeUpdate(sql);

			sql = USER_REG_TABLE_READ_QUERY;
			ResultSet rs = stmt.executeQuery(sql);

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
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 4. Clean up activity
		System.out.println("4. Starting the clean up activity");

	}

private static void deleteUserRegSampleData() {// 1. Register JDBC Driver
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL, USER, PWD);
				Statement stmt = conn.createStatement();) {
			System.out.println("1. Registering the JDBC Driver");
			Class.forName(JDBC_DRIVER);
			
			// 2. Open a connection
			System.out.println("2. Opening a connection using try with resources");
			
			// 3. Execute the query
			System.out.println("3. Executing the query");
			String sql = USER_REG_TABLE_SAMPLE_DELETE_QUERY;
			stmt.executeUpdate(sql);

			sql = USER_REG_TABLE_READ_QUERY;
			ResultSet rs = stmt.executeQuery(sql);

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
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 4. Clean up activity
		System.out.println("4. Starting the clean up activity");

	}

}
