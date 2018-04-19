package co.edu.udea.iw.bl.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.bl.ClienteBL;
import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.IWDaoException;
import co.edu.udea.iw.util.validations.Validaciones;

@Transactional
public class ClienteBlimpl implements ClienteBL {

	@Autowired
	ClienteDAO clienteDao;
	
	public ClienteBlimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Cliente> obtener() throws IWDaoException {
		
		return clienteDao.obtener();
	}

	@Override
	public Cliente insertar(Cliente cliente) throws IWDaoException {
		Validaciones validaciones= new Validaciones();
		boolean esCorreo=validaciones.isEmail(cliente.getCorreoElectronico());
		boolean cedulaVacia=validaciones.isTextoVacio(cliente.getCedula());
		boolean nombreVacio=validaciones.isTextoVacio(cliente.getNombres());
		boolean apellidoVacio=validaciones.isTextoVacio(cliente.getApellidos());
		cliente.setFechaCreacion(new Date());
		cliente.setEliminado(Boolean.FALSE);
		if(esCorreo==false || validaciones.isTextoVacio(cliente.getCorreoElectronico())) {
			throw new IWDaoException("El correo electronico es vacío o no corresponde a un Email");
		}
		if(cedulaVacia==true) {
			throw new IWDaoException("La cedula es vacía");
		}
		if(nombreVacio==true) {
			throw new IWDaoException("El Nombre es vacío");
		}
		if(apellidoVacio==true) {
			throw new IWDaoException("El apellido es vacío");
		}
		return clienteDao.insertar(cliente);
	}
	

}
