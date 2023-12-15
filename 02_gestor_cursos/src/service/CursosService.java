package service;

import java.util.ArrayList;

import model.Curso;

public class CursosService {
	//declaracion de atributos
	private ArrayList<Curso> cursos=new ArrayList<>();
	
	//1- añadir curso nuevo, debe asegurarnos que no se repite el nombre
	//solo se añadira si no existe, si existe no se añade y se devuelve false
	public boolean nueva(String nombre, int duracion, double precio) {
		Curso nuevoCurso=new Curso(nombre, duracion, precio);
		for (Curso curso : cursos) {
			if(curso.getNombre().equals(nombre)) {
				return false;
				
			}	
		}
		cursos.add(nuevoCurso);
		return true;	
	}
	
	//2-Pide el precio maximo y muestra una lista de los cursos
	public  ArrayList<Curso> preciosCursoMax(double precioMax) {
		//creamos un Arraylist auxiliar con los cursos creado
		ArrayList<Curso> auxiliar=new ArrayList<>();
	
		//recorremos el arrailist principal, si el curso es inferios lo añadimos al auxiloiar
		for (Curso curso : cursos) {
			if(curso.getPrecio()<=precioMax) {
				auxiliar.add(curso);
			}	
		}
		//devolvemos el arraylistauxiliar
		return auxiliar;
	}
	
	//3-Pide el nombre del curso y lo elimina
	public void eliminarCurso(String nombre) {
		for (Curso curso : cursos) {
			if(curso.getNombre().equals(nombre)) {
				cursos.remove(curso);
				break;//una vez encontrado, salimos con break
			}
		}
		
		//La interface predicate removIf te hace un for y te elimina 
		//todos los cursos que coinciden con el nombre
		//cursos.removeIf(c->c.getNombre().equals(nombre));
		/*
		//Esta opción es si requerimos el indice
		for (int i = 0; i < cursos.size(); i++) {
			if(cursos.get(i).getNombre().equals(nombre)) {
				cursos.remove(i);
				break;
			}
		}
		*/
	}
	
	//4-Modifica la duracion de uno de ellos
	public void  modificarDuracion(String  nombre, int nuevaDuracion) {
		for (Curso curso : cursos) {
			if(curso.getNombre().equals(nombre)) {
				curso.setDuracion(nuevaDuracion);
				break;//una vez encontrado, salimos con break
			}
		}	
	}
}
