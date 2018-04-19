package co.edu.udea.iw.bl.impl;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.bl.ClienteBL;
import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringBeanConfigurationFile.xml")
@Transactional
public class ClienteBLImplTest {
	
	@Autowired
	ClienteBL clienteBL;

	@Test
	public void testObtener() {
		
	}
	
	
	@Test
	public void insertar() {
		Cliente cliente=null;
		Usuario usuarioCrea=null;
		try {
			cliente= new Cliente();
			usuarioCrea=new Usuario();
			cliente.setApellidos("Uribe2");
			cliente.setCedula("1234567891");
			cliente.setCorreoElectronico("daniel1@udea.edu.co");
			cliente.setNombres("Daniel1");
			usuarioCrea.setLogin("elver");
			cliente.setUsuarioCrea(usuarioCrea);
			cliente.setFechaCreacion(new Date());
			cliente.setEliminado(false);
			clienteBL.insertar(cliente);
		}catch(IWDaoException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	

}
