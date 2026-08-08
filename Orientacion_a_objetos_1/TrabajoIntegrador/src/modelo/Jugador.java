package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Jugador extends Persona {
	private int idJugador;
	private float estatura;
	private float peso;
	private int posicion;
	private int nroCamiseta;
	/**
	 * @param estatura
	 * @param peso
	 * @param posicion
	 * @param nroCamiseta
	 */
	
	
	/**
	 * @return the idJugador
	 */
	
	public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
	


	public Jugador(int id, String apellido, String nombre, int dni, LocalDate fechaNacimiento, int idJugador,
			float estatura, float peso, int posicion, int nroCamiseta) throws Exception {
		super(id, apellido, nombre, dni, fechaNacimiento);
		this.idJugador = idJugador;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
		this.nroCamiseta = nroCamiseta;
		
		if(getEdad()<18) {
			throw new Exception("El jugador debe ser mayor de edad");
		}
	}



	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getNroCamiseta() {
		return nroCamiseta;
	}

	public void setNroCamiseta(int nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(estatura, nroCamiseta, peso, posicion);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Float.floatToIntBits(estatura) == Float.floatToIntBits(other.estatura)
				&& nroCamiseta == other.nroCamiseta && Float.floatToIntBits(peso) == Float.floatToIntBits(other.peso)
				&& posicion == other.posicion;
	}


	public int getIdJugador() {
		return super.getId();
	}

	public void setIdJugador(int idJugador) {
		 super.setId(idJugador);
	}

	@Override
	public String toString() {
		return "Jugador [idJugador=" + idJugador + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
				+ posicion + ", nroCamiseta=" + nroCamiseta + "]";
	}


}
