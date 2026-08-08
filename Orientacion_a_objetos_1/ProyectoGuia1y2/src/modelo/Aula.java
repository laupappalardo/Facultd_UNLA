package modelo;

public class Aula {
	
	//ATRIBUTOS
	private int nro;
	private String tipo;
	private int capacidad;
	//AGREGACION O COMPOSICION?
	private Edificio edificio;
	
	//CONSTRUCTOR
	public Aula(int nro, String tipo, int capacidad, Edificio edificio) {
		super();
		this.nro = nro;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.edificio = edificio;
	}

	//GETTER Y SETTER
	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}

	//toString y equals
	@Override
	public String toString() {
		return "Aula [nro=" + nro + ", tipo=" + tipo + ", capacidad=" + capacidad + ", edificio=" + edificio + "]";
	}
	
	public boolean equals(Aula aula) {
		return this.nro==aula.getNro()
				&& this.tipo.equalsIgnoreCase(aula.getTipo())
				&& this.edificio.equals(aula.getEdificio());
	}

	//OTROS METODOS
}