package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.IWDaoException;


/**
 * Inteface que describe los metodos que un cliente puede realizar contra
 * la base de datos
 * @author Elver Suarez Alzate
 *
 */
public interface ClienteDAO {
	
	/**
	 * Crea un nuevo cliente en el sistema
	 * @param cliente instancia del cliente a crear
	 * @return cliente insertado
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicación con la BD
	 */
	public Cliente insertar(Cliente cliente) throws IWDaoException;
	
	/**
	 * Modifica la información de un cliente en el sistema
	 * @param cliente instancia del cliente con los datos a modificar
	 * @return cliente modificado
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicación con la BD
	 */
	public Cliente modificar(Cliente cliente) throws IWDaoException;
	
	/**
	 * Elimina lógicamente un cliente en el sistema
	 * @param cliente instancia del cliente a eliminar
	 * @throws IWDaoException
	 */
	public void eliminar(Cliente cliente) throws IWDaoException;
	
	/**
	 * Entrega la lista de clientes activos en el sistema
	 * @return lista de clientes
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicación con la BD
	 */
	public List<Cliente> obtener() throws IWDaoException;
	
	/**
	 * Entrega la información de un cliente dada su cedula
	 * @param cedula identificación del cliente
	 * @return instancia con los datos del cliente
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicación con la BD
	 */
	public Cliente obtener(String cedula) throws IWDaoException;

}
