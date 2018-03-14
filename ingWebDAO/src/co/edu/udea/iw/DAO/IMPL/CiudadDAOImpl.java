package co.edu.udea.iw.DAO.IMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import co.edu.udea.iw.DAO.CiudadDAO;
import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.DAO.DataSource;
import co.edu.udea.iw.EXCEPTION.ClassException;

/**
 * 
 * @author Daniel Uribe Giraldo-Daniel.uribeg@udea.edu.co
 * 
 * Ésta clase contiene el CRUD para la tabla de ciudades.
 *
 */

public class CiudadDAOImpl implements CiudadDAO {

	public CiudadDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Método de inserción de una nueva ciudad a la tabla ciudades
	 */
	@Override
	public void insertar(Ciudad ciudad) throws ClassException {
		Connection con = null;
		PreparedStatement ps = null;
		DataSource ds = DataSource.getInstancia();
		try {
			con = ds.getConeccion();
			ps = con.prepareStatement("INSERT INTO ciudades(codigo,Nombre,CodigoArea) VALUES (?,?,?)");
			ps.setInt(1,ciudad.getCodigo());
			ps.setString(2,ciudad.getNombre());
			ps.setString(3,ciudad.getCodigoArea());
			ps.execute();
		}catch(SQLException e)
		{
			throw new ClassException("Ha ocurrido un error en la base de datos",e);
		}
		finally {
			try {
				ps.close();
				con.close();
			}catch(SQLException e)
			{
				throw new ClassException("Ha ocurrido un error cerrando la conexión con la base de datos",e);
			}
		}

	}

	/**
	 * Método de actualización de una ciudad dentro de la tabla ciudades.
	 */
	@Override
	public void actualizar(Ciudad ciudad) throws ClassException {
		Connection con=null;
		PreparedStatement ps=null;
		DataSource ds=DataSource.getInstancia();
		try {
			con=ds.getConeccion();
			ps=con.prepareStatement("UPDATE ciudades SET Nombre=? , codigoArea=? WHERE codigo=?");
			ps.setString(1, ciudad.getNombre());
			ps.setString(2, ciudad.getCodigoArea());
			ps.setInt(3, ciudad.getCodigo());
			ps.execute();
			
		}catch(SQLException e){
			throw new ClassException();
			
		}finally {
			try {
				ps.close();
				con.close();
			}catch(SQLException e) {
				throw new ClassException();
			}
		}

	}

	/**
	 * Método para la eliminación de una ciudad dentro de la tabla ciudades.
	 */
	@Override
	public void eliminar(Ciudad ciudad) throws ClassException {
		Connection con=null;
		PreparedStatement ps=null;
		DataSource ds=DataSource.getInstancia();
		try {
			con=ds.getConeccion();
			ps=con.prepareStatement("DELETE from ciudades WHERE codigo=?");
			ps.execute();
			
		}catch(SQLException e) {
			throw new ClassException();
			
		}finally {
			try {
				ps.close();
				con.close();
			}catch(SQLException e) {
				throw new ClassException();
			}
		}

	}

	/**
	 * Método para obtener todas las ciudades dentro de la tabla ciudades.
	 */
	@Override
	public List<Ciudad> obtener() throws ClassException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Ciudad> ciudades=new ArrayList<Ciudad>();
		DataSource ds=DataSource.getInstancia();
		try {
			con=ds.getConeccion();
			ps=con.prepareStatement("select * from ciudades");
			rs=ps.executeQuery();
			while(rs.next()) {
				Ciudad ciudad= new Ciudad();
				ciudad.setCodigo(rs.getInt("codigo"));
				ciudad.setNombre(rs.getString("Nombre"));
				ciudad.setCodigoArea(rs.getString("codigoArea"));
				ciudades.add(ciudad);
			}
		}catch(SQLException e){
			throw new ClassException();
			
		}finally {
			try {
			rs.close();
			ps.close();
			con.close();
			}catch(SQLException e) {
				throw new ClassException();
			}
		}
		
		return ciudades;
	}

}
