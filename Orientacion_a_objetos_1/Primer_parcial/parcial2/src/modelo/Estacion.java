package modelo;

public class Estacion {

	private int id;
	private String nombre;
	private String direccion;
	private float latitud;
	private float longitud;
	private float altura;
	/**
	 * @param id
	 * @param nombre
	 * @param direccion
	 * @param latitud
	 * @param longitud
	 * @param altura
	 */
	public Estacion(int id, String nombre, String direccion, float latitud, float longitud, float altura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.altura = altura;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the latitud
	 */
	public float getLatitud() {
		return latitud;
	}
	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}
	/**
	 * @return the longitud
	 */
	public float getLongitud() {
		return longitud;
	}
	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Estacion [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", latitud=" + latitud
				+ ", longitud=" + longitud + ", altura=" + altura + "]";
	}
	
	public double distanciaConEstacion(Estacion estacion) {
		float lat1 = estacion.getLatitud();
		float lon1 = estacion.getLongitud();
		
		float lat2 = getLatitud();
		float lon2 = getLongitud();
		
		double aux = Math.sqrt(Math.pow(lat2-lat1, 2) + Math.pow(lon2-lon1, 2));
		
		return aux*100;
	}
}
