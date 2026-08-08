package funciones;

import java.time.LocalDate;

public class Util {
	   
	public static boolean fechaEntreFechas(LocalDate fechaAComparar, LocalDate fechaDesde, LocalDate fechaHasta) {
		return !(fechaAComparar.isAfter(fechaHasta) || fechaAComparar.isBefore(fechaDesde));
	}
	
	public static boolean fechaEntreFechas2(LocalDate fechaAComparar, LocalDate fechaDesde, LocalDate fechaHasta) {
		return (fechaAComparar.equals(fechaDesde) || fechaAComparar.isAfter(fechaDesde))
				&& (fechaAComparar.equals(fechaHasta) || fechaAComparar.isBefore(fechaHasta));
	}

}
