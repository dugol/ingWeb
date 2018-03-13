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
 */
public class CiudadDAOImpl implements CiudadDAO {

	public CiudadDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertar(Ciudad ciudad) throws ClassException {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Ciudad ciudad) throws ClassException {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Ciudad ciudad) throws ClassException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Ciudad> obtener() throws ClassException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Ciudad> ciudades=new ArrayList<Ciudad>();
		DataSource ds=new DataSource();
		try {
			con=ds.getConnection();
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
