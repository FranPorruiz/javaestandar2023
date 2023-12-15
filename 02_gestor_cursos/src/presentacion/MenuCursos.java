package presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import service.CursosService;
import model.Curso;


public class MenuCursos {
	static CursosService service=new CursosService();//lo declaramos antes de iniciar el main para que pueda ser usado por los métodos
	//declarados más adelante
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//para no llenar el main con codigo, vamos a generar metodos
		int opcion;
		do {
			mostrarMenu();//llamada a opcion
			opcion=sc.nextInt();
			switch (opcion) {
			//llamamos a funciones independientes por la opcion introducida
			case 1: 
				nuevoCurso();
				break;
			case 2:
				cursosPrecioMax();
				break;
			case 3:
				eliminarCurso();
				break;
			case 4:
				modificarDuracion();
				break;
			case 5:
				System.out.println("¡Hasta luego");		
			}				
		}while(opcion!=5);
	}



	//representacion grafica del menu, tiene que ser estatico porque el main
	//es estatico, todos los metodos que llamen main han de ser estaticos
	static void mostrarMenu() {
		System.out.println("***Menú curso***");
		System.out.println("1.-Nuevo curso");
		System.out.println("2.-Buscar curso por precio máximo");
		System.out.println("3.-Eliminar Curso");
		System.out.println("4.-Modificar duracion curso");
		System.out.println("5-Salir");
	}

	//metodo de nuevo curso
	static void nuevoCurso() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor introduce el nombre del curso");
		String nombre=sc.nextLine();//mejor nextline que nex porque asi lee todas las palabras
		System.out.println("A continuacion la duracion");
		int duracion=sc.nextInt();
		System.out.println("Finalmente el precio");
		double precio=sc.nextDouble();
		if(service.nueva(nombre, duracion, precio)) {
			System.out.println("Curso añadido correctamente");
		}
		else {
			System.out.println("El curso ya existe en el sistema");

		}

	}
	//metodo de precio máximo
	static void cursosPrecioMax() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor introduce precio máximo del curso");
		double precioMax=sc.nextDouble();
		ArrayList<Curso> cursosMax=service.preciosCursoMax(precioMax);//asi recogemos el arraylis que nos devuelve el metodo
		/*
		 * 
		for (int i = 0; i < cursosMax.size(); i++) {
			System.out.println(cursosMax.get(i).toString());	
		}
		*/	
		for (Curso curso : cursosMax) {
			System.out.println(curso.getNombre()+" - " +curso.getDuracion()+" - "+curso.getPrecio());
		}
	}
	
	//metodo de borrar
	static void eliminarCurso() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor introduce nombre del curso a borrar");
		String cursoBorrar=sc.nextLine();
		service.eliminarCurso(cursoBorrar);
	}
	
	//metodo modificar Duracion 
	static void modificarDuracion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor introduce nombre del curso a modificar");
		String nombre=sc.nextLine();
		System.out.println("Por favor introduce la nueva duracion");
		int nuevaDuracion=sc.nextInt();
		service.modificarDuracion(nombre, nuevaDuracion);		
	}

}
