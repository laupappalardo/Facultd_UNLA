package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private List<ItemCarrito> lstItemCarrito;
	
	public Carrito(int idCarrito, LocalDate fecha, LocalTime hora) {
		super();
		this.idCarrito = idCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.lstItemCarrito = new ArrayList<ItemCarrito>();
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<ItemCarrito> getLstItemCarrito() {
		return lstItemCarrito;
	}

	//No se incluye en el toString la lista
	//Se puede generar un deadlock
	@Override
	public String toString() {
		return "Carrito [idCarrito=" + idCarrito + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	//Metodo equals
	
	public boolean agregarItemCarrito(Producto producto, int cantidad) {
		int id = 1;
		if(!this.lstItemCarrito.isEmpty()) {
			id = this.lstItemCarrito.get(this.lstItemCarrito.size() - 1).getIdItem() + 1;
		}
		return this.lstItemCarrito.add(new ItemCarrito(id,producto,cantidad,this));
	}

}
