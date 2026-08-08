package modelo;

public class Aeropuerto {

	private int idAeropuerto;
	private String codAeropuerto;
	private String aeropuerto;
	/**
	 * @param idAeropuerto
	 * @param codAeropuerto
	 * @param aeropuerto
	 */
	public Aeropuerto(int idAeropuerto, String codAeropuerto, String aeropuerto) {
		super();
		this.idAeropuerto = idAeropuerto;
		this.codAeropuerto = codAeropuerto;
		this.aeropuerto = aeropuerto;
	}
	/**
	 * @return the idAeropuerto
	 */
	public int getIdAeropuerto() {
		return idAeropuerto;
	}
	/**
	 * @param idAeropuerto the idAeropuerto to set
	 */
	public void setIdAeropuerto(int idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	/**
	 * @return the codAeropuerto
	 */
	public String getCodAeropuerto() {
		return codAeropuerto;
	}
	/**
	 * @param codAeropuerto the codAeropuerto to set
	 */
	public void setCodAeropuerto(String codAeropuerto) {
		this.codAeropuerto = codAeropuerto;
	}
	/**
	 * @return the aeropuerto
	 */
	public String getAeropuerto() {
		return aeropuerto;
	}
	/**
	 * @param aeropuerto the aeropuerto to set
	 */
	public void setAeropuerto(String aeropuerto) {
		this.aeropuerto = aeropuerto;
	}
	@Override
	public String toString() {
		return "Aeropuerto [idAeropuerto=" + idAeropuerto + ", codAeropuerto=" + codAeropuerto + ", aeropuerto="
				+ aeropuerto + "]";
	}
	
	

}
