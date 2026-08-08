package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import funciones.Util;

public class Supermercado {
	
	private List<Producto> lstProducto;
	private List<Carrito> lstCarrito;

	public Supermercado() {
		super();
		//Las listas no entran como parametro, ya que se instancian en el constructor
		this.lstProducto = new ArrayList<Producto>();
		this.lstCarrito = new ArrayList<Carrito>();
	}

	//No generar set de listas, ya que no se setean
	
	public List<Producto> getLstProducto() {
		return lstProducto;
	}
	
	public List<Carrito> getLstCarrito() {
		return lstCarrito;
	}

	//Metodos de traer-agregar-modificar-eliminar-consultar van en la clase que contiene a las listas
	
	public Producto traerProducto(String nombre) {
		Producto p = null;
		int i = 0;
		//Las busquedas de un solo objeto se hacen con while con doble corte
		//NO USAR FOR
		while (i < this.lstProducto.size() && p == null) {
			if(this.getLstProducto().get(i).getProducto().equalsIgnoreCase(nombre)) {
				p = this.getLstProducto().get(i);
			}
			i++;
		}
		return p;
	}
	
	//Id no entra como parametro ya que se genera automaticamente en el metodo
	public boolean agregarProducto(String nombre, float precio)throws Exception{
		//Validaciones por duplicidad de objetos se hacen en el metodo
		if(this.traerProducto(nombre) != null) {
			throw new Exception("ERROR ya existe un producto con el mismo nombre");
		}
		//Primer id es 1
		int id = 1;
		//Si la lista contiene elementos sumar 1 al ultimo id 
		if(!this.lstProducto.isEmpty()) {
			id = this.lstProducto.get(this.lstProducto.size() - 1).getIdProducto() + 1;
		}
		return this.lstProducto.add(new Producto(id,nombre,precio));
	}

	public Carrito traerCarrito(LocalDate fecha, LocalTime hora) {
		Carrito c = null;
		int i = 0;
		while(i < this.lstCarrito.size() && c == null) {
			if(this.lstCarrito.get(i).getFecha().isEqual(fecha)
					&& this.lstCarrito.get(i).getHora().equals(hora)) {
				c = this.lstCarrito.get(i);
			}
			i++;
		}
		return c;
	}
	
	public boolean agregarCarrito(LocalDate fecha, LocalTime hora) {
		int id = 1;
		if(!this.lstCarrito.isEmpty()) {
			id = this.lstCarrito.get(this.lstCarrito.size() - 1).getIdCarrito() + 1;
		}
		return this.lstCarrito.add(new Carrito(id,fecha,hora));
	}
	
	//Metodo sobrecargado
	//Busca todos los carritos con fecha entre fechas desde y hasta
	public List<Carrito> traerCarrito(LocalDate fechaDesde, LocalDate fechaHasta){
		List<Carrito> aux = new ArrayList<Carrito>();
		//Se usa for, busca todos
		for(Carrito c: this.lstCarrito) {
			//Utilizamos el metodo estatico
			if(Util.fechaEntreFechas(c.getFecha(), fechaDesde, fechaHasta)) {
				aux.add(c);
			}
		}
		return aux;
	}
}
