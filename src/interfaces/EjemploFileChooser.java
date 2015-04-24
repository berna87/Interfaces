package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileChooser {

	private JFrame frame;
	private JFileChooser fileChooser;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploFileChooser window = new EjemploFileChooser();
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
	public EjemploFileChooser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//instanciamos el objeto Filechooser que inicialmente no será visible
		fileChooser = new JFileChooser();
		fileChooser.setFileFilter(new Filtro());
		JPanel botonera = new JPanel();
		JButton botonAbrir = new JButton("Abrir");
		
		JButton botonGuardar= new JButton("Guardar");
		JButton botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		botonera.add(botonAbrir);
		botonera.add(botonGuardar);
		botonera.add(botonSalir);
		frame.getContentPane().add(botonera, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		botonAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnVal = fileChooser.showOpenDialog(frame);
				if (returnVal == JFileChooser.APPROVE_OPTION){
					File file =fileChooser.getSelectedFile();
					LectorFile lector = new LectorFile(file);
					textArea.setText(lector.leer());
				}
			}
		});
		botonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnVal = fileChooser.showSaveDialog(frame);
				if (returnVal == JFileChooser.APPROVE_OPTION){
					File file =fileChooser.getSelectedFile();
					try (FileWriter fileW = new FileWriter(file);){
						fileW.write(textArea.getText());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
	}

}
