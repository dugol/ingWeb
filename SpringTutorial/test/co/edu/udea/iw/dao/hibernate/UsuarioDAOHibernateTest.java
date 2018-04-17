package co.edu.udea.iw.dao.hibernate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dao.impl.UsuarioDAOimpl;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringBeanConfigurationFile.xml")
@Transactional
public class UsuarioDAOHibernateTest {

	@Autowired
	UsuarioDAO dao;
	
	@Test
	public void testObtener() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		//UsuarioDAO dao = null;
		
		try{
			
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
		//UsuarioDAO dao = null;
		
		try{
			
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
