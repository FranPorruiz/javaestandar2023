package pruebas;

public class Test {
	
	//pruebas de lambda, solo se  pueden con interfaces con un solo metodo
	interface I1{
		void print(int a);
	}
	
	interface I2{
		int cal(String s);
	}
	
	interface I3{
		String construct(int a, int b);
	}
	
	interface I4{
		boolean test(int a, int b);
	}
	
	interface I5{
		int get();
	}
	
	interface I6{
		void tx(String a , int b);
	}

	public static void main(String[] args) {
		//si solo se va a devolver una cosa, se pueden omitir los parametros de la funcion
		I1 i1=a->System.out.println(a);
		
		//esto se podria signifilicar y quitar los corchetes y el return
		I2 i2=s->{
			 return s.length();	
		};
		
		//al recibir varias variables hay que incluirlas entre parentesis
		I3 i3=(a,b)->a+" "+b;
		
		//if en lambda
		I4 i4=(a,b)->a==b;
		
		//Como nos pide que nos devuelva un int, pero no nos precisa que variable
		//asi que incluimos un numero al azar y no recibe nada
		I5 i5=()->0;
		
		//ESto n nos devuelve nada, así que 
		I6 i6=(a,b)->System.out.println(a+b);
			
	
	}

}
