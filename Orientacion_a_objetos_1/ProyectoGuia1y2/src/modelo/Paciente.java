package modelo;

import java.time.LocalDate;

public class Paciente {
	
	//ATRIBUTOS
	private String nombre;
	private String apellido;
	private float estatura;
	private float peso;
	private LocalDate fechaDeNacimiento;
	private boolean activo;
	
	//CONSTRUCTOR
	public Paciente(String nombre, String apellido, float estatura, float peso,
			LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
		this.peso = peso;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.activo = true;
	}
	
	//CONSTRUCTOR
	//RE-DEFINICION DE METODO
	//SOBRECARGA (CAMBIA LA FIRMA, MISMO NOMBRE, DISTINTOS TIPOS DE PARAMETROS)
	public Paciente(String nombre, String apellido, float estatura, float peso, LocalDate fechaDeNacimiento,
			boolean activo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
		this.peso = peso;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.activo = activo;
	}

	//CONSTRUCTOR
	//RE-DEFINICION DE METODO
	//SOBRECARGA (CAMBIA LA FIRMA, MISMO NOMBRE, DISTINTOS TIPOS DE PARAMETROS)
	public Paciente(String nombre, String apellido, float estatura, float peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
		this.peso = peso;
	}

	//CONSTRUCTOR
	//RE-DEFINICION DE METODO
	//SOBRECARGA (CAMBIA LA FIRMA, MISMO NOMBRE, DISTINTOS TIPOS DE PARAMETROS)
	public Paciente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//CONSTRUCTOR (VACIO)
	//RE-DEFINICION DE METODO
	//SOBRECARGA (CAMBIA LA FIRMA, MISMO NOMBRE, DISTINTOS TIPOS DE PARAMETROS)
	public Paciente() {
		super();
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	//FIRMA DEL METODO (MISMO NOMBRE Y PARAMETROS)
	//RE-DEFINICION DE METODOS (POLIMORFISMO)
	//SOBRE ESCTRITURA (MISMA FIRMA DEL METODO PADRE,
	// CAMBIA EL COMPORTAMIENTO)
	//METODO PADRE (VIENE DE OBJECT)
	//METODO ToString
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", estatura=" + estatura + ", peso=" + peso
				+ "]";
	}
	
	//RE-DEFINICION DE METODOS (POLIMORFISMO)
	//SOBRE CARGA (CAMBIA LA FIRMA DEL METODO PADRE)
	//METODO PADRE (VIENE DE OBJECT)
	//METODO Equals
	public boolean equals(Paciente p) {
		return nombre.equalsIgnoreCase(p.nombre)
				&& apellido.equalsIgnoreCase(p.getApellido());
	}
	
	//OTROS METODOS
	public String traerNombreCompleto() {
		return nombre + " " + apellido;
	}

}