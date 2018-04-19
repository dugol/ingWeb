package co.edu.udea.iw.bl;

import co.edu.udea.iw.exception.IWDaoException;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;

public interface ClienteBL {

	public List<Cliente> obtener() throws IWDaoException;
	public Cliente insertar(Cliente cliente) throws IWDaoException;
}
