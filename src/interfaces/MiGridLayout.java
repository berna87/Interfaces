package interfaces;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;



public class MiGridLayout {
		
	private JFrame frame;
	public MiGridLayout(Persona p){
		frame=new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{245, 245, 0};
		gridBagLayout.rowHeights = new int[]{78, 78, 78, 78, 78, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		JTextField campoApellido = new JTextField(p.getApellidos());
		campoApellido.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				p.setApellidos(campoApellido.getText());
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel etiquetaNombre = new JLabel("Nombre");
		
		GridBagConstraints gbc_etiquetaNombre = new GridBagConstraints();
		gbc_etiquetaNombre.fill = GridBagConstraints.BOTH;
		gbc_etiquetaNombre.insets = new Insets(0, 0, 5, 5);
		gbc_etiquetaNombre.gridx = 0;
		gbc_etiquetaNombre.gridy = 0;
		frame.getContentPane().add(etiquetaNombre, gbc_etiquetaNombre);
		JTextField campoNombre = new JTextField(p.getNombre());
		campoNombre.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				p.setNombre(campoNombre.getText());
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		GridBagConstraints gbc_campoNombre = new GridBagConstraints();
		gbc_campoNombre.fill = GridBagConstraints.BOTH;
		gbc_campoNombre.insets = new Insets(0, 0, 5, 0);
		gbc_campoNombre.gridx = 1;
		gbc_campoNombre.gridy = 0;
		frame.getContentPane().add(campoNombre, gbc_campoNombre);
		JLabel etiquetaApellido = new JLabel("Apellidos");
		GridBagConstraints gbc_etiquetaApellido = new GridBagConstraints();
		gbc_etiquetaApellido.fill = GridBagConstraints.BOTH;
		gbc_etiquetaApellido.insets = new Insets(0, 0, 5, 5);
		gbc_etiquetaApellido.gridx = 0;
		gbc_etiquetaApellido.gridy = 1;
		frame.getContentPane().add(etiquetaApellido, gbc_etiquetaApellido);
		GridBagConstraints gbc_campoApellido = new GridBagConstraints();
		gbc_campoApellido.fill = GridBagConstraints.BOTH;
		gbc_campoApellido.insets = new Insets(0, 0, 5, 0);
		gbc_campoApellido.gridx = 1;
		gbc_campoApellido.gridy = 1;
		frame.getContentPane().add(campoApellido, gbc_campoApellido);
		
		JLabel etiquetaDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_etiquetaDireccion = new GridBagConstraints();
		gbc_etiquetaDireccion.fill = GridBagConstraints.BOTH;
		gbc_etiquetaDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_etiquetaDireccion.gridx = 0;
		gbc_etiquetaDireccion.gridy = 2;
		frame.getContentPane().add(etiquetaDireccion, gbc_etiquetaDireccion);
		JTextField campoDireccion = new JTextField(p.getDireccion());
		campoDireccion.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				p.setDireccion(campoDireccion.getText());
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		GridBagConstraints gbc_campoDireccion = new GridBagConstraints();
		gbc_campoDireccion.fill = GridBagConstraints.BOTH;
		gbc_campoDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_campoDireccion.gridx = 1;
		gbc_campoDireccion.gridy = 2;
		frame.getContentPane().add(campoDireccion, gbc_campoDireccion);
		
		
		
		JLabel etiquetaLocalidad = new JLabel("Localidad");
		GridBagConstraints gbc_etiquetaLocalidad = new GridBagConstraints();
		gbc_etiquetaLocalidad.fill = GridBagConstraints.BOTH;
		gbc_etiquetaLocalidad.insets = new Insets(0, 0, 5, 5);
		gbc_etiquetaLocalidad.gridx = 0;
		gbc_etiquetaLocalidad.gridy = 3;
		frame.getContentPane().add(etiquetaLocalidad, gbc_etiquetaLocalidad);
		JComboBox campoLocalidad = new JComboBox(new DefaultComboBoxModel(Loc.values()));
		campoLocalidad.setSelectedItem(p.getLocalidad());
		campoLocalidad.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				p.setLocalidad((Loc) campoLocalidad.getSelectedItem());
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		GridBagConstraints gbc_campoLocalidad = new GridBagConstraints();
		gbc_campoLocalidad.fill = GridBagConstraints.BOTH;
		gbc_campoLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_campoLocalidad.gridx = 1;
		gbc_campoLocalidad.gridy = 3;
		frame.getContentPane().add(campoLocalidad, gbc_campoLocalidad);
		
		JButton boton1 = new JButton("Guardar");
		GridBagConstraints gbc_boton1 = new GridBagConstraints();
		gbc_boton1.fill = GridBagConstraints.BOTH;
		gbc_boton1.insets = new Insets(0, 0, 0, 5);
		gbc_boton1.gridx = 0;
		gbc_boton1.gridy = 4;
		frame.getContentPane().add(boton1, gbc_boton1);
		JButton boton2 = new JButton("Cancelar");
		GridBagConstraints gbc_boton2 = new GridBagConstraints();
		gbc_boton2.fill = GridBagConstraints.BOTH;
		gbc_boton2.gridx = 1;
		gbc_boton2.gridy = 4;
		frame.getContentPane().add(boton2, gbc_boton2);
		frame.setBounds(100, 100, 500, 500);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Pepe","Perez",Loc.GRANADA,"Calle Falsa 123");
		new MiGridLayout(p1);
	}

}
enum Loc{JAEN, GRANADA, CORDOVA}
