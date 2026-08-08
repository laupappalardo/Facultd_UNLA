package test;

import java.time.LocalDate;

import modelo.Paciente;

public class TestPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GENERAR NUEVAS INSTANCIAS DE PACIENTE
		//MEDIANTE CONSTRUCTOR
		Paciente paciente = new Paciente("Jose","Perez",1.80f,85,LocalDate.of(1985, 8, 10));
		Paciente paciente2 = new Paciente("Jorge","Fernandez",1.60f,90,LocalDate.of(1988, 5, 25));
		
		System.out.println("PACIENTES");
		//MEDIANTE EL . INVOCAMOS METODOS DE LA CLASE (Y METODOS DE LA CLASE OBJECT)
		System.out.println(paciente.traerNombreCompleto());
		System.out.println(paciente2.traerNombreCompleto());
		
		//GENERAR NUEVAS INSTANCIAS DE PACIENTE
		//MEDIANTE METODOS SET
		Paciente paciente3 = new Paciente();
		paciente3.setNombre("Paciente");
		paciente3.setApellido("Tres");
		//OTROS SET
		System.out.println(paciente3.traerNombreCompleto());
		
		Paciente paciente4 = null;
		//NO SE PUEDE INVOCAR METODOS DE INSTANCIAS QUE NO ESTEN EN MEMORIA
		//paciente4.setNombre("Paciente");
		
		//METODO toString
		System.out.println(paciente);
		
		//COMPARACION DE OBJETOS
		paciente4 = paciente;
		Paciente paciente5 = new Paciente("Jose","Perez",1.80f,85,LocalDate.of(1985, 8, 10));
		System.out.println(paciente == paciente4);//TRUE
		System.out.println(paciente == paciente5);//FALSE
		//LA COMPARACION SE HACE MEDIANTE EL METODO EQUALS
		System.out.println(paciente.equals(paciente5));//TRUE

	}

}