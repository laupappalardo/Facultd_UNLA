package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import modelo.Dispositivo;
import modelo.SistemaSaludDispositivos;
import modelo.Empresa;
import modelo.Metrica;

public class testTema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SistemaSaludDispositivos sistema = new SistemaSaludDispositivos();
		
		System.out.println("Resolucion punto 1");
		sistema.agregarEmpresa("Empresa1");
		sistema.agregarEmpresa("Empresa2");
		
		for(Empresa e: sistema.getEmpresas()) {
			System.out.println(e);
		}
		
		System.out.println("Resolucion punto 2");
		Empresa e1 = sistema.traerEmpresa("Empresa2");
		System.out.println(e1);
	
		
		System.out.println("Resolucion punto 3");
		
		try {
			System.out.println("Agrego dispositivo 1");
			sistema.agregarDispositivo("Sensor Humedad", "A2020", sistema.traerEmpresa("Empresa1"));
		}
		catch (Exception e){
			System.out.println(e.getMessage());		
		}
		
		try {
			System.out.println("Agrego dispositivo 2");
			sistema.agregarDispositivo("Sensor Temperatura", "A2325", sistema.traerEmpresa("Empresa1"));
		}
		catch (Exception e){
			System.out.println(e.getMessage());		
		}
		
		try {
			System.out.println("Agrego dispositivo 3");
			sistema.agregarDispositivo("Sensor Presion", "B2021", sistema.traerEmpresa("Empresa2"));
		}
		catch (Exception e){
			System.out.println(e.getMessage());		
		}
		
		try {
			System.out.println("Agrego dispositivo 4");
			sistema.agregarDispositivo("Sensor Humedad", "B2326", sistema.traerEmpresa("Empresa2"));
		}
		catch (Exception e){
			System.out.println(e.getMessage());		
		}
		
		System.out.println("Resolucion punto 4");
		
		try {
			System.out.println("Agrego dispositivo 5");
			sistema.agregarDispositivo("Sensor Movimiento", "A2021", sistema.traerEmpresa("Empresa1"));
		}
		catch (Exception e){
			System.out.println(e.getMessage());		
		}
		
		
		System.out.println("Resolucion punto 5");
		Dispositivo d1 = sistema.traerDispositivo("B2326");
		System.out.println(d1);
	
	
		System.out.println("Resolucion punto 6");		
		d1.agregarMetrica(18, LocalDate.of(2022, 9, 18), LocalTime.of(10, 00));
		d1.agregarMetrica(19, LocalDate.of(2022, 9, 19), LocalTime.of(12, 30));
		d1.agregarMetrica(23, LocalDate.of(2022, 9, 20), LocalTime.of(15, 00));
		d1.agregarMetrica(20, LocalDate.of(2022, 9, 21), LocalTime.of(18, 30));
		d1.agregarMetrica(18, LocalDate.of(2022, 9, 22), LocalTime.of(22, 30));
		System.out.println(d1);

		System.out.println("Resolucion punto 7");
		Metrica m3 = d1.traerMetrica(LocalDate.of(2022, 9, 19),  LocalTime.of(12, 30));
		System.out.println(m3.toString());
		
		System.out.println("Resolucion punto 8");
		ArrayList <Metrica> m = new ArrayList<Metrica>();
		m=d1.traerMetricas(LocalDate.of(2022, 9, 19), LocalDate.of(2022, 9, 21));
		System.out.println(m);
		
		System.out.println("Resolucion punto 9");
		ArrayList <Metrica> m2 = new ArrayList<Metrica>();
		m2=sistema.traerMetricas(d1, LocalDate.of(2022, 9, 19), LocalDate.of(2022, 9, 21), 22);
		System.out.println(m2);
		
	}

}
