package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JOptionPaneDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneDemo window = new JOptionPaneDemo();
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
	public JOptionPaneDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel miPanel = new JPanel();
		frame.getContentPane().add(miPanel,BorderLayout.CENTER);
		
		JButton boton1 = new JButton("Dialogo 1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Ha ocurrido un error", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		miPanel.add(boton1);
		
		JButton boton2 = new JButton("Dialogo 2");
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] opciones = {"Opcion 1","Opcion 2","Opcion 3","Opcion 4"};
				JOptionPane.showOptionDialog(frame, "Selecciona una opcion", "Selecciona una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			}
		});
		miPanel.add(boton2);
		
		JButton boton3 = new JButton("Dialogo 3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] opciones = {"Jaen","Cordova","Sevilla","Granada"};
				String s = (String)JOptionPane.showInputDialog(frame, "Ciudad preferida", "Seleccione una ciudad", JOptionPane.PLAIN_MESSAGE, null,opciones,opciones[0]);
				if(s!=null)JOptionPane.showMessageDialog(frame, s);
			}
		});
		miPanel.add(boton3);
		
		JButton boton4 = new JButton("Dialogo 4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s = JOptionPane.showInputDialog(null, "Ciudad preferida");
				if(s!=null)JOptionPane.showMessageDialog(frame, s);
			}
		});
		miPanel.add(boton4);
		
		
		JButton boton5 = new JButton("Dialogo Personalizado");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialogDemo miDialog = new JDialogDemo(frame);
			}
		});
		
		miPanel.add(boton5);
	}

}
