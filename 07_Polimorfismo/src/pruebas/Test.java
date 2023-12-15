package pruebas;

public class Test {
	public static void main(String[] args) {
		/*crear un objeto primero y un objeto segunda y llamar a ptin
		Primera pr=new Primera(5);
		pr.print();
		Segunda sg=new Segunda(4, "hola");
		sg.print();
		*/
		
		//este sistema nos permite que con un mismo metodo, podemos
		//llamar a dos objeto diferentes, pero que cad auno lance su propio metodo
		llamadas(new Primera(5));
		llamadas(new Segunda(4,"Marca"));
		Number b;
		System.out.println(cuadrado(5));
		//mostramos valor entero dle número generado aleatoriamente
		
	}
	/*Realizar un método que calcule el cuadrado de cualquier tipo de número, el resultado se devuelve
	como entero (int) */
	//esto es un ejemplo de polimorfismos
	//el metodo recibe una super clase de int,double, y floar y luego el metodo en comun
	 static int cuadrado(Number number) {
		return number.intValue()*number.intValue();
		
	}
	static void llamadas(Base b) {
		b.print();
	}
	//haz un metodo que duvuela, aleatoriamente un Double, un integer o un Long
	
	private static Number getRandomNumber() {
		int numberType=(int)(Math.random()*3+1);//nos genera un numero aleatorio entre 1 y 3
		switch(numberType){
			case 1:
				return Double.valueOf(3.45);//se devuelve un Doble
			case 2:
				return Integer.valueOf(200);//se devuelve un integer
			default:
				return Long.valueOf(30);//se devuelve Long
		}
	}
}
