package modelo;
import java.util.ArrayList;

import funciones.Util;

import java.time.LocalDate;
import java.time.LocalTime;

public class Dispositivo {

	private int id;
	private String nombre;
	private String codigo;
	private ArrayList<Metrica> lstMetricas;
	private Empresa empresa;
	/**
	 * @param id
	 * @param nombre
	 * @param codigo
	 * @param lstMetricas
	 * @param empresa
	 */
	public Dispositivo(int id, String nombre, String codigo, ArrayList<Metrica> lstMetricas, Empresa empresa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		this.lstMetricas = lstMetricas;
		this.empresa = empresa;
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the lstMetricas
	 */
	public ArrayList<Metrica> getLstMetricas() {
		return lstMetricas;
	}
	/**
	 * @param lstMetricas the lstMetricas to set
	 */
	public void setLstMetricas(ArrayList<Metrica> lstMetricas) {
		this.lstMetricas = lstMetricas;
	}
	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}
	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return "Dispositivo [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", lstMetricas=" + lstMetricas
				+ ", empresa=" + empresa + "]";
	}
	
	public boolean agregarMetrica(int valor, LocalDate fecha, LocalTime hora) {
		Metrica m = new Metrica(valor, fecha, hora);
		
		lstMetricas.add(m);
		return true;
		
	}
	
	public Metrica traerMetrica(LocalDate fecha, LocalTime hora){
				
		int i=0;
		Metrica m =null;
		while(i<lstMetricas.size() && m==null) {
			LocalDate f = lstMetricas.get(i).getFecha();
			LocalTime h = lstMetricas.get(i).getHora();
			if(f.equals(fecha) && h.equals(hora)) {
				m = lstMetricas.get(i);
			}
			
			i++;
		}
		return m;
	}
	
	public ArrayList<Metrica> traerMetricas(LocalDate desde, LocalDate hasta){
		ArrayList<Metrica> listaRdo = new ArrayList<Metrica>();  
		
		for(Metrica m : lstMetricas) {
			LocalDate f = m.getFecha();
			if(Util.fechaEntreFechas(f, desde, hasta)) {
				listaRdo.add(m);
			}
		}
		return listaRdo;
	}
	
	
	

}
