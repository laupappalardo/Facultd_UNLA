package modelo;

public class ItemCarrito {
	
	private int idItem;
	private Producto producto;
	private int cantidad;
	private Carrito carrito;
	
	public ItemCarrito(int idItem, Producto producto, int cantidad, Carrito carrito) {
		super();
		this.idItem = idItem;
		this.producto = producto;
		this.cantidad = cantidad;
		this.carrito = carrito;
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	//Para evitar el deadlock cambiar el toString de Carrito o no usarlo
	@Override
	public String toString() {
		return "ItemCarrito [idItem=" + idItem + ", producto=" + producto + ", cantidad=" + cantidad + ", carrito="
				+ carrito.getIdCarrito() + "]";
	}
	
	//Metodo equals
	
	//Otros metodos
}
