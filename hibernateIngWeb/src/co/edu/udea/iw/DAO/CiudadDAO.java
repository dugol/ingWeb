package co.edu.udea.iw.DAO;

import co.edu.udea.iw.EXCEPTION.ClassException;
import co.edu.udea.iw.DTO.Ciudad;
import java.util.List;


/**
 * 
 * @author Daniel Uribe Giraldo- Daniel.uribeg@udea.edu.co
 * 
 */
public interface CiudadDAO {

	public void insertar(Ciudad ciudad) throws ClassException;
	public void actualizar(Ciudad ciudad) throws ClassException;
	public void eliminar(Ciudad ciudad) throws ClassException;
	public List<Ciudad> obtener() throws ClassException;
	
}
