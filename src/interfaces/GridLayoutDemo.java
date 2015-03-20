package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GridLayoutDemo {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JLabel etiquetaApellidos;
	private JTextField textFieldApellidos;
	private JLabel etiquetaDireccion;
	private JTextField textFieldDireccion;
	private JLabel lblNewLabel;
	private JComboBox comboBoxLocalidad;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutDemo window = new GridLayoutDemo();
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
	public GridLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 10, 40));
		
		JLabel etiquetaNombre = new JLabel("Nombre");
		frame.getContentPane().add(etiquetaNombre);
		
		textFieldNombre = new JTextField();
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		etiquetaApellidos = new JLabel("Apellidos");
		frame.getContentPane().add(etiquetaApellidos);
		
		textFieldApellidos = new JTextField();
		frame.getContentPane().add(textFieldApellidos);
		textFieldApellidos.setColumns(10);
		
		etiquetaDireccion = new JLabel("Direccion");
		frame.getContentPane().add(etiquetaDireccion);
		
		textFieldDireccion = new JTextField();
		frame.getContentPane().add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		lblNewLabel = new JLabel("Localidad");
		frame.getContentPane().add(lblNewLabel);
		
		comboBoxLocalidad = new JComboBox();
		comboBoxLocalidad.setModel(new DefaultComboBoxModel(new String[] {"Jaen", "Cordova", "Granada"}));
		frame.getContentPane().add(comboBoxLocalidad);
		
		btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_1);
	}

}
