package co.edu.udea.iw.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase dto para transportar los datos de un cliente. Mapea las columnas de la tabla Clientes
 * @author Elver Suarez Alzate
 *
 */
public class Cliente implements Serializable{
	
	/**
	 * Cedula del cliente
	 */
	private String cedula;
	/**
	 * Primer nombre del cliente
	 */
	private String nombres;
	/**
	 * Apellidos completos del cliente
	 */
	private String apellidos;
	/**
	 * Dirección de correo electrónico del cliente
	 */
	private String correoElectronico;
	/**
	 * Referencia del usuario del sistema que crea el cliente
	 */
	private Usuario usuarioCrea;
	/**
	 * Fecha de creación del cliente en el sistema
	 */
	private Date fechaCreacion;
	/**
	 * Referencia del usuario que modifica los datos del cliente en el sistema
	 */
	private Usuario usuarioModifica;
	/**
	 * Fecha en la que se realiza la última modificación del cliente
	 */
	private Date fechaModificacion;
	/**
	 * Determina si el cliente esta o no eliminado en el sistema. No se 
	 * realizará borrado fisico si no lógico.
	 */
	private Boolean eliminado;
	/**
	 * Referencia al usuario que elimino el cliente en el sistema
	 */
	private Usuario usuarioElimina;
	/**
	 * Fecha de eliminación del cliente en el sistema
	 */
	private Date fechaEliminacion;
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public Usuario  getUsuarioCrea() {
		return usuarioCrea;
	}
	public void setUsuarioCrea(Usuario  usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Usuario getUsuarioModifica() {
		return usuarioModifica;
	}
	public void setUsuarioModifica(Usuario  usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public Boolean getEliminado() {
		return eliminado;
	}
	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}
	public Usuario getUsuarioElimina() {
		return usuarioElimina;
	}
	public void setUsuarioElimina(Usuario  usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}
	public Date getFechaEliminacion() {
		return fechaEliminacion;
	}
	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}

}
