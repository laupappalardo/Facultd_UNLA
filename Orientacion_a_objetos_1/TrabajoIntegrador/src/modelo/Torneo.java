package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Torneo {

	private int idTorneo;
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String temporada;
	private List<Equipo> lstEquipo;
	private List<Partido> lstPartido;
	
	/**
	 * @param idTorneo
	 * @param nombre
	 * @param fechaInicio
	 * @param fechaFin
	 * @param temporada
	 * @param lstEquipo
	 */
	public Torneo(int idTorneo,String nombre, LocalDate fechaInicio, LocalDate fechaFin, String temporada) {
		this.idTorneo = idTorneo;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.temporada = temporada;
		this.lstEquipo = new ArrayList<Equipo>();
		this.lstPartido = new ArrayList<Partido>();
	}
	/**
	 * @return the idTorneo
	 */
	public int getIdTorneo() {
		return idTorneo;
	}
	/**
	 * @param idTorneo the idTorneo to set
	 */
	public void setIdTorneo(int idTorneo) {
		this.idTorneo = idTorneo;
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
	 * @return the fechaInicio
	 */
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * @return the fechaFin
	 */
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	/**
	 * @return the temporada
	 */
	public String getTemporada() {
		return temporada;
	}
	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	/**
	 * @return the lstEquipo
	 */
	public List<Equipo> getLstEquipo() {
		return lstEquipo;
	}
	
	/**
	 * @param lstEquipo the lstEquipo to set
	 */
	public void setLstEquipo(List<Equipo> lstEquipo) {
		this.lstEquipo = lstEquipo;
	}
	
	public List<Partido> getLstPartido() {
		return lstPartido;
	}
	public void setLstPartido(List<Partido> lstPartido) {
		this.lstPartido = lstPartido;
	}
	

	@Override
	public String toString() {
		return "Torneo [idTorneo=" + idTorneo + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", temporada=" + temporada + ", lstEquipo=" + lstEquipo + ", lstPartido=" + lstPartido
				+ "]";
	}
	
	public boolean eliminarPartido(Partido p) {
	    if(p != null && lstPartido.contains(p)) {
	        return lstPartido.remove(p);
	    }
	    return false;
	}
	
	public boolean eliminarEquipo(Equipo equipo) {
		int i=0;
		while(i<lstPartido.size()) {
			Partido partido = lstPartido.get(i);
			if(partido.getEquipoLocal().equals(equipo)||partido.getEquipoVisitante().equals(equipo)) {
				return false;
			}
			i++;
		}
		return lstEquipo.remove(equipo);
	}
	
	public Equipo equipoMayorAltura() {
		Equipo equipoMayorAltura = null;
		float altura = 0;
		int i=0;
		
		while(i<lstEquipo.size()) {
			Equipo equipoActual = lstEquipo.get(i);
			float alturaActual = equipoActual.calcularAlturaPromedio();
			
			if(i==0) {
				equipoMayorAltura = equipoActual;
				altura = alturaActual;
			} else {
				if(alturaActual > altura) {
					equipoMayorAltura = equipoActual;
					altura = alturaActual;
				}
			}
			i++;
		}
		return equipoMayorAltura;		
		}
	
	public boolean agregarPartidoEnTorneo(Partido partido) {
		return lstPartido.add(partido);
	}
	
	public boolean agregarEquipo(Equipo equipo) {
		return lstEquipo.add(equipo);
	}

	private Posicion buscarPosicion(List<Posicion> tabla, Equipo equipo) {
	    Posicion posicion = null;
		int i=0;
	    while (i<tabla.size() && posicion ==null) {
	        if (tabla.get(i).getEquipo().equals(equipo)){
	            posicion =  tabla.get(i); // lo encontró
	        }
	        i++;
	    }
	    return posicion; // no está en la tabla todavía
	}
	
	public void ordenaTabla(List<Posicion> tabla) {
		
		for (int i = 0; i < tabla.size() - 1; i++) {
		    for (int j = 0; j < tabla.size() - 1 - i; j++) {
		        if (tabla.get(j).getPuntos() < tabla.get(j + 1).getPuntos()) {
		            // Intercambio de posiciones
		            Posicion aux = tabla.get(j);
		            tabla.set(j, tabla.get(j + 1));
		            tabla.set(j + 1, aux);
		        }
		    }
		}
	}
	
	public List<Posicion> generarTablaPosicion(){
		List<Posicion> tabla = new ArrayList<Posicion>();
		
		for(Partido p: lstPartido) {
			
			String [] rdo = p.getResultado().split("");
			Equipo local = p.getEquipoLocal();
			Equipo visitante = p.getEquipoVisitante();
			
			Posicion posLocal = buscarPosicion(tabla, local);
	        if (posLocal == null) {
	            posLocal = new Posicion(local,0);
	            tabla.add(posLocal);
	        }

	        Posicion posVisitante = buscarPosicion(tabla, visitante);
	        if (posVisitante == null) {
	            posVisitante = new Posicion(visitante,0);
	            tabla.add(posVisitante);
	        }
			
			if(Integer.parseInt(rdo[0])<Integer.parseInt(rdo[2])) {posLocal.sumarPuntos(3);}
			else if(Integer.parseInt(rdo[0])>Integer.parseInt(rdo[2])) {posVisitante.sumarPuntos(3);}
			else {posLocal.sumarPuntos(1); 
				posVisitante.sumarPuntos(1);
			}		
			
		}
		
		ordenaTabla(tabla);
		return tabla;
	}
	
}


