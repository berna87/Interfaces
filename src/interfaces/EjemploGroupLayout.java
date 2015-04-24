package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class EjemploGroupLayout {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploGroupLayout window = new EjemploGroupLayout();
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
	public EjemploGroupLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblFindWhat = new JLabel("Find What: ");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnFind = new JButton("Find");
		
		JButton btnCancel = new JButton("Cancel");
		
		JCheckBox chckbxMatchCase = new JCheckBox("Match case");
		
		JCheckBox chckbxWholeWords = new JCheckBox("Whole words");
		
		JCheckBox chckbxWrapAround = new JCheckBox("Wrap around");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Search backwards");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblFindWhat)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxMatchCase)
								.addComponent(chckbxWholeWords))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox)
								.addComponent(chckbxWrapAround)))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnCancel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(btnFind, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFindWhat)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFind))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnCancel)
							.addComponent(chckbxWrapAround))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxMatchCase)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxWholeWords)
								.addComponent(chckbxNewCheckBox))))
					.addContainerGap(185, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
