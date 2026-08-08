package modelo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Vuelo {

	private int idVuelo;
	private LocalDate fecha;
	private LocalTime horaSalida;
	private LocalTime horaLlegada;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;
	private ArrayList<Pasajero> lstPasajero;
	/**
	 * @param idVuelo
	 * @param fecha
	 * @param horaSalida
	 * @param horaLlegada
	 * @param aeropuertoSalida
	 * @param aeropuertoLlegada
	 * @param lstPasajero
	 */
	public Vuelo(int idVuelo, LocalDate fecha, LocalTime horaSalida, LocalTime horaLlegada, Aeropuerto aeropuertoSalida,
			Aeropuerto aeropuertoLlegada) {
		super();
		this.idVuelo = idVuelo;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.aeropuertoSalida = aeropuertoSalida;
		this.aeropuertoLlegada = aeropuertoLlegada;
		this.lstPasajero = new ArrayList<Pasajero>();
	}
	/**
	 * @return the idVuelo
	 */
	public int getIdVuelo() {
		return idVuelo;
	}
	/**
	 * @param idVuelo the idVuelo to set
	 */
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
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
	 * @return the horaSalida
	 */
	public LocalTime getHoraSalida() {
		return horaSalida;
	}
	/**
	 * @param horaSalida the horaSalida to set
	 */
	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}
	/**
	 * @return the horaLlegada
	 */
	public LocalTime getHoraLlegada() {
		return horaLlegada;
	}
	/**
	 * @param horaLlegada the horaLlegada to set
	 */
	public void setHoraLlegada(LocalTime horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	/**
	 * @return the aeropuertoSalida
	 */
	public Aeropuerto getAeropuertoSalida() {
		return aeropuertoSalida;
	}
	/**
	 * @param aeropuertoSalida the aeropuertoSalida to set
	 */
	public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
		this.aeropuertoSalida = aeropuertoSalida;
	}
	/**
	 * @return the aeropuertoLlegada
	 */
	public Aeropuerto getAeropuertoLlegada() {
		return aeropuertoLlegada;
	}
	/**
	 * @param aeropuertoLlegada the aeropuertoLlegada to set
	 */
	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
		this.aeropuertoLlegada = aeropuertoLlegada;
	}
	/**
	 * @return the lstPasajero
	 */
	public ArrayList<Pasajero> getLstPasajero() {
		return lstPasajero;
	}
	/**
	 * @param lstPasajero the lstPasajero to set
	 */
	public void setLstPasajero(ArrayList<Pasajero> lstPasajero) {
		this.lstPasajero = lstPasajero;
	}
	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", fecha=" + fecha + ", horaSalida=" + horaSalida + ", horaLlegada="
				+ horaLlegada + ", aeropuertoSalida=" + aeropuertoSalida + ", aeropuertoLlegada=" + aeropuertoLlegada
				+ ", lstPasajero=" + lstPasajero + "]";
	}
	
	public int calcularTiempoVuelo() {
		
		int horaInicial = horaSalida.getHour();
		int minInicial = horaSalida.getMinute();
		int horaFinal = horaLlegada.getHour();
		int minutoFinal = horaLlegada.getMinute();
		
		int minutoTotal = (60-minInicial) + (horaFinal-horaInicial-1)*60 + (minutoFinal);
		return minutoTotal;
	}
	
	public boolean agregar(Pasajero pasajero) {
		
		lstPasajero.add(pasajero);
		return true;
	}
	
}
