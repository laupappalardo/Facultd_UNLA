package modelo;
import java.time.LocalDate;
import java.time.LocalTime;

public class Metrica {

	private int valor;
	private LocalDate fecha;
	private LocalTime hora;
	/**
	 * @param valor
	 * @param fecha
	 * @param hora
	 */
	public Metrica(int valor, LocalDate fecha, LocalTime hora) {
		super();
		this.valor = valor;
		this.fecha = fecha;
		this.hora = hora;
	}
	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
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
	@Override
	public String toString() {
		return "Metrica [valor=" + valor + ", fecha=" + fecha + ", hora=" + hora + "]";
	}

	
	
}
