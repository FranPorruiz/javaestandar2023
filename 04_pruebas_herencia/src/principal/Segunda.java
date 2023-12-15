package principal;

public class Segunda extends Primera{
	public Segunda() {
		super(3);//en este caso le estamos diciendo que llame al construcot de la clase perimera, y tneemos que introducir una variable
		System.out.println("Constructor de segunda");
	}
	//con el boton derecho +source+override podemos lanzar la sobreescritura dle metodo
	@Override
	public void print() {
		System.out.println("Imprimiendo en segunda");
	}
	
	
}
