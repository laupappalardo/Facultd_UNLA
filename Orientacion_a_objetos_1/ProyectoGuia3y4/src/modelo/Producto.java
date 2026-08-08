package modelo;

public class Producto {
	
	private int idProducto;
	private String producto;
	private float precio;
	
	public Producto(int idProducto, String producto, float precio) throws Exception{
		super();
		this.idProducto = idProducto;
		//Validaciones de atributos se hacen a traves del set, se lo llama en el constructor
		this.setProducto(producto);
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) throws Exception{
		//Opcion 1 validarlo en el set
		boolean error = false;
		if(producto.isBlank()) error = true;
		if(producto.isEmpty()) error = true;
		//Otras validaciones
		//En el set se lanza la excepcion
		if(error) throw new Exception("ERROR en el nombre del producto");
		
		//Opcion 2 llamar a un metodo validador
		if(this.validarProducto(producto)) throw new Exception("ERROR en el nombre del producto");
		
		this.producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", producto=" + producto + ", precio=" + precio + "]";
	}
	
	public boolean equals(Producto producto) {
		return this.getProducto().equalsIgnoreCase(producto.getProducto());
	}
	
	//Metodos privados que validen atributos
	private boolean validarProducto(String producto) {
		return producto.isEmpty();
	}

}
