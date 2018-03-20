package co.edu.udea.iw.DAO.IMPL;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.edu.udea.iw.DAO.CiudadDAO;
import co.edu.udea.iw.DAO.UsuarioDAO;
import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.EXCEPTION.ClassException;

class UsuarioDAOImplTest {

	@Test
	void test() {
		UsuarioDAO usuario=null;
		List<Usuario> listaUsuarios=null;
			
		try {
			usuario= new UsuarioDAOImpl();
			listaUsuarios=usuario.obtener();
			assertTrue(listaUsuarios.size()>0);
			
			
		}catch(ClassException e) {
			e.printStackTrace();
		fail(e.getMessage());
		}
	}

}
