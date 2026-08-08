package test;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String isbn = "9786071514684";
		
		String [] digito = isbn.split("");
		int i=0;
		int sumaDigIndPar =0;
		int sumaDigIndImpar=0;
		
		for(i=0; i<12; i++) {
			int aux =Integer.parseInt(digito[i]);
			System.out.println(i);
			if(i==0 || i%2 ==0) {sumaDigIndPar = sumaDigIndPar + aux; 
			System.out.println("estoy sumando par" + sumaDigIndPar );
			}
			
			else { sumaDigIndImpar = sumaDigIndImpar + aux;
			System.out.println("estoy sumando impar " + sumaDigIndImpar);
			}
			
		}
		
		//System.out.println("sali del for");
		int suma = sumaDigIndPar + (3*sumaDigIndImpar);
		int digitoControl = 10- (suma%10);
		
		System.out.println(digito[12]);
		System.out.println(digitoControl);

	}

}
