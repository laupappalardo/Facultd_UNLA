package modelo;

public class Persona {
	
	//ATRIBUTOS
	private String nombre;
	private String apellido;
	private int dni;
	private Contacto contacto;
	
	//CONSTRUCTOR
	public Persona(String nombre, String apellido, int dni, Contacto contacto) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.contacto = contacto;
	}

	//GETTER Y SETTER
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	//toString y equals
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", contacto=" + contacto + "]";
	}
	
	public boolean equals(Persona persona) {
		return dni == persona.getDni();
	}
	
	//OTROS METODOS
}