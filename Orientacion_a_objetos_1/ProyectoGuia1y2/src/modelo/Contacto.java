package modelo;

public class Contacto {
	
	//ATRIBUTOS
	private int telefono;

	//CONSTRUCTOR
	public Contacto(int telefono) {
		super();
		this.telefono = telefono;
	}

	//GETTER Y SETTER
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	//toString y equals
	@Override
	public String toString() {
		return "Contacto [telefono=" + telefono + "]";
	}
	
	public boolean equals(Contacto contacto) {
		return telefono == contacto.getTelefono();
	}
	
	//OTROS METODOS
}