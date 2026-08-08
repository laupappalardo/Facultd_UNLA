package modelo;

public class Edificio {
	
	//ATRIBUTOS
	private int nroIdentificatorio;
	private String nombre;
	
	//CONSTRUCTOR
	public Edificio(int nroIdentificatorio, String nombre) {
		super();
		this.nroIdentificatorio = nroIdentificatorio;
		this.nombre = nombre;
	}

	//GETTER Y SETTER
	public int getNroIdentificatorio() {
		return nroIdentificatorio;
	}

	public void setNroIdentificatorio(int nroIdentificatorio) {
		this.nroIdentificatorio = nroIdentificatorio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//toString y equals
	@Override
	public String toString() {
		return "Edificio [nroIdentificatorio=" + nroIdentificatorio + ", nombre=" + nombre + "]";
	}
	
	public boolean equals(Edificio edificio) {
		return nroIdentificatorio == edificio.getNroIdentificatorio()
				&& nombre.equalsIgnoreCase(edificio.getNombre());
	}

	//OTROS METODOS
}