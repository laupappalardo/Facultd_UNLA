package test;
import modelo.Jugador;
import modelo.Partido;
import modelo.Equipo;
import modelo.Estadistica;
import modelo.Torneo;
import modelo.Posicion;
import java.time.LocalDate;
import modelo.SistemaTorneoFutbol;
import java.util.ArrayList;
import java.util.List;

public class TestSistema {

	public static void main(String[] args) {

		SistemaTorneoFutbol sistema = new SistemaTorneoFutbol();

		// ------------------- Entrenadores -------------------
		sistema.agregarEntrenador("Gomez", "Carlos", 12345678, LocalDate.of(1978, 5, 16), "4-4-2");
		sistema.agregarEntrenador("Martinez", "Luis", 22345678, LocalDate.of(1959, 6, 10), "4-3-3");
		sistema.agregarEntrenador("Perez", "Jorge", 3245678, LocalDate.of(1958, 12, 1), "3-5-2");
		sistema.agregarEntrenador("Suarez", "Andres", 42345678, LocalDate.of(1980, 12, 17), "5-3-2");
		
	//	System.out.println("Lista de entrenadores \n" + sistema.getLstEntrenadores());
	//	System.out.println("Traer un entrenador \n" + sistema.traerEntrenador(12345678));
	//	System.out.println("Entrenador por Estrategia\n" + sistema.traerEntrenadoresPorEstrategia("4-3-3"));
	//	System.out.println("Eliminar entrenador\n" + sistema.eliminarEntrenador(42345678));

		// ------------------- Jugadores -------------------
		try {
			sistema.agregarJugador("Perez", "Juan", 12345678, LocalDate.of(2000, 2,10), 1.80f, 70f, 10, 10);
			sistema.agregarJugador("Lopez", "Martin", 87654321, LocalDate.of(1998, 6, 12), 1.82f, 75f, 2, 7);
			sistema.agregarJugador("Diaz", "Lucas", 11111111, LocalDate.of(2001, 4, 18), 1.75f, 78f, 5, 1);
			sistema.agregarJugador("Ruiz", "Franco", 22222222, LocalDate.of(1999, 11, 3), 1.85f, 75f, 1, 9);
			sistema.agregarJugador("Torres", "Agustin", 33333333, LocalDate.of(2002, 7, 21), 1.78f, 80f, 10, 5);
			
			sistema.agregarJugador("Gonzalez", "Diego", 44444444, LocalDate.of(1999, 2, 4), 1.83f, 77f, 1, 8);
			sistema.agregarJugador("Romero", "Nicolas", 55555555, LocalDate.of(1997, 9, 10), 1.80f, 76f, 2, 6);
			sistema.agregarJugador("Sosa", "Rodrigo", 66666666, LocalDate.of(2000, 12, 12), 1.74f, 79f, 5, 11);
			sistema.agregarJugador("Vera", "Matias", 55575555, LocalDate.of(2002, 1, 5), 1.79f, 76f, 10, 6);
			sistema.agregarJugador("Castro", "Pablo", 66696666, LocalDate.of(1998, 5, 22), 1.81f, 79f, 2, 11);
			
			sistema.agregarJugador("Cabrera", "Emiliano", 44464444, LocalDate.of(1999, 3, 14), 1.86f, 77f, 1, 8);
			sistema.agregarJugador("Morales", "Javier", 55555955, LocalDate.of(2001, 10, 19), 1.79f, 76f, 2, 6);
			sistema.agregarJugador("Rivas", "Gonzalo", 66666966, LocalDate.of(2000, 8, 30), 1.77f, 79f, 5, 11);
			sistema.agregarJugador("Fernandez", "Lautaro", 52555555, LocalDate.of(2003, 2, 17), 1.83f, 76f, 10, 6);
			sistema.agregarJugador("Blanco", "Mateo", 66666636, LocalDate.of(2002, 4, 23), 1.72f, 79f, 5, 11);
			
			sistema.agregarJugador("Herrera", "Facundo", 44474444, LocalDate.of(1998, 12, 8), 1.84f, 77f, 1, 8);
			sistema.agregarJugador("Ramos", "Ignacio", 55555455, LocalDate.of(1999, 9, 1), 1.80f, 76f, 2, 6);
			sistema.agregarJugador("Benitez", "Tomas", 66661666, LocalDate.of(2000, 5, 15), 1.74f, 79f, 5, 11);
			sistema.agregarJugador("Luna", "Sebastian", 55535555, LocalDate.of(2001, 7, 7), 1.81f, 76f, 10, 6);
			sistema.agregarJugador("Correa", "Enzo", 66666266, LocalDate.of(2002, 3, 28), 1.78f, 79f, 2, 11);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//for(Jugador j: sistema.getLstJugadores()) {
		//	System.out.println(j);
		//}
		
	//	System.out.println("Traer Jugador" + sistema.traerJugadorDni(11111111));

		// ------------------- Equipos -------------------
		// Traer entrenadores del sistema

		sistema.agregarEquipo("Leones", sistema.traerEntrenador(12345678), LocalDate.of(2010, 1, 1));
		sistema.agregarEquipo("Tigres", sistema.traerEntrenador(22345678), LocalDate.of(2012, 3, 15));
		sistema.agregarEquipo("Halcones", sistema.traerEntrenador(3245678), LocalDate.of(2015, 7, 20));
		sistema.agregarEquipo("Lobos", sistema.traerEntrenador(42345678), LocalDate.of(2013, 9, 5));

	//	System.out.println("Lista de equipos: " + sistema.getLstEquipos());
	///	System.out.println("Traer equipo" + sistema.traerEquipo(2));

		// ------------------- Torneos -------------------
		sistema.agregarTorneo(1, "Torneo Clausura 2025", LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 14), "Verano 2025");
		
	//	System.out.println("Torneo agregado: " + sistema.getLstTorneos());
	//	System.out.println("Traer torneo" + sistema.traerTorneo(3));
		
		// ------------- Agregar Jugadores a los equipos     
		sistema.traerEquipo(1).getLstJugador().add(sistema.traerJugadorDni(12345678));
		sistema.traerEquipo(1).getLstJugador().add(sistema.traerJugadorDni(87654321));
		sistema.traerEquipo(1).getLstJugador().add(sistema.traerJugadorDni(11111111));
		sistema.traerEquipo(1).getLstJugador().add(sistema.traerJugadorDni(22222222));
		sistema.traerEquipo(1).getLstJugador().add(sistema.traerJugadorDni(33333333));
		     
		sistema.traerEquipo(2).getLstJugador().add(sistema.traerJugadorDni(44444444));
		sistema.traerEquipo(2).getLstJugador().add(sistema.traerJugadorDni(55555555));
		sistema.traerEquipo(2).getLstJugador().add(sistema.traerJugadorDni(66666666));
		sistema.traerEquipo(2).getLstJugador().add(sistema.traerJugadorDni(55575555));
		sistema.traerEquipo(2).getLstJugador().add(sistema.traerJugadorDni(66696666));
		    
		sistema.traerEquipo(3).getLstJugador().add(sistema.traerJugadorDni(44464444));
		sistema.traerEquipo(3).getLstJugador().add(sistema.traerJugadorDni(55555955));
		sistema.traerEquipo(3).getLstJugador().add(sistema.traerJugadorDni(66666966));
		sistema.traerEquipo(3).getLstJugador().add(sistema.traerJugadorDni(52555555));
		sistema.traerEquipo(3).getLstJugador().add(sistema.traerJugadorDni(66666636));
		
		sistema.traerEquipo(4).getLstJugador().add(sistema.traerJugadorDni(44474444));
		sistema.traerEquipo(4).getLstJugador().add(sistema.traerJugadorDni(55555455));
		sistema.traerEquipo(4).getLstJugador().add(sistema.traerJugadorDni(66661666));
		sistema.traerEquipo(4).getLstJugador().add(sistema.traerJugadorDni(55535555));
		sistema.traerEquipo(4).getLstJugador().add(sistema.traerJugadorDni(66666266));
		    
		System.out.println("Jugadores en Leones: " + sistema.traerEquipo(1).getLstJugador().size());
		System.out.println("Jugadores en Tigres: " + sistema.traerEquipo(2).getLstJugador().size());
		System.out.println("Jugadores en Halcones: " + sistema.traerEquipo(3).getLstJugador().size());
		System.out.println("Jugadores en Lobos: " + sistema.traerEquipo(4).getLstJugador().size());
		
		/// Equipos en torneo
		sistema.traerTorneo(1).getLstEquipo().add(sistema.traerEquipo(1));
		sistema.traerTorneo(1).getLstEquipo().add(sistema.traerEquipo(2));
		sistema.traerTorneo(1).getLstEquipo().add(sistema.traerEquipo(3));
		sistema.traerTorneo(1).getLstEquipo().add(sistema.traerEquipo(4));

		System.out.println("Equipos en torneo: " + sistema.traerTorneo(1).getLstEquipo().size());

		/// Altura promedio
		System.out.println("Altura promedio Leones: " + sistema.traerEquipo(1).calcularAlturaPromedio() + " m");
		System.out.println("Altura promedio Tigres: " + sistema.traerEquipo(2).calcularAlturaPromedio() + " m");
		System.out.println("Altura promedio Halcones: " + sistema.traerEquipo(3).calcularAlturaPromedio() + " m");
		System.out.println("Altura promedio Lobos: " + sistema.traerEquipo(4).calcularAlturaPromedio() + " m");
		
		// ----Jugadores por fecha de nacimiento
		System.out.println("\nJugadores por fecha nacimiento\n"
				+ sistema.traerJugadoresPorFecha(LocalDate.of(1995, 1, 1), LocalDate.of(2000, 12, 31)));

		/// ----Equipor por fecha fundacion
		System.out.println(
				"\nEquipos fundados antes de 2008\n" + sistema.traerEquiposFechaFundacion(LocalDate.of(2013, 1, 1)));

		System.out.println("Equipo con mayor promedio de altura" + sistema.traerTorneo(1).equipoMayorAltura());
		
		//---- Agregar Partidos
		
		sistema.agregarPartido(1, LocalDate.of(2025, 10, 10), sistema.traerEquipo(1),sistema.traerEquipo(2), "cancha 1", "2-1");
		sistema.agregarPartido(2, LocalDate.of(2025, 10, 17), sistema.traerEquipo(3),sistema.traerEquipo(4), "cancha 2", "1-1");
		sistema.agregarPartido(3, LocalDate.of(2025, 10, 24), sistema.traerEquipo(1),sistema.traerEquipo(3), "cancha 1", "3-0");
		sistema.agregarPartido(4, LocalDate.of(2025, 10, 31), sistema.traerEquipo(2),sistema.traerEquipo(4), "cancha 2", "0-2");
		sistema.agregarPartido(5, LocalDate.of(2025, 10, 7), sistema.traerEquipo(1),sistema.traerEquipo(4), "cancha 1", "1-3");
		sistema.agregarPartido(6, LocalDate.of(2025, 10, 14), sistema.traerEquipo(2),sistema.traerEquipo(3), "cancha 2", "2-2");
		
		for(Partido p: sistema.getLstPartidos()) {
			System.out.println(p);
		}
		
		//---- Agregar Estadistica cantidadGoles, asistencias, minutos, jugador, partido
		
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(12345678), sistema.traerPartidoId(1));
		sistema.agregarEstadistica(1, 0, 85, sistema.traerJugadorDni(33333333), sistema.traerPartidoId(1));
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(55575555), sistema.traerPartidoId(1));
	
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(52555555), sistema.traerPartidoId(2));
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(55535555), sistema.traerPartidoId(2));
	
		sistema.agregarEstadistica(2, 0, 90, sistema.traerJugadorDni(12345678), sistema.traerPartidoId(3));
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(33333333), sistema.traerPartidoId(3));
	
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(55535555), sistema.traerPartidoId(4));
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(66666266), sistema.traerPartidoId(4));
		
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(33333333), sistema.traerPartidoId(5));
		sistema.agregarEstadistica(2, 0, 80, sistema.traerJugadorDni(55535555), sistema.traerPartidoId(5));
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(66666266), sistema.traerPartidoId(5));
	
		sistema.agregarEstadistica(1, 0, 80, sistema.traerJugadorDni(66666666), sistema.traerPartidoId(6));
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(55575555), sistema.traerPartidoId(6));
		sistema.agregarEstadistica(1, 0, 85, sistema.traerJugadorDni(66666966), sistema.traerPartidoId(6));
		sistema.agregarEstadistica(1, 0, 90, sistema.traerJugadorDni(52555555), sistema.traerPartidoId(6));
	
		for(Estadistica e: sistema.getLstEstadistica()) {
			System.out.println(e);
		}
		
		Torneo T = sistema.traerTorneo(1);
		T.agregarPartidoEnTorneo(sistema.traerPartidoId(1));
		T.agregarPartidoEnTorneo(sistema.traerPartidoId(2));
		T.agregarPartidoEnTorneo(sistema.traerPartidoId(3));
		T.agregarPartidoEnTorneo(sistema.traerPartidoId(4));
		T.agregarPartidoEnTorneo(sistema.traerPartidoId(5));
		T.agregarPartidoEnTorneo(sistema.traerPartidoId(6));
		
		List<Posicion> tablaPosicion = new ArrayList<Posicion>();
		tablaPosicion = T.generarTablaPosicion();
		
		for(Posicion p :tablaPosicion) {
			System.out.println(p);
		}
		
		//MIS TABLAS 
		
		
		//-------------------------------
		//TABLA GOLEADORES 
		//-------------------------------
		List<Estadistica> tablaGoleadores = new ArrayList<Estadistica>();
		tablaGoleadores = sistema.generarTablaGoleadores();

		System.out.println("\nTabla de Goleadores:");

		//BUCLE PARA BUSCAR EL NOMBRE DEL EQUIPO (para cada elemento de estadistica que contiene 
		//la tabla compara jugador con la lista de jugadores del equipo para saber si pertenece o no a ese)
		
		for (Estadistica e : tablaGoleadores) {
		    String nombreEquipo = "Sin equipo";
		    for (Equipo eq : sistema.getLstEquipos()) {
		        if (eq.getLstJugador().contains(e.getJugador())) {
		            nombreEquipo = eq.getNombre();
		            break;
		        }
		    }

		    System.out.println("Jugador: " + e.getJugador().getNombreCompleto()
		        + " - Equipo: " + nombreEquipo
		        + " - Goles: " + e.getCantidadGoles());
		}

		//-----------------------
		// TABLA DE ASISTIDORES
		//-----------------------
		List<Estadistica> tablaAsistidores = new ArrayList<Estadistica>();
		tablaAsistidores = sistema.generarTablaAsistidores();

		System.out.println("\nTabla de Asistidores:");
		
		//BUCLE PARA BUSCAR EL NOMBRE DEL EQUIPO (para cada elemento de estadistica que contiene 
		//la tabla compara jugador con la lista de jugadores del equipo para saber si pertenece o no a ese)

		for (Estadistica e : tablaAsistidores) {
		    String nombreEquipo = "Sin equipo";
		    for (Equipo eq : sistema.getLstEquipos()) {
		        if (eq.getLstJugador().contains(e.getJugador())) {
		            nombreEquipo = eq.getNombre();
		            break;
		        }
		    }

		    System.out.println("Jugador: " + e.getJugador().getNombreCompleto()
		        + " - Equipo: " + nombreEquipo
		        + " - Asistencias: " + e.getAsistencias());
		}
	}
}
		