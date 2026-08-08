package test;

import modelo.AerolineasArgentinas;
import modelo.Aeropuerto;
import modelo.Pasajero;
import modelo.Vuelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class TestTema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AerolineasArgentinas aa = new AerolineasArgentinas();
	
		System.out.println("Resolucion punto 1");
		try { aa.agregarAeropuerto("CRD", "Comodoro Rivadavia");
			} catch(Exception e) {e.getMessage();}
		try {aa.agregarAeropuerto("BUE", "Buenos Aires");
			} catch(Exception e) {e.getMessage();}
		try {aa.agregarAeropuerto("COR", "Cordoba");
		} catch(Exception e) {e.getMessage();}
		try {aa.agregarAeropuerto("BRC", "Bariloche");
		} catch(Exception e) {e.getMessage();}		
		try {aa.agregarAeropuerto("3JUJ", "Jujuy");
		} catch(Exception e) {System.out.println(e.getMessage());}
		
		for(Aeropuerto a : aa.getLstAeropuertos()) {
			System.out.println(a);}
	
	
		System.out.println("Resolucion punto 2");
		Aeropuerto a1 = aa.traerAeropuerto("BUE");
		System.out.println(a1);
		 
		System.out.println("Resolucion punto 3");
		aa.agregarPasajero("Ruina", "Oscar", 11111111, false);
		aa.agregarPasajero("Scordamaglia", "Ezequiel", 2222222, true);
		aa.agregarPasajero("Siciliano", "Gustavo", 333333333, true);
		aa.agregarPasajero("Vranic", "Alejandra", 3333333, true);
		aa.agregarPasajero("Pappalardo", "Laura", 4444444, true);
		for(Pasajero p : aa.getLstPasajeros()) {
			System.out.println(p);}
		
		System.out.println("Resolucion punto 4");
		Pasajero p1 = aa.traerPasajero(3333333);
		System.out.println(p1);
		
		System.out.println("Resolucion punto 5");
		Aeropuerto a2 = aa.traerAeropuerto("COR");
		Aeropuerto a3 = aa.traerAeropuerto("BRC");
		
		try {aa.agregarVuelo(LocalDate.of(2024, 9, 28), LocalTime.of(10, 30), LocalTime.of(12, 30), a1, a2);}
		catch(Exception e) {System.out.println(e.getMessage());}
		try {aa.agregarVuelo(LocalDate.of(2024, 9, 29), LocalTime.of(18, 0), LocalTime.of(20, 00), a2, a1);}
		catch(Exception e) {System.out.println(e.getMessage());}
		try {aa.agregarVuelo(LocalDate.of(2024, 9, 30), LocalTime.of(6, 0), LocalTime.of(8, 0), a1, a3);}
		catch(Exception e) {System.out.println(e.getMessage());}
		try {aa.agregarVuelo(LocalDate.of(2024, 3, 10), LocalTime.of(7, 0), LocalTime.of(9, 0), a2, a2);}
		catch(Exception e) {System.out.println(e.getMessage());}
		for(Vuelo v : aa.getLstVuelos()) {
			System.out.println(v);}
		
		System.out.println("Resolucion punto 6");
		Vuelo v1 = aa.traerVuelo(2);
		System.out.println(v1);
		
		System.out.println("Resolucion punto 7");
		int tiempo = v1.calcularTiempoVuelo();
		System.out.println(tiempo);
		
		System.out.println("Resolucion punto 8");
		Pasajero p2 = aa.traerPasajero(4444444);
		v1.agregar(p1);
		v1.agregar(p2);
		System.out.println(v1);
		
		System.out.println("Resolucion punto 9");
		ArrayList<Vuelo> lstRdo = aa.traerVuelos(LocalDate.of(2024, 9, 29), a2);
		System.out.println(lstRdo);
	}

}
