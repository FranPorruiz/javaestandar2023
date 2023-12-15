package presentacion;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//primero hacemos que extienda de JFrame
public class MiVentana extends JFrame{
	public MiVentana(String titulo) {
		super(titulo); //constructor con titulo que se hereda de la clase JFrame
		//establecer tamaño, posicion de la ventana y la hacemos visible
		setBounds(100, 50, 600, 400);//las dos primeras son la posicion y las dos ultimas son el tamaño de la ventana
		getContentPane().setBackground(Color.YELLOW);//para poner el color al panel(es lo que cogemos al principio)
		setVisible(true);//para ponerlo visible
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//con esta opcion eliminamos al cerrar
		
	}	
	//incluir un constructor que permita establecer titulo 
	//posicion y tamaño de la ventana
	public MiVentana(String titulo, int x, int y, int w, int h) {
		super(titulo);
		//establecer tamaño, posicion de la ventana y la hacemos visible
		setBounds(x, y, w, h);//las dos primeras son la posicion y las dos ultimas son el tamaño de la ventana
		getContentPane().setBackground(Color.GREEN);//para poner el color al panel(es lo que cogemos al principio)
		inicializarCompronentes();//metodo par alanzar los componentes
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//con esta opcion eliminamos al cerrar
		setVisible(true);//para ponerlo visible, debe ser lo último

	}
	
	//metodo para creacion  y colocación de componentes
	void inicializarCompronentes() {
		setLayout(null);//esto es para que nos permita colocar donde colocar los componentes
		//creacion de componentes
		JLabel lb1=new JLabel("Usuario: ");// de la cocumentacion A display area for a short text string or an image, or both.
		JLabel lb2=new JLabel("Password: ");
		JTextField txtUsuario=new JTextField();//doc: JTextField is a lightweight component that allows the editing of a single line of text.
		JTextField txtPasswprd=new JTextField();
		JButton btnEntrar=new JButton("Entrar");//doc:An implementation of a "push" button.
		//estableciendo las propiedades
		lb1.setBounds(150, 100, 120, 40);
		lb2.setBounds(150, 170, 120, 40);
		txtUsuario.setBounds(350, 100, 120, 30);
		txtPasswprd.setBounds(350, 170, 120, 30);
		btnEntrar.setBounds(150, 300, 80, 30);
		//añadiendo al contenedor con add(ejemplo de polimorfismo)
		add(lb1);
		add(lb2);
		add(txtUsuario);
		add(txtPasswprd);
		add(btnEntrar);
		
		
		
		
	}

}
