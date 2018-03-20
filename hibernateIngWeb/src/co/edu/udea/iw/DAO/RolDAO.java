package co.edu.udea.iw.DAO;

import java.util.List;

import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.EXCEPTION.ClassException;
import co.edu.udea.iw.DTO.Rol;

public interface RolDAO {
	public void insertar(Rol rol) throws ClassException;
	public void actualizar(Rol rol) throws ClassException;
	public void eliminar(Rol rol) throws ClassException;
	public List<Rol> obtener() throws ClassException;

}
