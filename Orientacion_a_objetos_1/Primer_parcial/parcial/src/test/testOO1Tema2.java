package test;

import modelo.SisBiblioteca;
import modelo.Estudiante;
import modelo.Prestamo;
import modelo.Libro;

import java.util.ArrayList;
import java.time.LocalDate;

public class testOO1Tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SisBiblioteca sistema = new SisBiblioteca();

		System.out.println("Resolucion punto 1");
		
		sistema.agregarEstudiante("Lucia", "Vazquez", 11111111);
		sistema.agregarEstudiante("Marcos", "Rodriguez", 22222222);
		sistema.agregarEstudiante("Juan", "Martinez", 33333333);
		
		for(Estudiante e: sistema.getLstEstudiante()) {
			System.out.println(e);
		}
		
		System.out.println("Resolucion punto 4");
		try {
			sistema.agregarLibro("Fundamentos de la programacion", "9786071514684", "Luis Joyanes Aguilar", "Mc Graw Hill");
			sistema.agregarLibro("El lenguaje Unificado del Modelado", "9788478290765", "Booch", "Pearson");
			sistema.agregarLibro("UML y Patrones", "9788420534381", "Craig", "Pearson");
			sistema.agregarLibro("Patrones de diseño", "9788478290598", "Gamma", "Pearson");
			sistema.agregarLibro("Estructuras de datos en java", "9788448156312", "Aguilar", "McGraw Hill");
		}
		
		catch (Exception e) {System.out.println(e.getMessage());}
		for(Libro l : sistema.getLstLibro()) {
			System.out.println(l);
		}
		
		System.out.println("Resolucion punto 3");
		Estudiante e1 = sistema.traer(33333333);
		System.out.println(e1);
		
		System.out.println("Resolucion punto 4");
		Libro l1 = sistema.traer("9788448156312");
		System.out.println(l1);
		
		
		System.out.println("Resolucion punto 5");
		try {
			sistema.agregarPrestamo(LocalDate.of(2025, 9, 9), e1, l1);
			Libro l2 = sistema.traer("9788478290765");
			sistema.agregarPrestamo(LocalDate.of(2025, 9, 11), e1, l2);
		}catch (Exception e) {System.out.println(e.getMessage());}
		
		for(Prestamo p : sistema.getLstPrestamo()) {
			System.out.println(p);
		}
		
		int cant = sistema.traerCantPrestamos(e1);
		System.out.println(cant);
		
		
		System.out.println("Resolucion punto 6");
		Libro l3 = sistema.traer("9788420534381");
		try {
			sistema.agregarPrestamo(LocalDate.of(2025, 9, 25), e1, l3);
		}catch (Exception e) {System.out.println(e.getMessage());}
		
		
		System.out.println("Resolucion punto 7");
		
		ArrayList<Prestamo> lstRdo = new ArrayList<Prestamo>();
		lstRdo = sistema.traer(LocalDate.of(2025, 9, 18), false);
		System.out.println(lstRdo);
		
		System.out.println("Resolucion punto 8");
		try {
			sistema.agregarLibro("Logica de programacion", "9789587627214", "Trejos Burutica", "Ediciones de la U");
		}		
		catch (Exception e) {System.out.println(e.getMessage());}
		
		System.out.println("Resolucion punto 9");
		try {
			sistema.agregarLibro("Logica de programacion", "9789587627213", "Trejos Burutica", "Ediciones de la U");
		}		
		catch (Exception e) {System.out.println(e.getMessage());}
		for(Libro l : sistema.getLstLibro()) {
			System.out.println(l);
		}
	}

}
