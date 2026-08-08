package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaTorneoFutbol {
	private List<Jugador> lstJugadores;
	private List<Entrenador> lstEntrenadores;
	private List<Equipo> lstEquipos;
	private List<Torneo> lstTorneos;
	private List<Partido> lstPartidos;
	private List<Estadistica> lstEstadistica;

	public SistemaTorneoFutbol() {
		this.lstJugadores = new ArrayList<Jugador>();
		this.lstEntrenadores = new ArrayList <Entrenador>();
		this.lstEquipos = new ArrayList<Equipo>();
		this.lstTorneos = new ArrayList<Torneo>();
		this.lstPartidos = new ArrayList<Partido>();
		this.lstEstadistica = new ArrayList<Estadistica>();
	}

	public List<Jugador> getLstJugadores() {
		return lstJugadores;
	}

	public void setLstJugadores(List<Jugador> lstJugadores) {
		this.lstJugadores = lstJugadores;
	}

	public List<Entrenador> getLstEntrenadores() {
		return lstEntrenadores;
	}

	public void setLstEntrenadores(List<Entrenador> lstEntrenadores) {
		this.lstEntrenadores = lstEntrenadores;
	}

	public List<Equipo> getLstEquipos() {
		return lstEquipos;
	}

	public void setLstEquipos(List<Equipo> lstEquipos) {
		this.lstEquipos = lstEquipos;
	}

	public List<Torneo> getLstTorneos() {
		return lstTorneos;
	}

	public void setLstTorneos(List<Torneo> lstTorneos) {
		this.lstTorneos = lstTorneos;
	}

	public List<Partido> getLstPartidos() {
		return lstPartidos;
	}

	public void setLstPartidos(List<Partido> lstPartidos) {
		this.lstPartidos = lstPartidos;
	}
	
	
	public List<Estadistica> getLstEstadistica() {
		return lstEstadistica;
	}

	public void setLstEstadistica(List<Estadistica> lstEstadistica) {
		this.lstEstadistica = lstEstadistica;
	}

	//*Entrenador*//
	public Entrenador traerEntrenador(int dni) {
		Entrenador entrenador = null;
		int i=0;
		while (i < lstEntrenadores.size() && entrenador == null) {
			Entrenador aux = lstEntrenadores.get(i);
			if(aux.getDni() == dni) {
				entrenador = aux;
			}
			i++;
		}
		return entrenador;
	}
	
	public boolean agregarEntrenador(String apellido, String nombre, int dni, LocalDate fechaNacimiento,
			String estrategiaFavorita) {
		Entrenador entrenador = traerEntrenador(dni);
		int id = 1;
		if(lstEntrenadores.size()>0) {
			id= lstEntrenadores.get(lstEntrenadores.size()-1).getIdEntrenador()+1;
		}
		entrenador  = new Entrenador(id,apellido, nombre, dni, fechaNacimiento, id, estrategiaFavorita);
	
		return lstEntrenadores.add(entrenador);
	}
	
	
	public boolean eliminarEntrenador(int dni) {
		Entrenador entrenador = traerEntrenador(dni);
		if(entrenador != null) {
			return lstEntrenadores.remove(entrenador);
		}
		return false;
	}
	
	public List<Entrenador> traerEntrenadoresPorEstrategia(String estrategiaFavorita){
		List<Entrenador> estrategiaEntrenador = new ArrayList<>();
		int i=0;
		
		while(i < lstEntrenadores.size()) {
			Entrenador aux= lstEntrenadores.get(i);
			if(aux.getEstrategiaFavorita().equalsIgnoreCase(estrategiaFavorita)) {
				estrategiaEntrenador.add(aux);
			}
			i++;
		}
		return estrategiaEntrenador;
	} 
	
	//*Jugador*
	
	public boolean agregarJugador(String apellido, String nombre, int dni, LocalDate fechaNacimiento, float estatura,
			float peso, int posicion, int nroCamiseta) throws Exception{
		 if (traerJugadorDni(dni) != null) {
	            throw new Exception("Ya existe un jugador con el DNI: " + dni);
	        }
		
		 int id = 1;
		 if(!lstJugadores.isEmpty()) {
			 id= lstJugadores.get(lstJugadores.size()-1).getIdJugador()+1;
		 }
		 
		Jugador nuevo = new Jugador(id,apellido,nombre,dni,fechaNacimiento,id, estatura,peso, posicion,nroCamiseta);
        return lstJugadores.add(nuevo);
    }
	public Jugador traerJugadorDni(int dni) {
		int i = 0;
		Jugador jugador = null;
		while(i<lstJugadores.size() && jugador==null) {
			if(lstJugadores.get(i).getDni() == dni) {
				jugador=lstJugadores.get(i);
			}
			i++;	
		}
		return jugador;
	}
	
	
	public List<Jugador> traerJugadoresPorFecha(LocalDate desde, LocalDate hasta){
		List<Jugador> jugadores = new ArrayList<>();
		int i=0;
		while(i<lstJugadores.size()) {
			Jugador jugador = lstJugadores.get(i);
			LocalDate fechaNacimiento=jugador.getFechaNacimiento();
			if((fechaNacimiento.isEqual(desde)||fechaNacimiento.isAfter(desde)) &&(fechaNacimiento.isEqual(hasta)||fechaNacimiento.isBefore(hasta))) {
				jugadores.add(jugador);
			}
			i++;
		}
		return jugadores;
	}
	
	/*Equipo*/
	public boolean agregarEquipo(String nombre, Entrenador entrenador, LocalDate fundacion) {
	    int id = 1;
	    if (!lstEquipos.isEmpty()) {
	        id = lstEquipos.get(lstEquipos.size() - 1).getIdEquipo() + 1;
	    }
	    // No necesitamos pasar generateCodigo, el constructor lo hace automáticamente
	    Equipo equipo = new Equipo(id, nombre, entrenador, fundacion);
	    return lstEquipos.add(equipo);
	}
	
	public Equipo traerEquipo(int idEquipo) {
		Equipo equipo = null;
		int i=0;
		while (i < lstEquipos.size() && equipo == null) {
			if(lstEquipos.get(i).getIdEquipo()== idEquipo) {
				equipo = lstEquipos.get(i);
			}
		i++;
		}
	return equipo;
	}
	
	public List<Equipo> traerEquiposFechaFundacion(LocalDate antes){
		List<Equipo> equipos = new ArrayList<>();
		int i=0;
		while(i<lstEquipos.size()) {
			Equipo equipo = lstEquipos.get(i);
			if(equipo.getFundacion().isBefore(antes)) {
				equipos.add(equipo);			
				}
			i++;
		}
		return equipos;
	}

	//*********************************** Partido ****************************************
	public boolean agregarPartido(int fechaFixture, LocalDate fecha, Equipo visitante, Equipo local, String estadio, String resultado) {
	    int id = 1;
	    if (!lstPartidos.isEmpty()) {
	        id = lstPartidos.get(lstPartidos.size() - 1).getIdPartido() + 1; // si el id de Partido fuera int
	    }
	    Partido partido = new Partido(id, fechaFixture, fecha, visitante, local, estadio, resultado);
	    return lstPartidos.add(partido);
	}
	
	public Partido traerPartidoId(int id) {
		int i = 0;
		Partido partido = null;
		while(i<lstPartidos.size() && partido == null) {
			if(lstPartidos.get(i).getIdPartido() == id) {
				partido=lstPartidos.get(i);
			}
			i++;	
		}
		return partido;
	}
	
	//Eliminar partido y equipo esta en torneo. 
	
	public boolean agregarTorneo(int idTorneo, String nombre, LocalDate fechaInicio, LocalDate fechaFin, String temporada) {
	
		Torneo torneo = traerTorneo(idTorneo);
		int id= 1;
		if(lstTorneos.size()>0) {
			id = lstTorneos.get(lstTorneos.size()-1).getIdTorneo()+1;
		}
		
		torneo= new Torneo(id, temporada, fechaFin, fechaFin, temporada);
		return lstTorneos.add(torneo);
	}
	
	public Torneo traerTorneo(int idTorneo) {
		Torneo torneo = null;
		int i= 0;
		while (i < lstTorneos.size() && torneo == null) {
			if(lstTorneos.get(i).getIdTorneo()== idTorneo) {
				torneo = lstTorneos.get(i);
			}
			i++;
		}
		return torneo;
	}

	// ----- Estadistica
	
	public boolean agregarEstadistica(int cantidadGoles, int asistencias, int minutos, Jugador jugador, Partido partido) {
		
		int id = 1;
	    if (!lstEstadistica.isEmpty()) {
	        id = lstEstadistica.get(lstEstadistica.size() - 1).getIdEstadistica() + 1; // si el id de Partido fuera int
	    }
	    
	    Estadistica e = new Estadistica(id, cantidadGoles, asistencias, minutos, jugador, partido);
	    return lstEstadistica.add(e);
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------------------------
									
						//TABLA GOLEADORES
	
	
	public List<Estadistica> generarTablaGoleadores() {
	    List<Estadistica> goleadores = new ArrayList<Estadistica>();
	    int i = 0;

	    while (i < lstEstadistica.size()) {
	        Estadistica e = lstEstadistica.get(i);

	        // Buscar si ya está el jugador en la lista de goleadores
	        
	        Estadistica existente = null;
	        int j = 0;
	        while (j < goleadores.size() && existente == null) {
	            if (goleadores.get(j).getJugador().equals(e.getJugador())) {
	                existente = goleadores.get(j);
	            }
	            j++;
	        }

	        // Si existe, acumula goles. Si no, lo agrega
	        
	        if (existente != null) {
	            existente.setCantidadGoles(existente.getCantidadGoles() + e.getCantidadGoles());
	        } else {
	            Estadistica nuevo = new Estadistica(e.getIdEstadistica(), e.getCantidadGoles(), e.getAsistencias(), e.getMinutos(), e.getJugador(), e.getPartido());
	            goleadores.add(nuevo);
	        }
	        i++;
	    }

	    // Ordenar de mayor a menor goles (burbuja simple)
	    
	    boolean cambio = true;
	    while (cambio) {
	        cambio = false;
	        int x = 0;
	        while (x < goleadores.size() - 1) {
	            if (goleadores.get(x).getCantidadGoles() < goleadores.get(x + 1).getCantidadGoles()) {
	                Estadistica aux = goleadores.get(x);
	                goleadores.set(x, goleadores.get(x + 1));
	                goleadores.set(x + 1, aux);
	                cambio = true;
	            }
	            x++;
	        }
	    }

	    return goleadores;
	}
//--------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------------------------
	
				//GENERAR TABLA DE ASISTENCIAS
	
	    public List<Estadistica> generarTablaAsistidores() {
	    List<Estadistica> asistidores = new ArrayList<Estadistica>();
	    int i = 0;

	    while (i < lstEstadistica.size()) {
	        Estadistica e = lstEstadistica.get(i);

	        // Buscar si ya está el jugador en la lista de asistidores
	        
	        Estadistica existente = null;
	        int j = 0;
	        while (j < asistidores.size() && existente == null) {
	            if (asistidores.get(j).getJugador().equals(e.getJugador())) {
	                existente = asistidores.get(j);
	            }
	            j++;
	        }

	        // Si existe, acumula asistencias. Si no, lo agrega
	        
	        if (existente != null) {
	            existente.setAsistencias(existente.getAsistencias() + e.getAsistencias());
	        } else {
	            Estadistica nuevo = new Estadistica(e.getIdEstadistica(), e.getCantidadGoles(), e.getAsistencias(), e.getMinutos(), e.getJugador(), e.getPartido());
	            asistidores.add(nuevo);
	        }
	        i++;
	    }

	    // Ordenar de mayor a menor asistencias
	    
	    boolean cambio = true;
	    while (cambio) {
	        cambio = false;
	        int x = 0;
	        while (x < asistidores.size() - 1) {
	            if (asistidores.get(x).getAsistencias() < asistidores.get(x + 1).getAsistencias()) {
	                Estadistica aux = asistidores.get(x);
	                asistidores.set(x, asistidores.get(x + 1));
	                asistidores.set(x + 1, aux);
	                cambio = true;
	            }
	            x++;
	        }
	    }

	    return asistidores;
	}

	
}
