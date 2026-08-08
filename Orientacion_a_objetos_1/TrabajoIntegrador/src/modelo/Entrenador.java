package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Entrenador extends Persona {

	private int idEntrenador;

	private String estrategiaFavorita;
	
	/**
	 * @param idEntrenador;
	 * @param estrategiaFavorita
	 */
	
	/**
	 * @return the idEntrenador
	 */
	
	public int getIdEntrenador() {
		return super.getId();
	}


	public Entrenador(int id, String apellido, String nombre, int dni, LocalDate fechaNacimiento, int idEntrenador,
			String estrategiaFavorita) {
		super(id, apellido, nombre, dni, fechaNacimiento);
		this.idEntrenador = idEntrenador;
		this.estrategiaFavorita = estrategiaFavorita;
	}



	public void setIdEntrenador(int idEntrenador) {
		super.setId(idEntrenador);
	}



	public String getEstrategiaFavorita() {
		return estrategiaFavorita;
	}



	public void setEstrategiaFavorita(String estrategiaFavorita) {
		this.estrategiaFavorita = estrategiaFavorita;
	}



	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, estrategiaFavorita, fechaNacimiento, idEntrenador, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null || getClass() != obj.getClass())
	        return false;
	    Entrenador other = (Entrenador) obj;
	    return dni == other.dni 
	            && idEntrenador == other.idEntrenador
	            && Objects.equals(apellido, other.apellido)
	            && Objects.equals(nombre, other.nombre)
	            && Objects.equals(fechaNacimiento, other.fechaNacimiento)
	            && Objects.equals(estrategiaFavorita, other.estrategiaFavorita);
	}


	@Override
	public String toString() {
		return "Entrenador [idEntrenador=" + idEntrenador + ", estrategiaFavorita=" + estrategiaFavorita + "]";
	}


}
