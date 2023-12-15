package Service;

public class CuentaBancaria {
	private double saldo;

	//boton derecho source+crear constructor
	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	public void extraer(double cantidad) {
		saldo-=cantidad;
	}
	
	//getters and setters
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	

}
