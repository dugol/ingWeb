package co.edu.udea.iw.bl.impl;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.iw.bl.UsuarioBL;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;
import co.edu.udea.iw.util.encode.Cifrar;
import co.edu.udea.iw.util.validations.Validaciones;

public class UsuarioBLimpl implements UsuarioBL {
	
	@Autowired
	UsuarioDAO usuarioDAO;

	public UsuarioBLimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Usuario autenticar(String login, String contraseña) throws IWDaoException {
		Usuario usuario=null;
		Cifrar cifra= new Cifrar();
		
		usuario=usuarioDAO.obtener(login);
		if(usuario==null) {
			throw new IWDaoException("Usuario y/o contraseña inválida");
		}
		if(!usuario.getPassword().equals(contraseña)) {
			throw new IWDaoException("Usuario y/o contraseña inválida");
		}
		
		return usuario;
		
	}

}
