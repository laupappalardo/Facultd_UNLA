package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
//import java.util.ArrayList;

public class Medicion {

	private Estacion estacion;
	private LocalDate fecha;
	private LocalTime hora;
	private float temperatura;
	private float humedad;
	private float vientoVel;
	private String vientoDir;
	private float precipitacion;
	/**
	 * @param estacion
	 * @param fecha
	 * @param hora
	 * @param temperatura
	 * @param humedad
	 * @param vientoVel
	 * @param vientoDir
	 * @param precipitacion
	 */
	public Medicion(Estacion estacion, LocalDate fecha, LocalTime hora, float temperatura, float humedad,
			float vientoVel, String vientoDir, float precipitacion) {
		super();
		this.estacion = estacion;
		this.fecha = fecha;
		this.hora = hora;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.vientoVel = vientoVel;
		this.vientoDir = vientoDir;
		this.precipitacion = precipitacion;
	}
	/**
	 * @return the estacion
	 */
	public Estacion getEstacion() {
		return estacion;
	}
	/**
	 * @param estacion the estacion to set
	 */
	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
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
	 * @return the hora
	 */
	public LocalTime getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	/**
	 * @return the temperatura
	 */
	public float getTemperatura() {
		return temperatura;
	}
	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	/**
	 * @return the humedad
	 */
	public float getHumedad() {
		return humedad;
	}
	/**
	 * @param humedad the humedad to set
	 */
	public void setHumedad(float humedad) {
		this.humedad = humedad;
	}
	/**
	 * @return the vientoVel
	 */
	public float getVientoVel() {
		return vientoVel;
	}
	/**
	 * @param vientoVel the vientoVel to set
	 */
	public void setVientoVel(float vientoVel) {
		this.vientoVel = vientoVel;
	}
	/**
	 * @return the vientoDir
	 */
	public String getVientoDir() {
		return vientoDir;
	}
	/**
	 * @param vientoDir the vientoDir to set
	 */
	public void setVientoDir(String vientoDir) {
		this.vientoDir = vientoDir;
	}
	/**
	 * @return the precipitacion
	 */
	public float getPrecipitacion() {
		return precipitacion;
	}
	/**
	 * @param precipitacion the precipitacion to set
	 */
	public void setPrecipitacion(float precipitacion) {
		this.precipitacion = precipitacion;
	}
	@Override
	public String toString() {
		return "Medicion [estacion=" + estacion + ", fecha=" + fecha + ", hora=" + hora + ", temperatura=" + temperatura
				+ ", humedad=" + humedad + ", vientoVel=" + vientoVel + ", vientoDir=" + vientoDir + ", precipitacion="
				+ precipitacion + "]";
	}
	
	public float temperaturaCorregidaPorAltura() {
		float altura = estacion.getAltura();
		float correccion = (float) (temperatura + (altura*6.5) /1000); 
		
		return correccion;		
	}

	
}
