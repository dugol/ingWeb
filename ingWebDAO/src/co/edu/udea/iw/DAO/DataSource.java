package co.edu.udea.iw.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import co.edu.udea.iw.EXCEPTION.ClassException;

/**
 * 
 * @author Daniel Uribe Giraldo- Daniel.uribeg@udea.edu.co
 *
 */
public class DataSource{

	private final String url = "jdbc:mysql://localhost:3306/ingWeb";
	private final String user = "root";
	private final String password = "root";

	public Connection getConnection() throws ClassException{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			//return con;
		} catch (ClassNotFoundException e) {
			throw new ClassException("No se ha encontrado el controlador de base de datos.");
			//System.out.println("No se ha encontrado el controlador de base de datos.");
			//System.out.println(e);
			

		} catch (SQLException e) {
			//System.out.println(e);
			throw new ClassException();
		}
		return con;
	}

}
