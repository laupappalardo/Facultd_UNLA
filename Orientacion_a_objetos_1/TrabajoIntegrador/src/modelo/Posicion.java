package modelo;

public class Posicion {
	private Equipo equipo;
	private int puntos;
	/**
	 * @param equipo
	 * @param puntos
	 */
	public Posicion(Equipo equipo, int puntos) {
		super();
		this.equipo = equipo;
		this.puntos = puntos;
	}
	/**
	 * @return the equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}
	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	/**
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}
	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Posicion [equipo=" + equipo + ", puntos=" + puntos + "]";
	}
	
	public void sumarPuntos(int p) { this.puntos += p; }
	
}
