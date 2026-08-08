package modelo;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import funciones.Util;


public class Acumar {

	private ArrayList<Estacion> lstEstaciones;
	private ArrayList<Medicion> lstMediciones;
	
	public Acumar() {
		this.lstEstaciones = new ArrayList<Estacion>();
		this.lstMediciones = new ArrayList<Medicion>();
	}

	/**
	 * @return the lstEstaciones
	 */
	public ArrayList<Estacion> getLstEstaciones() {
		return lstEstaciones;
	}

	/**
	 * @param lstEstaciones the lstEstaciones to set
	 */
	public void setLstEstaciones(ArrayList<Estacion> lstEstaciones) {
		this.lstEstaciones = lstEstaciones;
	}

	/**
	 * @return the lstMediciones
	 */
	public ArrayList<Medicion> getLstMediciones() {
		return lstMediciones;
	}

	/**
	 * @param lstMediciones the lstMediciones to set
	 */
	public void setLstMediciones(ArrayList<Medicion> lstMediciones) {
		this.lstMediciones = lstMediciones;
	}

	@Override
	public String toString() {
		return "Acumar [lstEstaciones=" + lstEstaciones + ", lstMediciones=" + lstMediciones + "]";
	}
	
	public Estacion traerEstacion(String nombre) {
		int i=0;
		Estacion e =null;
		while(i<lstEstaciones.size() && !lstEstaciones.get(i).getNombre().equalsIgnoreCase(nombre)) {
			i=i+1;
		}
		if(i<lstEstaciones.size()) {e=lstEstaciones.get(i);}
		return e;
	}
	
	
	public boolean agregarEstacion(String nombre, String direccion, float latitud, float longitud, float altura) throws Exception {
		
		if(traerEstacion(nombre)!=null) {throw new Exception("Ya existe la estacion con el nombre:" + nombre);}
		
		int nuevoId=0;
		if(!lstEstaciones.isEmpty()) {
			nuevoId= lstEstaciones.get(lstEstaciones.size()-1).getId() +1;
		} 
				
		Estacion e = new Estacion (nuevoId, nombre, direccion, latitud, longitud, altura);
		
		lstEstaciones.add(e);
		
		return true;
	}
	
	
	public boolean agregarMedicion(Estacion estacion, LocalDate fecha, LocalTime hora, float temperatura, float humedad, float vientoVel, String vientoDir, float precipitacion) {
		Medicion m = new Medicion(estacion, fecha, hora, temperatura, humedad, vientoVel, vientoDir,  precipitacion);
		
		lstMediciones.add(m);
		
		return true;
	}
	
	public Medicion traerMedicion(Estacion estacion, LocalDate fecha, LocalTime hora) {
		Medicion m = null;
		int i=0;
		while(i<lstMediciones.size() && m==null) {
			if(lstMediciones.get(i).getEstacion().getNombre().equalsIgnoreCase(estacion.getNombre())
					&& lstMediciones.get(i).getFecha().equals(fecha)
					&& lstMediciones.get(i).getHora().equals(hora)) {
				m=lstMediciones.get(i);
			}
			i++;
		}

		return m;
	}
	
	public ArrayList<Medicion> traerMediciones(Estacion estacion){
		
		ArrayList<Medicion> lstRdo = new ArrayList<Medicion>();
		for(int i=0; i<lstMediciones.size(); i++) {
			if (lstMediciones.get(i).getEstacion().getNombre().equalsIgnoreCase(estacion.getNombre())) {
				lstRdo.add(lstMediciones.get(i));
			}
		}		
		return lstRdo;
	}
	
	public float promedioTemperatura(Estacion estacion, LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta) {
		float sumaParcial =0;
		int j=0;
		ArrayList<Medicion> aux = new ArrayList<Medicion>();
		aux= traerMediciones(estacion);
		
		for(int i=0; i<aux.size(); i++) {
			if (Util.fechaEntreHoras(aux.get(i).getHora(), horaDesde, horaHasta)) {
				sumaParcial = sumaParcial + aux.get(i).getTemperatura();
				j++;
			}
		}		
		return sumaParcial/j;
	}
	
	
	
	
}
