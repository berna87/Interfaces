package interfaces;

public class Jugador {
	private String nombre;
	private String equipo;
	public Jugador(String nombre, String equipo) {
		this.nombre = nombre;
		this.equipo = equipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	
}
