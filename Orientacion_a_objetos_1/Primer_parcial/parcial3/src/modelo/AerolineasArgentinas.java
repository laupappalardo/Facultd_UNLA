package modelo;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import funciones.Util;

public class AerolineasArgentinas {

	private ArrayList<Aeropuerto> lstAeropuertos;
	private ArrayList<Pasajero> lstPasajeros;
	private ArrayList<Vuelo> lstVuelos;
	
	public AerolineasArgentinas() {
		this.lstAeropuertos = new ArrayList<Aeropuerto>();
		this.lstPasajeros = new ArrayList<Pasajero>();
		this.lstVuelos =  new ArrayList<Vuelo>();		
	}

	/**
	 * @return the lstAeropuertos
	 */
	public ArrayList<Aeropuerto> getLstAeropuertos() {
		return lstAeropuertos;
	}

	/**
	 * @param lstAeropuertos the lstAeropuertos to set
	 */
	public void setLstAeropuertos(ArrayList<Aeropuerto> lstAeropuertos) {
		this.lstAeropuertos = lstAeropuertos;
	}

	/**
	 * @return the lstPasajeros
	 */
	public ArrayList<Pasajero> getLstPasajeros() {
		return lstPasajeros;
	}

	/**
	 * @param lstPasajeros the lstPasajeros to set
	 */
	public void setLstPasajeros(ArrayList<Pasajero> lstPasajeros) {
		this.lstPasajeros = lstPasajeros;
	}

	/**
	 * @return the lstVuelos
	 */
	public ArrayList<Vuelo> getLstVuelos() {
		return lstVuelos;
	}

	/**
	 * @param lstVuelos the lstVuelos to set
	 */
	public void setLstVuelos(ArrayList<Vuelo> lstVuelos) {
		this.lstVuelos = lstVuelos;
	}

	@Override
	public String toString() {
		return "AerolineasArgentinas [lstAeropuertos=" + lstAeropuertos + ", lstPasajeros=" + lstPasajeros
				+ ", lstVuelos=" + lstVuelos + "]";
	}

	
	public boolean agregarAeropuerto(String codAeropuerto, String aeropuerto) throws Exception{
		
		int idAeropuerto =0;
		if(!lstAeropuertos.isEmpty()) {idAeropuerto = lstAeropuertos.get(lstAeropuertos.size()-1).getIdAeropuerto()+1;}
		
		if(codAeropuerto.length()!=3 && !Util.esCandenaLetras(codAeropuerto)) {throw new Exception("El codigo no tiene 3 letras");}
		
		Aeropuerto a = new Aeropuerto(idAeropuerto, codAeropuerto, aeropuerto);
		
		lstAeropuertos.add(a);
		
		return true;
	}
	
	public Aeropuerto traerAeropuerto(String codAeropuerto) {
		Aeropuerto a = null;
		int i=0;
		while(i<lstAeropuertos.size() && a==null) {
			if( lstAeropuertos.get(i).getCodAeropuerto().equalsIgnoreCase(codAeropuerto)) {
				a = lstAeropuertos.get(i);
			}
			i++;
		}	
		return a;
	}
	
	public boolean agregarPasajero(String apellido, String nombres, int dni, boolean viajeroFrecuente) {
		
		int idPasajero =0;
		if(!lstPasajeros.isEmpty()) {idPasajero = lstPasajeros.get(lstPasajeros.size()-1).getIdPasajero()+1;}
		
		Pasajero p = new Pasajero(idPasajero, apellido, nombres, dni, viajeroFrecuente);
		
		lstPasajeros.add(p);
		return true;
	}
	
	public Pasajero traerPasajero(int dni) {
		Pasajero p = null;
		int i=0;
		while(i<lstPasajeros.size() && p==null) {
			if( lstPasajeros.get(i).getDni() == dni) {
				p = lstPasajeros.get(i);
			}
			i++;
		}
		return p;
	}
	
	public boolean agregarVuelo(LocalDate fecha, LocalTime horaSalida, LocalTime horaLlegada, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) throws Exception{
		if(aeropuertoSalida.getCodAeropuerto().equalsIgnoreCase(aeropuertoLlegada.getCodAeropuerto())) {
			throw new Exception("El aeropuerto de salida es igual al de llegada");}
		
		int idVuelo =0;
		if(!lstVuelos.isEmpty()) {idVuelo = lstVuelos.get(lstVuelos.size()-1).getIdVuelo()+1;}
		
		Vuelo v = new Vuelo(idVuelo, fecha, horaSalida, horaLlegada,aeropuertoSalida,aeropuertoLlegada );
		lstVuelos.add(v);
		return true;
	}
	
	public Vuelo traerVuelo(int idVuelo) {
		Vuelo v =null;
		int i=0;
		while(i<lstVuelos.size() && v==null) {
			if( lstVuelos.get(i).getIdVuelo() == idVuelo) {
				v = lstVuelos.get(i);
			}
			i++;
		}		
		return v;	
	}
	public ArrayList<Vuelo> traerVuelos(LocalDate fecha, Aeropuerto aeropuertoSalida){
		
		ArrayList<Vuelo> lstRdo = new ArrayList<Vuelo>();
		for (int i=0; i<lstVuelos.size(); i++) {
			if(lstVuelos.get(i).getFecha().equals(fecha) && 
					lstVuelos.get(i).getAeropuertoSalida().getCodAeropuerto().equalsIgnoreCase(aeropuertoSalida.getCodAeropuerto())) {
				lstRdo.add(lstVuelos.get(i));
			}
		}
		return lstRdo;		
	}
}
