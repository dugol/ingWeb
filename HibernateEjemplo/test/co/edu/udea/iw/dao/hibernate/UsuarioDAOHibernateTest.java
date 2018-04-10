package co.edu.udea.iw.dao.hibernate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;

public class UsuarioDAOHibernateTest {

	@Test
	public void testObtener() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		UsuarioDAO dao = null;
		
		try{
			dao = new UsuarioDAOHibernate();
			
			usuarios = dao.obtener();
			
			for(Usuario usuario: usuarios){
				System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
				System.out.println("Login: " + usuario.getLogin());
				System.out.println("Nombre: " + usuario.getNombres());
				System.out.println("Apellidos: " + usuario.getApellidos());
				System.out.println("Rol: " + usuario.getRol().getNombre());
				System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
			}
			
			assertTrue(usuarios.size()>0);
		}catch(IWDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	//@Test
	public void testObtenerString() {
		Usuario usuario = null;
		UsuarioDAO dao = null;
		
		try{
			dao = new UsuarioDAOHibernate();
			
			usuario = dao.obtener("elver");
			
				System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
				System.out.println("Login: " + usuario.getLogin());
				System.out.println("Nombre: " + usuario.getNombres());
				System.out.println("Apellidos: " + usuario.getApellidos());
				System.out.println("Rol: " + usuario.getRol().getNombre());
				System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
			
			assertNotNull(usuario);
		}catch(IWDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
