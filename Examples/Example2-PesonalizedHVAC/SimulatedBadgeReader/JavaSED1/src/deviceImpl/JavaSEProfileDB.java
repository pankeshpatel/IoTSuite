package deviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

import framework.*;

public class JavaSEProfileDB implements IProfileDB {

	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private TempStruct tempPreference;

	public JavaSEProfileDB() {

		try {
			// this will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");

			// setup the connection with the DB.
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost/feedback?"
							+ "user=root&password=admin");
			// statements allow to issue SQL queries to the database
			statement = (Statement) connect.createStatement();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

	}

	@Override
	public void setprofile(String newIndex, TempStruct newprofileValue) {
		// This is used to insert data into database.
	}

	@Override
	public TempStruct getprofile(String index) {

		try {
			// resultSet gets the result of the SQL query
			resultSet = statement
					.executeQuery("SELECT * FROM user.profiledb WHERE id = "
							+ index);
			resultSet.next();

			int tempValue = resultSet.getInt("tempvalue");
			String unitOfMeasurement = resultSet.getString("uom");

			tempPreference = new TempStruct(tempValue, unitOfMeasurement);

		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

		return tempPreference;
	}

}