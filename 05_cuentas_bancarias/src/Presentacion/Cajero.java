package Presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Movimiento;
import Service.CuentaBancariaLimite;
import Service.CuentaBancariaMovimientos;

/*
Aplicación cajero

Al iniciar el programa, se solicita un saldo inicial y un límite. A partir de ahí, se mostrará
el menú:

1.- Ingresar
2.- Extraer
3.- Saldo y movimientos
4.- Salir 
 */
public class Cajero {
	static CuentaBancariaMovimientos service;//creamos el objeto sin inicializarlo, luego lo inicializamos más abajo

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		double saldo, limite;
		System.out.println("***Bienvenido al cajero de Fran***");
		System.out.println("Ingresa el saldo");
		saldo=sc.nextDouble();
		System.out.println("Ingresa el limite");
		limite=sc.nextDouble();
		service=new CuentaBancariaMovimientos(saldo, limite);
		do {
			mostrarMenu();//llamada a opcion
			opcion=sc.nextInt();
			switch (opcion) {
			//llamamos a funciones independientes por la opcion introducida
			case 1: 
				ingresar();
				break;
			case 2:
				extraer();
				break;
			case 3:
				saldoYMovimiento();
				break;
			case 4:
				System.out.println("¡Hasta luego");
			}				
		}while(opcion!=4);

	}

	//metodo extraer
	static void extraer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor introduce la cantidad a extraer");
		double extraccion=sc.nextDouble();
		service.extraer(extraccion); ;
	}
	//metodo ingresar
	static void ingresar() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor introduce la cantidad a ingresar");
		double ingreso=sc.nextDouble();
		service.ingresar(ingreso);
	}

	//impresión de métodos
	 static void saldoYMovimiento() {
		 System.out.println("Saldo actual: "+service.getSaldo());
		 ArrayList<Movimiento> movimientosBanco=service.obtenerMovimientos();
		 for (Movimiento movimiento : movimientosBanco) {
			 System.out.println(movimiento.getCantidad()+" - "+movimiento.getFechaHora()+" - "+movimiento.getTipo());
		}	 
	 }

	static void mostrarMenu() {
		System.out.println("***Menú cajero***");
		System.out.println("1.-Ingresar");
		System.out.println("2.-Extraer");
		System.out.println("3.-Saldo y movimiento");
		System.out.println("4.-Salir");

	}
}
