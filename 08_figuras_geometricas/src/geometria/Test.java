package geometria;

public class Test {

	public static void main(String[] args) {
		/*Circulo circ=new Circulo("Rojo", 5);
		System.out.println(circ.calcSuperficie());
		Triangulo trig=new Triangulo("Azul",4,2);
		System.out.println(trig.calcSuperficie());
		*/
		mostrarDatos(new Triangulo("Azul",4,2));
		mostrarDatos(new Circulo("Rojo", 5));
		
		}
	
	//con este metodo, usamos el polimorfismos para lanzar los metodos diferencias en cada clase
	static void mostrarDatos(Figura f) {
		System.out.println("Color: "+f.getColor()+". Superficie: "+f.calcSuperficie());
		
	}
}
