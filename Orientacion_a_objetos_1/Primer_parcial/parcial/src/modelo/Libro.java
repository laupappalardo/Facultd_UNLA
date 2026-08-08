package modelo;

public class Libro {

	private int id;
	private String titulo;
	private String isbn;
	private String autor;
	private String editorial;
	
	public Libro(int id, String titulo, String isbn, String autor, String editorial) throws Exception{
		super();
		this.id = id;
		this.titulo = titulo;
		this.setIsbn(isbn);
		this.autor = autor;
		this.editorial = editorial;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) throws Exception {
		String [] digito = isbn.split("");
		int i=0;
		int sumaDigIndPar =0;
		int sumaDigIndImpar=0;
		
		for(i=0; i<12; i++) {
			int aux =Integer.parseInt(digito[i]);
			if(i==0 || i%2 ==0) {sumaDigIndPar = sumaDigIndPar + aux; }
			else { sumaDigIndImpar = sumaDigIndImpar + aux;}
		}
		int suma = sumaDigIndPar + (3*sumaDigIndImpar);
		int digitoControl = 10- (suma%10);
		
		if (digitoControl != Integer.parseInt(digito[12]) ) {throw new Exception ("ERROR: ISBN= " + isbn + " no es correcto");}
		else {this.isbn = isbn;}
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial="
				+ editorial + "]";
	}
	
	

}
