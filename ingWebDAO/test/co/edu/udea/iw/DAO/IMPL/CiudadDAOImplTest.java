package co.edu.udea.iw.DAO.IMPL;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import co.edu.udea.iw.DTO.Ciudad;

import org.junit.jupiter.api.Test;

import co.edu.udea.iw.DAO.CiudadDAO;
import co.edu.udea.iw.EXCEPTION.ClassException;

class CiudadDAOImplTest {

	@Test
	void testObtener() {
		CiudadDAO ciudad=null;
		List<Ciudad> listaCiudades=null;
			
		try {
			ciudad= new CiudadDAOImpl();
			listaCiudades=ciudad.obtener();
			assertTrue(listaCiudades.size()>0);
			
			
		}catch(ClassException e) {
		fail("not yet implemented");
		}
	}

}
