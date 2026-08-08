package modelo;

import java.util.List;

public class Estadistica {

	private int idEstadistica;
	private int cantidadGoles;
	private int asistencias;
	private int minutos;
	private Jugador jugador;
	private Partido partido;
	/**
	 * @param idEstadistica
	 * @param cantidadGoles
	 * @param asistencias
	 * @param minutos
	 * @param jugador
	 * @param partido
	 */

	/**
	 * @return the idEstadistica
	 */
	public Estadistica(int idEstadistica, int cantidadGoles, int asistencias, int minutos, Jugador jugador,
			Partido partido) {
		super();
		this.idEstadistica = idEstadistica;
		this.cantidadGoles = cantidadGoles;
		this.asistencias = asistencias;
		this.minutos = minutos;
		this.jugador = jugador;
		this.partido = partido;
	}
	
	public int getIdEstadistica() {
		return idEstadistica;
	}
	
	/**
	 * @param idEstadistica the idEstadistica to set
	 */
	public void setIdEstadistica(int  idEstadistica) {
		this.idEstadistica = idEstadistica;
	}
	/**
	 * @return the cantidadGoles
	 */
	public int getCantidadGoles() {
		return cantidadGoles;
	}
	/**
	 * @param cantidadGoles the cantidadGoles to set
	 */
	public void setCantidadGoles(int cantidadGoles) {
		this.cantidadGoles = cantidadGoles;
	}
	/**
	 * @return the asistencias
	 */
	public int getAsistencias() {
		return asistencias;
	}
	/**
	 * @param asistencias the asistencias to set
	 */
	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}
	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}
	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	/**
	 * @return the jugador
	 */
	public Jugador getJugador() {
		return jugador;
	}
	/**
	 * @param jugador the jugador to set
	 */
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	/**
	 * @return the partido
	 */
	public Partido getPartido() {
		return partido;
	}
	/**
	 * @param partido the partido to set
	 */
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
	public int calcularGolesPorJugador(Jugador jugador, List<Estadistica> estadisticas) {
	    int totalGoles = 0;
	    int i = 0;
	    while (i < estadisticas.size()) {
	        Estadistica e = estadisticas.get(i);
	        if (e.getJugador().equals(jugador)) {
	            totalGoles += e.getCantidadGoles();
	        }
	        i++;
	    }
	    return totalGoles;
	}

	public int calcularAsistenciasPorJugador(Jugador jugador, List<Estadistica> estadisticas) {
	    int totalAsistencias = 0;
	    int i = 0;
	    while (i < estadisticas.size()) {
	        Estadistica e = estadisticas.get(i);
	        if (e.getJugador().equals(jugador)) {
	            totalAsistencias += e.getAsistencias();
	        }
	        i++;
	    }
	    return totalAsistencias;
	}
	
	@Override
	public String toString() {
		return "Estadistica [idEstadistica=" + idEstadistica + ", cantidadGoles=" + cantidadGoles + ", asistencias="
				+ asistencias + ", minutos=" + minutos + ", jugador=" + jugador + ", partido=" + partido + "]";
	}
	
	

}
