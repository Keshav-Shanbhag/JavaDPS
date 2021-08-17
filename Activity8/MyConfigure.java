package Configure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConfigure {
		public static Connection getConnection() throws SQLException{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root", "Suviksha1997@");
			return con;
			
		}
}
