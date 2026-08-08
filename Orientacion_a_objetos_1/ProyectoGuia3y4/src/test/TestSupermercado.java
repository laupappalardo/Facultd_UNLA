package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Carrito;
import modelo.ItemCarrito;
import modelo.Producto;
import modelo.Supermercado;

public class TestSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se crea una instancia de la clase que contiene las listas
		//Clase de "Negocio"
		Supermercado mercado = new Supermercado();
		//un try-catch para cada agregar/ para cada test
		try {
			System.out.println("Productos: ");
			mercado.agregarProducto("Producto 1", 1500);
			mercado.agregarProducto("Producto 2", 2500);
			mercado.agregarProducto("Producto 3", 3000);
			mercado.agregarProducto("Producto 4", 4500);
			//Muestro los agregados por pantalla
			for(Producto p : mercado.getLstProducto()) {
				System.out.println(p);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//Pruebo la excepcion por duplicidad
		try {
			mercado.agregarProducto("Producto 1", 2500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Pruebo la excepcion por atributo
		try {
			mercado.agregarProducto(" ", 2500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Carritos: ");
			mercado.agregarCarrito(LocalDate.of(2025, 8, 23), LocalTime.of(9,00));
			mercado.agregarCarrito(LocalDate.of(2025, 8, 23), LocalTime.of(11,00));
			mercado.agregarCarrito(LocalDate.of(2025, 8, 24), LocalTime.of(13,00));
			mercado.agregarCarrito(LocalDate.of(2025, 8, 24), LocalTime.of(14,15));
			mercado.agregarCarrito(LocalDate.of(2025, 8, 25), LocalTime.of(14,46));
			mercado.agregarCarrito(LocalDate.of(2025, 8, 25), LocalTime.of(14,47));
			for(Carrito c : mercado.getLstCarrito()) {
				System.out.println(c);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Items del Carrito con id: " + mercado.traerCarrito(LocalDate.of(2025, 8, 24), LocalTime.of(13,00)).getIdCarrito());
			//Para agregar un item, utilizo la instancia de negocio y el traer carrito
			//devuelve un objeto carrito con el que puedo acceder al agregar item
			//el producto que va como parametro es uno existente en el sistema, no se agrega uno nuevo con new
			mercado.traerCarrito(LocalDate.of(2025, 8, 24), LocalTime.of(13,00))
			.agregarItemCarrito(mercado.traerProducto("Producto 1"), 2);
			mercado.traerCarrito(LocalDate.of(2025, 8, 24), LocalTime.of(13,00))
			.agregarItemCarrito(mercado.traerProducto("Producto 2"), 1);
			//Muestro los items del carrito
			for(ItemCarrito c : mercado.traerCarrito(LocalDate.of(2025, 8, 24), LocalTime.of(13,00)).getLstItemCarrito()) {
				System.out.println(c);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Carritos entre las fechas 24/08/2025 y 25/08/2025");
			//Muestro los carritos entre fechas
			for(Carrito c : mercado.traerCarrito(LocalDate.of(2025, 8, 24), LocalDate.of(2025, 8, 25))) {
				System.out.println(c);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
