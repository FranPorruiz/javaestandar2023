package geometria;

public class Triangulo extends Figura {
	//Triangulo, con los atributos base y altura
	private double base, altura;
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base=base;
		this.altura=altura;	
	}
	
	//sobreescribimos el metodo
	@Override
	public double calcSuperficie() {
		return (base*altura)/2;
	}

}
