package co.edu.udea.iw.DTO;

import java.util.Date;

public class Cliente {
	private String cedula;
	private String nombres;
	private String apellidos;
	private String email;
	private Usuario usuarioCrea;
	private Date fechaCreacion;
	private Usuario UsuarioModifica;
	private Date fechaModificacion;
	private Integer eliminado;
	private Usuario usuarioElimina;
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




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Usuario getUsuarioCrea() {
		return usuarioCrea;
	}




	public void setUsuarioCrea(Usuario usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}




	public Date getFechaCreacion() {
		return fechaCreacion;
	}




	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}




	public Usuario getUsuarioModifica() {
		return UsuarioModifica;
	}




	public void setUsuarioModifica(Usuario usuarioModifica) {
		UsuarioModifica = usuarioModifica;
	}




	public Date getFechaModificacion() {
		return fechaModificacion;
	}




	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}




	public Integer getEliminado() {
		return eliminado;
	}




	public void setEliminado(Integer eliminado) {
		this.eliminado = eliminado;
	}




	public Usuario getUsuarioElimina() {
		return usuarioElimina;
	}




	public void setUsuarioElimina(Usuario usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}




	public Date getFechaEliminacion() {
		return fechaEliminacion;
	}




	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}




	public Cliente() {
		
	}

}
