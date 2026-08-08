package test;

import modelo.Aula;
import modelo.Edificio;

public class TestEdificioAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CREACION DE INSTANCIA DE EDIFICIO
		Edificio edificio = new Edificio(1, "Edificio 1");
		//CREACION DE INSTANCIAS DE AULAS
		//SE PASA COMO PARAMETRO UNA INSTANCIA DE EDIFICIO
		Aula aula = new Aula(1,"Tradicional",80,edificio);
		Aula aula2 = new Aula(2,"Laboratorio",30,edificio);
		
		System.out.println("EDIFICIO");
		System.out.println(edificio);
		System.out.println("AULAS");
		System.out.println(aula);
		System.out.println(aula2);
		
	}

}