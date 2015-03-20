package interfaces;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutDemo window = new CardLayoutDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CardLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//para crear un layout y asignarselo al frame
		BorderLayout miLayout = new BorderLayout();
		frame.setLayout(miLayout);
		//creamos botones
		JButton boton1 = new JButton("Anterior");
		JButton boton2 = new JButton("Siguiente");
		/*
		frame.add(boton1, BorderLayout.NORTH);
		frame.add(boton2, BorderLayout.NORTH); No se puede hacer, en un border layout solo puede haber 1 elemento por zona
		*/
		//creamos un layout que contendra los botones
		//contenedor
		JPanel jp = new JPanel();
		//layout que asignaremos al contentedor, indicamos primero su contenedor y despues el tipo de boxlayout
		BoxLayout bl = new BoxLayout(jp, BoxLayout.X_AXIS);
		//añado al contenedor el boxlayout y los botones
		jp.setLayout(bl);
		jp.add(boton1);
		jp.add(boton2);
		//añado el contenedor que hemos creado a nuestro frame
		frame.add(jp, BorderLayout.NORTH);
		
		//creamos un nuevo panel
		JPanel card = new JPanel();
		//layout del panel
		CardLayout cl = new CardLayout();
		//añadimos el layout al panel
		card.setLayout(cl);
		//paneles que añadiremos al cardlayout
		JPanel panel1 = new JPanel();
		JLabel etiqueta1 = new JLabel("Este es el panel numero 1");
		panel1.add(etiqueta1);
		
		JPanel panel2 = new JPanel();
		JLabel etiqueta2 = new JLabel("Este es el panel numero 2");
		panel2.add(etiqueta2);
		
		JPanel panel3 = new JPanel();
		JLabel etiqueta3 = new JLabel("Este es el panel numero 3");
		panel3.add(etiqueta3);
		
		//añadimos los dos paneles al contenedor con cardlayout
		card.add(panel1);
		card.add(panel2);
		card.add(panel3);
		
		//añadimos el cardlayout al frame principal
		frame.add(card, BorderLayout.CENTER);
		
		//funciones para los botones
		boton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//sobre el cardlayout se hace un cambio hacia el contenedor siguiente, se pasa por parametros el contenedor que lo contiene
				cl.previous(card);
			}
		});
		boton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.next(card);
			}
		});
		
	}

}
