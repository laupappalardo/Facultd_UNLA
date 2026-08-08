package funciones;

import java.time.LocalDate;
import java.time.LocalTime;


public class Util {

	
	public static boolean esBisiesto(int anio) {
		
		if(anio%4 == 0 && (anio%100 ==0 && anio %400 ==0)) {
			return true;	
		} 
		return false;		
	} 
	
	public static boolean esFechaValida(LocalDate fecha){
		//Chequeo todas las posibilidades de fechas
		
		if(Util.esBisiesto(fecha.getYear()) && fecha.getDayOfMonth()<=29) {
			return true;
		} 
		
		else if ((fecha.getMonthValue() == 1 || fecha.getMonthValue() == 3 || fecha.getMonthValue() == 5 ||
				fecha.getMonthValue() == 7 || fecha.getMonthValue() == 8 || fecha.getMonthValue() == 10 
				||fecha.getMonthValue() == 12) && fecha.getDayOfMonth()<=31) {
			return true;
		} 
		
		else if ((fecha.getMonthValue() == 4 || fecha.getMonthValue() == 6 || fecha.getMonthValue() == 9 ||
				fecha.getMonthValue() == 11) && fecha.getDayOfMonth()<=30) {
			return true;
		} 
		
		else if (fecha.getMonthValue() == 2 && fecha.getDayOfMonth()<=28) {
			return true;
		}		
		return false;
	}
	
	public static String traerFechaCorta(LocalDate fecha) {
		
		int dia = fecha.getDayOfMonth();
		int mes = fecha.getMonthValue();
		String year = String.valueOf(fecha.getYear());
		String dd;
		String mm;
		if (dia<10) {dd = '0'+ String.valueOf(dia);}else {dd = String.valueOf(dia);}
		if (mes<10) {mm = '0'+ String.valueOf(mes);}else {mm = String.valueOf(mes);}
		
		return dd+"/"+mm+"/"+year;
	}
	
	public static String traerHoraCorta(LocalTime hora) {
		
		int h = hora.getHour();
		int min = hora.getMinute();
		String hh;
		String mm;
		if (h<10) {hh = '0'+ String.valueOf(h);}else {hh = String.valueOf(h);}
		if (min<10) {mm = '0'+ String.valueOf(min);}else {mm = String.valueOf(min);}
		
		return hh+":"+mm;
	}
	
	public static boolean esDiaHabil(LocalDate fecha) {
		if (fecha.getDayOfWeek().getValue()<=5) {return true;}
		return false;
		
	}
	
	public static String traerDiaDeLaSemana(LocalDate fecha) {
		return fecha.getDayOfWeek().toString();
	}
	
	public static String traerMesEnLetras(LocalDate fecha) {
		return fecha.getMonth().toString();
	}
	
	public static String traerFechaLarga(LocalDate fecha) {
		

		String diaLetra = Util.traerDiaDeLaSemana(fecha);
		String diaNum= String.valueOf(fecha.getDayOfMonth());
		String mesLetra = Util.traerMesEnLetras(fecha);
		String yyyy = String.valueOf(fecha.getYear());
		
		return diaLetra+diaNum+"de"+mesLetra+"del"+yyyy;
	}
	
	public static int traerCantDiasDeUnMes(int anio, int mes) {
		
		if(Util.esBisiesto(anio) && mes ==2) {
			return 29;} 		
		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;} 
		else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11){return 30;} 

		return 28;		
	} 
	
	public static double aproximar2Decimal (double valor) {
		/**
		int aux =(int) String.valueOf(valor).charAt(3);
		double redondeo;
		if(aux >=5) {
			
			redondeo = Double.valueOf(String.valueOf(valor).substring(0, 5))+0.01;
		}
		
		else {
			redondeo = Double.valueOf(String.valueOf(valor).substring(0, 5));
		}
		
		return redondeo;*/
		
		return Math.round(valor * 100.0) / 100.0;
		
	} 
	
	public static boolean esNumero(char c) {
	
		if ( c=='0' || c=='1'|| c=='2' || c=='3'|| c=='4'|| c=='5' || c=='6' || c=='7'|| c=='8' || c=='9') {
			return true;
		}
		return false;
	}
	

	 public static boolean esLetra(char c) {
		 if(Util.esNumero(c)) {return false;}
		 return true;
	 }
	
	 public static int sumaCadenaNros(String cadena) {
		 int i=0;
		 int suma=0;
		 while (i<cadena.length()) {
			 int valor = Character.getNumericValue(cadena.charAt(i));
			 suma= suma + valor;
			 i=i+1;
		 }
		 return suma;
	 } 
	 
	
	 public static boolean esCandenaLetras(String cadena) {
		 
		 int i=0;
		 while (i<cadena.length() || Character.isLetter(cadena.charAt(i))) {
			 i=i+1;
		 }
		 if (i == cadena.length()) {return true;}
		 return false;
	 }


	public static boolean fechaEntreFechas(LocalDate fechaAComparar, LocalDate fechaDesde, LocalDate fechaHasta) {
		return !(fechaAComparar.isAfter(fechaHasta) || fechaAComparar.isBefore(fechaDesde));
	}
	
	public static boolean fechaEntreFechas2(LocalDate fechaAComparar, LocalDate fechaDesde, LocalDate fechaHasta) {
		return (fechaAComparar.equals(fechaDesde) || fechaAComparar.isAfter(fechaDesde))
			&& (fechaAComparar.equals(fechaHasta) || fechaAComparar.isBefore(fechaHasta));
	}

	public static boolean fechaEntreHoras(LocalTime horaAComparar, LocalTime horaDesde, LocalTime horaHasta) {
		return !(horaAComparar.isAfter(horaHasta) || horaAComparar.isBefore(horaDesde));
	}
	
	

}