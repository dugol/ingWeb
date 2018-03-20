package co.edu.udea.iw.DAO.IMPL;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.edu.udea.iw.DAO.CiudadDAO;
import co.edu.udea.iw.DAO.RolDAO;
import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.DTO.Rol;
import co.edu.udea.iw.EXCEPTION.ClassException;

class RolDAOImplTest {

	@Test
	void test() {
		RolDAO rol=null;
		List<Rol> roles=null;
			
		try {
			rol= new RolDAOImpl();
			roles=rol.obtener();
			assertTrue(roles.size()>0);
			
			
		}catch(ClassException e) {
		fail(e.getMessage());
		}
	}

}
