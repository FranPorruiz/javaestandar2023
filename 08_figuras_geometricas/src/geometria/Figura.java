package geometria;

//la clase abstracta porque contiene un metodo abstracto
public  abstract class Figura {
	//La clase figura representa una figura geometrica
	//Toda figura geometrica se caracteriza por un atributo
	//Color
	//Metodo para calcular su superfice
	private String color;
	
	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	//hemos craeado este metodo como abstracto porque no sabemos el contenido
	//al implementarlo asi obligamos a las clases hijas a respetar el formato
	public abstract double calcSuperficie() ;
	
}
