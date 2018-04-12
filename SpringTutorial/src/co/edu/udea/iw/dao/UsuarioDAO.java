package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;


/**
 * Inteface que describe los metodos que un cliente puede realizar contra
 * la base de datos
 * @author Elver Suarez Alzate
 *
 */
public interface UsuarioDAO {
	
	/**
	 * Entrega la lista de usuarios en el sistema
	 * @return lista de usuarios
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicación con la BD
	 */
	public List<Usuario> obtener() throws IWDaoException;
	
	/**
	 * Entrega la información de un usuario dado su login
	 * @param login del usuario
	 * @return instancia con los datos del usuario
	 * @throws IWDaoException cuando ocurre cualquier error en la comunicación con la BD
	 */
	public Usuario obtener(String login) throws IWDaoException;

}
