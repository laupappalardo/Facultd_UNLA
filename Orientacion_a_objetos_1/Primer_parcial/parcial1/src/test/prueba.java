package test;

import funciones.Util;
public class prueba {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String codigo = "A2325"; 
		
		char letra = codigo.charAt(0);
		String num = codigo.substring(1,5);
		
		int i=0;
		int suma=0;
		while (i<num.length()) {
			int valor = Character.getNumericValue(num.charAt(i));
			 suma = suma + valor;
			 System.out.println(suma);
			 i=i+1;
		 }
		
		
		//System.out.println(num);
		//System.out.println(aux);
		
		if(letra == 'A' && Util.sumaCadenaNros(num)%2!=0) {
			System.out.println(letra);
			System.out.println(num);
			
			
		} else if(letra == 'B' && Util.sumaCadenaNros(num)%2==0){
			System.out.println(letra);
			System.out.println(num);
		}
	}
}
