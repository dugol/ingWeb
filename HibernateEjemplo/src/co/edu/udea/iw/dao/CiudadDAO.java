package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.IWDaoException;

/**
 * Interface que define los metodos que va a proveer el dao de ciudad
 * @author Elver Suarez Alzate - seminarioingenieriaweb.udea@gmail.com
 *
 */
public interface CiudadDAO {
	
	/**
	 * Entrega la lista de ciudades existentes en la base de datos
	 * @return lista ciudades
	 * @throws IWDaoException Ocurre un error con la conexión.
	 */
	public List<Ciudad> obtener() throws IWDaoException;
	
	/**
	 * Entrega los datod de una ciudad dado su codigo
	 * @param codigo codigo de la ciudad a consultar
	 * @return una instancia de los datos de la ciudad obtenida, si no existe
	 * una ciudad con el codigo dado retorna null
	 * @throws IWDaoException ocurre un error con la base de datos
	 */
	public Ciudad obtener(Integer codigo) throws IWDaoException;
	
}
