package co.edu.udea.iw.DAO.IMPL;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.edu.udea.iw.DAO.UsuarioDAO;
import co.edu.udea.iw.DTO.Rol;
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
			int tamañoLista=listaUsuarios.size();
			for (int i = 0; i < tamañoLista; i++) {
				String nombre=listaUsuarios.get(i).getNombres();
				Rol rol=listaUsuarios.get(i).getRol();
				String nombreRol=rol.getNombre();
				System.out.println("Nombre:" + nombre + " Rol:" + nombreRol);
				
			}
			assertTrue(listaUsuarios.size()>0);
			
			
		}catch(ClassException e) {
			e.printStackTrace();
		fail(e.getMessage());
		}
	}
	
	@Test
	void test2() {
		UsuarioDAO dao=null;
		Usuario usuario=null;
			
		try {
			dao= new UsuarioDAOImpl();
			usuario=new Usuario();
			usuario.setNombres("Daniel");
			usuario.setApellidos("Uribe Giraldo");
			usuario.setLogin("dugol2");
			usuario.setContrasena("123456789");
			Rol rol=new Rol();
			rol.setNombre("Administrador");
			rol.setCodigo("ADM");
			usuario.setRol(rol);
			dao.insertar(usuario);
			
		}catch(ClassException e) {
			e.printStackTrace();
		fail(e.getMessage());
		}
	}
	
	

}
