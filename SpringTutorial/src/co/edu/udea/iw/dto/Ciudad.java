package co.edu.udea.iw.dto;

/**
 * Clase dto para los datos de las ciudades
 * @author Elver Suarez Alzate
 *
 */
public class Ciudad {
	
	/**
	 * Codigo de la ciudad
	 */
	private Integer codigo;
	/**
	 * Nombre completo de la ciudad
	 */
	private String nombre;
	/**
	 * codigo del area en la que esta ubicada la ciudad
	 */
	private String codigoArea;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

}
