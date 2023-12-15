package geometria;

public class Circulo extends Figura {
	//circulo con el atributo radio
	private double radio;
	public Circulo(String color, double radio) {
		super(color);
		this.radio=radio;	
		}
	
	
	//sobreescribimos el metodo superficie
	@Override
	public double calcSuperficie() {
		//return Math.PI*Math.pow(radio,2)
		return Math.PI*radio*radio;
	}

	
}
