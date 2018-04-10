import java.util.List;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dao.hibernate.CiudadDAOHibernate;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.IWDaoException;


public class ProbarConsulta {

	public static void main(String[] args) {
		
		CiudadDAO ciudadDao = null;
		
		try{
			ciudadDao = new CiudadDAOHibernate();
			
			List<Ciudad> ciudades = ciudadDao.obtener();
			for(Ciudad ciudad : ciudades){
				System.out.println("Nombre ciudad: " + ciudad.getNombre());
			}
			
		}catch (IWDaoException e){
			System.out.println(e.getMessage());
		}

	}

}
