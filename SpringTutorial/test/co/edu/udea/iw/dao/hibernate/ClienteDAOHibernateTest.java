package co.edu.udea.iw.dao.hibernate;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.impl.ClienteDAOimpl;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.IWDaoException;

public class ClienteDAOHibernateTest {

	@Test
	public void testInsertar() {
		ClienteDAO dao=null;
		Usuario usuarioCrea=null;
		Cliente cliente=null;
		try {
			usuarioCrea=new Usuario();
			cliente=new Cliente();
			dao=new ClienteDAOimpl();
			cliente.setApellidos("Uribe");
			cliente.setCedula("123456789");
			cliente.setCorreoElectronico("daniel@udea.edu.co");
			cliente.setNombres("Daniel");
			usuarioCrea.setLogin("elver");
			cliente.setUsuarioCrea(usuarioCrea);
			cliente.setFechaCreacion(new Date());
			cliente.setEliminado(false);
			dao.insertar(cliente);
		}catch(IWDaoException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
