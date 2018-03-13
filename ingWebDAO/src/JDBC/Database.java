package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ingWeb","root","root");
		/*PreparedStatement ps=con.prepareStatement("select * from ciudades");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("Nombre"));
		}*/
		PreparedStatement ps=con.prepareStatement("insert into ciudades(codigo,nombre,codigoArea) VALUES('11','Sabaneta','4')");
		ps.execute();
		ps.close();
		
		con.close();
		}catch(ClassNotFoundException e) {
			System.out.println("No se ha encontrado el controlador de base de datos.");
			System.out.println(e);
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
