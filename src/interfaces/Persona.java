package interfaces;

public class Persona {
	private String nombre;
	private String apellidos;
	private Loc localidad;
	private String direccion;
	public Persona(String nombre, String apellidos, Loc localidad,
			String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Loc getLocalidad() {
		return localidad;
	}
	public void setLocalidad(Loc localidad) {
		this.localidad = localidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
