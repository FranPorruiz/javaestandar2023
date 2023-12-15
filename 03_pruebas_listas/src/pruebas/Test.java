package pruebas;

import java.util.ArrayList;//es neceseario importar esto para hacer arraylist

public class Test {

	public static void main(String[] args) {
		//prueba de Arraylist de String
		ArrayList<String> dias=new ArrayList<>();
		dias.add("Lunes");
		dias.add("Martes");
		dias.add("Miércoles");
		//añadiendo por posicion
		dias.add(1, "Jueves");
		//for para recorrerlo
		System.out.println("For normal");
		//System.out.println("\n ");
		for(int i=0;i<dias.size();i++) {
			System.out.println(dias.get(i));
		}
		//remove, para elemir un elemento
		dias.remove(0);
		System.out.println("For each");
		//for each, recorreo todos los elementos de la Arraylist dias
		for(String s:dias) {
			System.out.println(s);
		}
	}

}
