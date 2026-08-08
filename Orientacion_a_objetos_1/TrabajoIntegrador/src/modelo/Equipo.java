package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private int idEquipo;
	private String nombre;
	private String codigo;
	private List<Jugador> lstJugador;
	private Entrenador entrenador;
	private LocalDate fundacion;
	/**
	 * @param idEquipo
	 * @param nombre
	 * @param codigo
	 * @param lstJugador
	 * @param entrenador
	 * @param fundacion
	 */
	public Equipo(int idEquipo,String nombre, Entrenador entrenador,
			LocalDate fundacion) {
		
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		this.codigo = generarCodigo(nombre);
		this.lstJugador = new ArrayList<Jugador>();
		this.entrenador = entrenador;
		this.fundacion = fundacion;
	}
	/**
	 * @return the idEquipo
	 */
	
	private String generarCodigo(String nombre) {
	        return nombre.length() >= 3 ? nombre.substring(0, 3).toUpperCase() : nombre.toUpperCase();
    }
	 
	public int getIdEquipo() {
		return idEquipo;
	}
	/**
	 * @param idEquipo the idEquipo to set
	 */
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the lstJugador
	 */
	public List<Jugador> getLstJugador() {
		return lstJugador;
	}
	/**
	 * @param lstJugador the lstJugador to set
	 */
	public void setLstJugador(List<Jugador> lstJugador) {
		this.lstJugador = lstJugador;
	}
	/**
	 * @return the entrenador
	 */
	public Entrenador getEntrenador() {
		return entrenador;
	}
	/**
	 * @param entrenador the entrenador to set
	 */
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	/**
	 * @return the fundacion
	 */
	public LocalDate getFundacion() {
		return fundacion;
	}
	/**
	 * @param fundacion the fundacion to set
	 */
	public void setFundacion(LocalDate fundacion) {
		this.fundacion = fundacion;
	}
	@Override
	public String toString() {
		return "Equipo [idEquipo=" + idEquipo + ", nombre=" + nombre + ", codigo=" + codigo + ", lstJugador="
				+ lstJugador + ", entrenador=" + entrenador + ", fundacion=" + fundacion + "]";
	}
	
	public boolean eliminarJugador(Jugador jugador) {
		return lstJugador.remove(jugador);
	}
	
	public float calcularAlturaPromedio() {
	    float sumaAltura = 0;
	    int cantidadValidos = 0;
	    int i = 0;
	    
	    while(i < lstJugador.size()) {
	        Jugador jugadorActual = lstJugador.get(i);
	        if(jugadorActual != null) {
	            sumaAltura += jugadorActual.getEstatura();
	            cantidadValidos++;
	        }
	        i++;
	    }
	    
	    if(cantidadValidos == 0) {
	        return 0;
	    }
	    return sumaAltura / cantidadValidos;
	}
	
	
}
