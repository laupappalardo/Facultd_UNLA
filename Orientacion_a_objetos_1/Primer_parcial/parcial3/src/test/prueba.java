package test;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux = "D3FR";
		 
		 int i=0;
		 while (i<aux.length()) {
			 
			 
			 System.out.println(Character.isLetter(aux.charAt(i)));
			 i=i+1;
		 }
		 
		 System.out.println(aux.length());
		
	}
	
	
}
