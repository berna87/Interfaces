package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableModel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new JTableModel();
	}

	/**
	 * Create the application.
	 */
	public JTableModel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		ArrayList<Jugador> lista = new ArrayList<Jugador>();
		Jugador j1 = new Jugador("Casillas","Real Madrid");
		Jugador j2 = new Jugador("Ronaldo","Real Madrid");
		Jugador j3 = new Jugador("Mesi","Barsa");
		lista.add(j1); lista.add(j2); lista.add(j3);
		String [] s = {"Jugador", "Equipo"};
		JTable tabla = new JTable(new JTableModelJugadores(lista,s));
		JScrollPane scrollPane= new JScrollPane(tabla);
		

		frame.add(scrollPane,BorderLayout.CENTER);
		
		frame.setVisible(true);
	}

}
