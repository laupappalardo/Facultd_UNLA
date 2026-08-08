package modelo;

public class Pasajero {

	private int idPasajero;
	private String apellido;
	private String nombre;
	private int dni;
	private boolean viajeroFrecuente;
	/**
	 * @param idPasajero
	 * @param apellido
	 * @param nombre
	 * @param dni
	 * @param viajeroFrecuente
	 */
	public Pasajero(int idPasajero, String apellido, String nombre, int dni, boolean viajeroFrecuente) {
		super();
		this.idPasajero = idPasajero;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.viajeroFrecuente = viajeroFrecuente;
	}
	/**
	 * @return the idPasajero
	 */
	public int getIdPasajero() {
		return idPasajero;
	}
	/**
	 * @param idPasajero the idPasajero to set
	 */
	public void setIdPasajero(int idPasajero) {
		this.idPasajero = idPasajero;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}
	/**
	 * @return the viajeroFrecuente
	 */
	public boolean isViajeroFrecuente() {
		return viajeroFrecuente;
	}
	/**
	 * @param viajeroFrecuente the viajeroFrecuente to set
	 */
	public void setViajeroFrecuente(boolean viajeroFrecuente) {
		this.viajeroFrecuente = viajeroFrecuente;
	}
	@Override
	public String toString() {
		return "Pasajero [idPasajero=" + idPasajero + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ ", viajeroFrecuente=" + viajeroFrecuente + "]";
	}
	
	

}
