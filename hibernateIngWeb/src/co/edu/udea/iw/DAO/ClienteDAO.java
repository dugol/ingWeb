package co.edu.udea.iw.DAO;

import java.util.List;

import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.EXCEPTION.ClassException;

public interface ClienteDAO {
	public void insertar(Cliente cliente) throws ClassException;
	public void actualizar(Cliente cliente) throws ClassException;
	public void eliminar(Cliente cliente) throws ClassException;
	public List<Cliente> obtener() throws ClassException;

}
