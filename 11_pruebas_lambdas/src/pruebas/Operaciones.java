package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Operaciones {
	public static void main(String[] args) {
		List<Integer> enteros=List.of(8,5,-2,4,1,7,12);
		Predicate<Integer> pares = i -> (i%2==0);  //hemos creado un interfaz llamada pares que nos divide entre dos 
		System.out.println("***Pares***");
		print(enteros, pares);
		//otro predicaod que imprima los negativos
		//el predicado  se puede pasar directamente, sin crear el predicado antes
		System.out.println("***Negativos***");
		print(enteros, n->n<0);
		
		//llamar al metodo transformar. coger la coleccion de enteros, y coger una coleccion con las raices cuadradas de cada entero
		//genera la coneccion lanzando el metodo, con la coleccion de enteros y la funcion
		Collection<Double> raices=transforma(enteros, x -> Math.sqrt(x));
		System.out.println(raices);
	}
	//metodo que muestra todos lo números de la coleccion recibida
	//como parámetro y que cumplen la condicion recibida tambien
	//como parametro
	static void print(Collection<Integer> numeros, Predicate<Integer> pr)  {
		//essto hace un foreach y usa el predicate para comprobar si el integer reune la condicion
		//si es así lo imprime
		for (Integer integer : numeros) {
			if(pr.test(integer)) {
				System.out.println(integer);
			}
		}
	}
	
	//metodo que recibe una coleccione de enteros y devuelve una coleccion de doubles
	//resultante de transformar cada entero de la coleccion en un double , según 
	//la operacion de transformación recibida como parametro
	//Usando la interfaz Function
	static Collection<Double> transforma(Collection<Integer> integers, Function<Integer, Double> ft){
		ArrayList<Double> resultado=new ArrayList<Double>();
		for (Integer integer : integers) {
			resultado.add(ft.apply(integer));//esto lo que hace es aplicar la funcióon a la list y convertirla el doble, luego la añade
		}
		return resultado;	
	}
}


