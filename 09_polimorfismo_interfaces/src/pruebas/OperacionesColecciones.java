package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OperacionesColecciones {

	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); //hacemos una List que es la clase padre que nos permita incluir ArrayList, esto podria ser un vector
        list.add(4);
        list.add(8);
        list.add(5);
        list.add(17);
        System.out.println("La suma de los números es "+sumatorio(list));
        System.out.println("Los pares son: "+pares(list));
	}
	
	//realizar un metodo que reciba una lista de Integer
	// y devuelva la suma de todos los numeros de la lista
	static  int sumatorio(List<Integer> lista) {
		int sumatorio=0;	
		for (Integer integer : lista) {
			sumatorio+=integer;		
		}	
		return sumatorio;	
	}
	
	//realizar un metodo que reciba una coleccion de enteros(Integer)
	//y devuelva una lista con los pares de esa coleccion
	//usamos colección que nos permite mayor versatibilidad y que reciba multiples tipos de lista, porque coleccion es la supra clase 
	static List<Integer> pares(Collection<Integer> lista){
		List<Integer> pares=new ArrayList<Integer>();
		for (Integer integer : lista) {
			if(integer%2==0) {
				pares.add(integer);			
			}
		}
		return pares;	
	}
	
}
