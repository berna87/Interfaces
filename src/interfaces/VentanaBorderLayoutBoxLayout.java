package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaBorderLayoutBoxLayout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBorderLayoutBoxLayout window = new VentanaBorderLayoutBoxLayout();
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
	public VentanaBorderLayoutBoxLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel, BorderLayout.SOUTH);
		JLabel etiqueta1 = new JLabel("Etiqueta izquierda");
		JLabel etiqueta2 = new JLabel("Etiqueta derecha");
		panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
		panel.add(etiqueta1);
		panel.add(Box.createHorizontalGlue());
		panel.add(etiqueta2);
	}

}
