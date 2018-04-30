package co.edu.udea.iw.bl;

import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;

public interface UsuarioBL {
	
	public Usuario autenticar(String login, String contraseña) throws IWDaoException;

}
