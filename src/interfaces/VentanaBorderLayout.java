package interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class VentanaBorderLayout {
	private JFrame ventana;
	public VentanaBorderLayout(){
		ventana = new JFrame();
		ventana.setTitle("Titulo de la ventana");
		ventana.setSize(new Dimension(300,200));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		BorderLayout miLayout = new BorderLayout(10,10);
		ventana.getContentPane().setLayout(miLayout);
		
		JLabel etiqueta = new JLabel("Mi etiqueta");
		ventana.getContentPane().add(etiqueta, miLayout.NORTH);
		
		JButton boton = new JButton("Aceptar");
		boton.setPreferredSize(new Dimension(100, 0));
		ventana.getContentPane().add(boton, BorderLayout.WEST);
		
		JLabel etiquetaSur = new JLabel("Mi etiqueta sur");
		ventana.getContentPane().add(etiquetaSur, miLayout.SOUTH);
		
		JTextPane etiquetaEste = new JTextPane();
		etiquetaEste.setText("Zona este");
		ventana.getContentPane().add(etiquetaEste, BorderLayout.EAST);
	}
	
	
	public static void main(String[] args) {
		VentanaBorderLayout m = new VentanaBorderLayout();
		
	}
}
