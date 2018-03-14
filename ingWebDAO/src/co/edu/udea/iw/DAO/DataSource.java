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
 * Clase encargada de entregar una coneccion exitosa con la base de datos.
 */
public class DataSource{

	private final String url = "jdbc:mysql://localhost:3306/ingWeb";
	private final String user = "root";
	private final String password = "root";
	private static DataSource dataSource=null;
	
	private DataSource() {}

	/**
	 * Éste método retorna un objeto de coneccion a la base de datos o retorna una excepcion en caso de error.
	 * @return objeto de la clase Conecction.
	 * @throws ClassException
	 */
	public Connection getConeccion() throws ClassException{
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
	
	/**
	 * Éste método se encarga de comprobar las instancias de este clase usando el patrón Singleton
	 * @return Retorna un objeto DataSource sólo si ya no existe uno.
	 */
	public static DataSource getInstancia(){
		if(dataSource==null)
		{
			dataSource = new DataSource(); //Realiza la única instancia posible de la clase
		}
		return dataSource;
	}

}
