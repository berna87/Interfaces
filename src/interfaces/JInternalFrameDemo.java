package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JInternalFrameDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrameDemo window = new JInternalFrameDemo();
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
	public JInternalFrameDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JDesktopPane escritorio = new JDesktopPane();
		frame.getContentPane().add(escritorio,BorderLayout.CENTER);
		
		JInternalFrame v1 = new JInternalFrame("Ventana1");
		v1.setResizable(true);
		v1.setClosable(true);
		v1.setIconifiable(true);
		v1.setVisible(true);
		v1.setBounds(0,0,150,100);
		v1.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
		JButton b1 = new JButton("Boton1");
		escritorio.add(v1);
		v1.getContentPane().add(b1,BorderLayout.CENTER);
		v1.addInternalFrameListener(new InternalFrameListener() {
			
			@Override
			public void internalFrameOpened(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameIconified(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameDeiconified(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameDeactivated(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				int returnVal = JOptionPane.showConfirmDialog(frame, "Realmente quieres cerrar la ventana?");
				if (returnVal == JOptionPane.OK_OPTION){
					e.getInternalFrame().setVisible(false);
					e.getInternalFrame().dispose();
				}
				
			}
			
			@Override
			public void internalFrameClosed(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameActivated(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JInternalFrame v2 = new JInternalFrame("Ventana1");
		v2.setResizable(true);
		v2.setClosable(true);
		v2.setIconifiable(true);
		v2.setVisible(true);
		v2.setBounds(150,0,150,100);
		JButton b2 = new JButton("Boton2");
		escritorio.add(v2);
		v2.getContentPane().add(b2,BorderLayout.CENTER);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame[] ventanas = escritorio.getAllFrames();
				for (int i = 0; i < ventanas.length; i++) {
					ventanas[i].dispose();
				}
			}
		});
		btnCerrar.setBounds(321, 12, 117, 25);
		escritorio.add(btnCerrar);
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				int returnVal = JOptionPane.showConfirmDialog(frame, "Realmente quieres cerrar la ventana?");
				if (returnVal == JOptionPane.OK_OPTION){
					e.getWindow().setVisible(false);
					e.getWindow().dispose();
					System.exit(1);
				}
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
