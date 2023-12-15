package presentacion;
import java.util.Scanner;

//importar la clase porque está en otro paquete
import service.Calculadora;

public class ProgramaCalculus {

	public static void main(String[] args) {
		Calculadora cal;
		//declaracion de variables en misma línea, por ser del mismo tipo
		int num1, num2, opcion, factorial;
		//clase para entrada de datos por teclado
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor, introduce el primer número");
		//los introducimos en las variables
		num1=sc.nextInt();
		System.out.println("Por favor, introduce el segundo número");
		num2=sc.nextInt();
		//creamos el objeto calculadora y que reciba los parámetros
		cal=new Calculadora(num1, num2);
		//mediante un bucle  do while, vamos mostrando el menu
		//hasta que seelccione la opción salir
		do {
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir");
			System.out.println("5-Factorial");
			System.out.println("6-Salir");
			opcion=sc.nextInt();
			//comprobamos la opcion elegida y realizamos la operacion correspondiente
			//llamando al método del objeto creado
			switch(opcion) {
				case 1:
					System.out.println(cal.sumar());
					break;
				case 2:
					System.out.println(cal.restar());
					break;	
				case 3:
					System.out.println(cal.multiplicar());
					break;
				case 4:
					System.out.println(cal.dividir());
					break;
				case 5:
					System.out.println("Introduce el número de factorial");
					factorial=sc.nextInt();//esto se podría hacer reutilizando el num1 o num2
					System.out.println("El factorial es"+cal.factorial(factorial));
					break;			
				case 6:
					System.out.println("¡Hasta luego!");
					break;
			}
		}while(opcion!=6);	
		
	}

}
