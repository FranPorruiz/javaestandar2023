package service;

public class Calculadora {
	//declaracion de atributos
	private int num1;
	private int num2;
	
	//constructor, con el nombre de la clase, es public para que se pueda accer
	//recibe dos valores
	public Calculadora(int num1, int num2) {
		//con this el programa sabe que estamos llamando a la variable de clase
		this.num1=num1;
		this.num2=num2;
	}
	
	//metodos con las operaciones a realizar
	//no recibe los atributos porque ya lo recibe la clase
	public int sumar() {
		return num1+num2;
	}
	
	//metodo restar
	public int restar() {
		return num1-num2;
	}
	
	//metodo multiplicar
	public int multiplicar() {
		return num1*num2;	
	}

	//metodo dividir
	public int dividir() {
		return num1/num2;
	}
	
	//metodo factorial
	public int factorial(int n) {
		int resultado=1;
		//mientras i sea menor que el numero vamos multiplicando
		for(int i=2;i<=n;i++) {
			resultado*=i;
		}
		return resultado;	
	}
}
