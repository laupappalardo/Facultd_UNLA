package modelo;

import java.time.LocalDate;

public class Partido {
	private int idPartido;
	private int fechaFixture;
	private LocalDate fecha;
	private Equipo equipoVisitante;
	private Equipo equipoLocal;
	private String estadio;
	private String resultado; 
	/**
	 * @param idPartido
	 * @param fechaFixture
	 * @param fecha
	 * @param equipoVisitante
	 * @param equipoLocal
	 * @param estadio
	 */
	public Partido(int idPartido, int fechaFixture, LocalDate fecha, Equipo equipoVisitante, Equipo equipoLocal,
			String estadio,String resultado) {
		this.idPartido = idPartido;
		this.fechaFixture = fechaFixture;
		this.fecha = fecha;
		this.equipoVisitante = equipoVisitante;
		this.equipoLocal = equipoLocal;
		this.estadio = estadio;
		this.resultado = resultado;
	}
	/**
	 * @return the idPartido
	 */
	public int getIdPartido() {
		return idPartido;
	}
	/**
	 * @param idPartido the idPartido to set
	 */
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	/**
	 * @return the fechaFixture
	 */
	public int getFechaFixture() {
		return fechaFixture;
	}
	/**
	 * @param fechaFixture the fechaFixture to set
	 */
	public void setFechaFixture(int fechaFixture) {
		this.fechaFixture = fechaFixture;
	}
	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the equipoVisitante
	 */
	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}
	/**
	 * @param equipoVisitante the equipoVisitante to set
	 */
	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	/**
	 * @return the equipoLocal
	 */
	public Equipo getEquipoLocal() {
		return equipoLocal;
	}
	/**
	 * @param equipoLocal the equipoLocal to set
	 */
	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	/**
	 * @return the estadio
	 */
	public String getEstadio() {
		return estadio;
	}
	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	@Override
	public String toString() {
		return "Partido [idPartido=" + idPartido + ", fechaFixture=" + fechaFixture + ", fecha=" + fecha
				+ ", equipoVisitante=" + equipoVisitante + ", equipoLocal=" + equipoLocal + ", estadio=" + estadio
				+ ", resultado=" + resultado + "]";
	}
	
	

}
