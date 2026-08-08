package test;

import modelo.Contacto;
import modelo.Persona;

public class TestPersonaContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CREACION DE INSTANCIA PERSONA
		//SE PASA COMO PARAMETRO UNA INSTANCIA DE CONTACTO "AL VOLEO"
		Persona persona = new Persona("Persona","Uno",30,new Contacto(11111111));
		System.out.println(persona);
		
	}

}