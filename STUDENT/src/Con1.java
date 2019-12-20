import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Con1 
{
	Connection con =null;
	public Con1() throws ClassNotFoundException, SQLException
	{
		
	
		String username="root";
		String password="root";
		String jdbcurl="jdbc:mysql://localhost:3306/employee";
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(jdbcurl,username,password);
		
	}
}
