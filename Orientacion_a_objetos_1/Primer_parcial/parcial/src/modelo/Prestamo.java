package modelo;
import java.time.LocalDate;

public class Prestamo {

	private int id;
	private LocalDate fechaPrestamo;
	private Estudiante estudiante;
	private Libro libro;
	private LocalDate fechaDevolucion;
	private boolean devolucion;
	
	
	public Prestamo(int id, LocalDate fechaPrestamo, Estudiante estudiante,Libro libro) {
		super();
		this.id = id;
		this.fechaPrestamo = fechaPrestamo;
		this.estudiante = estudiante;
		this.libro = libro;
		this.fechaDevolucion = fechaPrestamo.plusDays(7);
		this.devolucion = false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	
	
	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}
	
	public boolean isDevolucion() {
		return devolucion;
	}
	public void setDevolucion(boolean devolucion) {
		this.devolucion = devolucion;
	}

	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", fechaPrestamo=" + fechaPrestamo + ", estudiante=" + estudiante + ", libro="
				+ libro + ", fechaDevolucion=" + fechaDevolucion + ", devolucion=" + devolucion + "]";
	}
	
	
	
	

}
