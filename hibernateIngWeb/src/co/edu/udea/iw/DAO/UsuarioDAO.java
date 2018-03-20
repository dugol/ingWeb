package co.edu.udea.iw.DAO;

import java.util.List;

import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.EXCEPTION.ClassException;

public interface UsuarioDAO {
	public void insertar(Usuario usuario) throws ClassException;
	public void actualizar(Usuario usuario) throws ClassException;
	public void eliminar(Usuario usuario) throws ClassException;
	public List<Usuario> obtener() throws ClassException;

}
