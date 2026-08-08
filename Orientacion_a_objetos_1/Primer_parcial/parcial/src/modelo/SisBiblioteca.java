package modelo;

import java.util.ArrayList;
import java.time.LocalDate;

public class SisBiblioteca {

	private ArrayList<Estudiante> lstEstudiante;
	private ArrayList<Prestamo> lstPrestamo;
	private ArrayList<Libro> lstLibro;
	
	
	public SisBiblioteca() {
		
		this.lstEstudiante = new ArrayList<Estudiante>();
		this.lstPrestamo = new ArrayList<Prestamo>();
		this.lstLibro = new ArrayList<Libro>();
	}


	public ArrayList<Estudiante> getLstEstudiante() {
		return lstEstudiante;
	}


	public void setLstEstudiante(ArrayList<Estudiante> lstEstudiante) {
		this.lstEstudiante = lstEstudiante;
	}


	public ArrayList<Prestamo> getLstPrestamo() {
		return lstPrestamo;
	}


	public void setLstPrestamo(ArrayList<Prestamo> lstPrestamo) {
		this.lstPrestamo = lstPrestamo;
	}


	public ArrayList<Libro> getLstLibro() {
		return lstLibro;
	}


	public void setLstLibro(ArrayList<Libro> lstLibro) {
		this.lstLibro = lstLibro;
	}


	@Override
	public String toString() {
		return "SisBiblioteca [lstEstudiante=" + lstEstudiante + ", lstPrestamo=" + lstPrestamo + ", lstLibro="
				+ lstLibro + "]";
	}



	public boolean agregarEstudiante(String nombre, String apellido, long dni) {
		
		int nuevoId=0;
		if(!lstEstudiante.isEmpty()) {
			nuevoId = lstEstudiante.get(lstEstudiante.size()-1).getId()+1;
		}
		
		Estudiante e = new Estudiante(nuevoId, nombre, apellido, dni);
		
		return lstEstudiante.add(e);
	}

	public boolean agregarLibro(String titulo, String isbn, String autor, String editorial) throws Exception {
		
		int nuevoId=0;
		if(!lstLibro.isEmpty()) {
			nuevoId = lstLibro.get(lstLibro.size()-1).getId()+1;
		}
		
		Libro l = new Libro(nuevoId, titulo, isbn, autor, editorial);
		
		return lstLibro.add(l);
	}
	
	public Estudiante traer(long dni) {
		Estudiante e = null;
		int i=0;
		while( i<lstEstudiante.size() && e==null) {
			
			if(lstEstudiante.get(i).getDni() == dni) {e = lstEstudiante.get(i);}
			
			i++;
			
		}
		
		
		return e;
	}
	
	public Libro traer(String isbn) {
		Libro l = null;
		int i=0;
		while( i<lstLibro.size() && l==null) {
			
			if(lstLibro.get(i).getIsbn().equalsIgnoreCase(isbn)) {l = lstLibro.get(i);}
			
			i++;
			
		}
		
		return l;		
	}
	
	public int traerCantPrestamos(Estudiante e) {
		int cant = 0;
		
		for(int i=0; i<lstPrestamo.size(); i++ ) {
			if (lstPrestamo.get(i).getEstudiante().equals(e) && lstPrestamo.get(i).isDevolucion() == false) {
				cant=cant+1;
			}
		}
		return cant;
	}
	
	public boolean agregarPrestamo(LocalDate fechaPrestamo, Estudiante estudiante, Libro libro) throws Exception{

		if(traerCantPrestamos(estudiante)>=2) {throw new Exception ("El alumno ya tiene 2 prestamos");}
		
		int nuevoId=0;
		if(!lstPrestamo.isEmpty()) {
			nuevoId = lstPrestamo.get(lstPrestamo.size()-1).getId()+1;
		}
		
		Prestamo p = new Prestamo(nuevoId,  fechaPrestamo,  estudiante,  libro);
				
		return lstPrestamo.add(p);
	}
	
	public ArrayList<Prestamo> traer(LocalDate fechaDevolucion, boolean devolucion){
		
		ArrayList<Prestamo> lst = new ArrayList<Prestamo> ();
		
		for(Prestamo p : lstPrestamo) {
			if(p.getFechaDevolucion().equals(fechaDevolucion) && p.isDevolucion()==devolucion) {
				
				lst.add(p);
			}
			
		}
		
		return lst;
		
	}
	
	

	
}
