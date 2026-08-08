package test;

import modelo.Acumar;
import modelo.Estacion;
import modelo.Medicion;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Acumar a = new Acumar();
		
		System.out.println("Resolucion punto 1");
		try {
			a.agregarEstacion("Lanus", "Carlos Casares 2000", -34.7F, -58.4F, 100.0F);}
		catch (Exception e) { System.out.println(e.getMessage());}
		try {	a.agregarEstacion("Avellaneda", "Av Manuel Belgrano 2800", -34.681667F, -58.349722F, 200.0F);
		}
		catch (Exception e) { System.out.println(e.getMessage());}
		
		System.out.println(a.toString());
		
		System.out.println("Resolucion punto 2");
		Estacion e1 = a.traerEstacion("Lanus");
		System.out.println(e1);
		
		System.out.println("Resolucion punto 3");
		try {
			a.agregarEstacion("Lanus", "Carlos Casares 2000", -34.7F, -58.4F, 100.0F);}
		catch (Exception e) { System.out.println(e.getMessage());}
		
		System.out.println("Resolucion punto 4");
		Estacion e2 = a.traerEstacion("Avellaneda");
		a.agregarMedicion(e1,LocalDate.of(2022, 9, 1) , LocalTime.of(13, 0), 17.6F, 49.0F, 9.7F,"E", 0.0F);
		a.agregarMedicion(e1,LocalDate.of(2022, 9, 1) , LocalTime.of(14, 0), 18.4F, 45.0F, 6.2F,"SE", 0.0F);
		a.agregarMedicion(e1,LocalDate.of(2022, 9, 1) , LocalTime.of(16, 0), 19.0F, 39.0F, 7.F,"S", 0.0F);
		a.agregarMedicion(e2,LocalDate.of(2022, 9, 1) , LocalTime.of(15, 0), 18.8F, 42.0F, 6.8F,"S", 0.0F);
	
		for(Medicion m : a.getLstMediciones()) {
			System.out.println(m);
		}
		
		System.out.println("Resolucion punto 5");
		
		ArrayList<Medicion> lstMedicion1 = a.traerMediciones(e2);
		for(Medicion m : lstMedicion1) {
			System.out.println(m);
		}
	
		System.out.println("Resolucion punto 6");
		float promedio = a.promedioTemperatura(e1, LocalDate.of(2022, 9, 1), LocalTime.of(12, 0), LocalTime.of(15, 30));
		System.out.println(promedio);
		
		System.out.println("Resolucion punto 7");
		
		double distancia = e1.distanciaConEstacion(e2);
		System.out.println(distancia);
	
		System.out.println("Resolucion punto 8");
		Medicion m1 = a.traerMedicion(e1, LocalDate.of(2022, 9, 1), LocalTime.of(16, 0));
		float tempCorregida = m1.temperaturaCorregidaPorAltura();
		System.out.println(tempCorregida);
	}
	
}
