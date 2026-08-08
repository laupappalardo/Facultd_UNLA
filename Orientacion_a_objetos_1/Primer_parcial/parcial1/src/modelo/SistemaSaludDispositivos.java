package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import funciones.Util;
public class SistemaSaludDispositivos {

	private ArrayList<Empresa> empresas;
	private ArrayList <Dispositivo> dispositivos;
	
	
	public SistemaSaludDispositivos() {
		this.empresas = new ArrayList<Empresa>();
		this.dispositivos = new ArrayList<Dispositivo>();
	}


	/**
	 * @return the empresas
	 */
	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}


	/**
	 * @param empresas the empresas to set
	 */
	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}


	/**
	 * @return the dispositivos
	 */
	public ArrayList<Dispositivo> getDispositivos() {
		return dispositivos;
	}


	/**
	 * @param dispositivos the dispositivos to set
	 */
	public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
		this.dispositivos = dispositivos;
	}


	@Override
	public String toString() {
		return "SistemaSaludDispositivos [empresas=" + empresas + ", dispositivos=" + dispositivos + "]";
	}
	
	/**Metodos*/
	
	public boolean agregarEmpresa(String nombre) {
		
		int nuevoId=0;
		if(!empresas.isEmpty()) {
			nuevoId = empresas.getLast().getId() +1;
		}
		Empresa e = new Empresa(nuevoId, nombre);
		empresas.add(e);	
		
		return true;
	}
	
	public Empresa traerEmpresa(String nombre) {
		
		int i=0;
		while (i<empresas.size() && !empresas.get(i).getNombre().equalsIgnoreCase(nombre)) {
			i=i+1;
		}
		if (i<empresas.size() ) {return empresas.get(i);}
		else {return null;}
	}
	
	
	public boolean agregarDispositivo(String nombre, String codigo, Empresa empresa) throws Exception {
		
		int nuevoId=0;
		if(!dispositivos.isEmpty()) {
			nuevoId = dispositivos.getLast().getId() +1;
		}
		
		char letra = codigo.charAt(0);
		String num = codigo.substring(1,5);
		
		if(letra == 'A' && Util.sumaCadenaNros(num)%2!=0) {
			throw new Exception ("El codigo no es correcto");
		} else if(letra == 'B' && Util.sumaCadenaNros(num)%2==0){
			throw new Exception ("El codigo no es correcto");
		}
				
		ArrayList<Metrica> m = new ArrayList<Metrica>(); 
		Dispositivo d = new Dispositivo(nuevoId, nombre, codigo,m, empresa);
		dispositivos.add(d);	
		
		return true;
	}
	
	public Dispositivo traerDispositivo(String codigo) {
		int i=0;
		while (i<dispositivos.size() && !dispositivos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
			i=i+1;
		}
		if (i<dispositivos.size() ) {return dispositivos.get(i);}
		else {return null;}
	}
	
	public ArrayList<Metrica> traerMetricas(Dispositivo dispositivo, LocalDate desde, LocalDate hasta, int valor){
		ArrayList<Metrica> listaRdo = new ArrayList<Metrica>();  
		
		ArrayList<Metrica> lstMetrica = dispositivo.getLstMetricas();
		for(Metrica m : lstMetrica) {
			int v = m.getValor();
			LocalDate f = m.getFecha();
			if(Util.fechaEntreFechas(f, desde, hasta) && v< valor) {
				listaRdo.add(m);
			}
		}
		return listaRdo;
	}
	
}
