package java_form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Color_selection extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	//3 check box, 1 textfield, 1 button, 1 label
	//RGB, Car-Apple
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Color_selection frame = new Color_selection();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Color_selection() {
		setTitle("Color Selection");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 196, 122);
		contentPane.add(panel);
				
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Red");
		rdbtnNewRadioButton.setBounds(6, 7, 88, 23);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Green");
		rdbtnNewRadioButton_1.setBounds(6, 33, 88, 23);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Blue");
		rdbtnNewRadioButton_2.setBounds(6, 59, 88, 23);
		panel.setLayout(null);
		panel.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
				
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(216, 11, 208, 122);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 188, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(99, 135, 240, 115);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Image");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String color = "";
				if (rdbtnNewRadioButton.isSelected()) {
					color = "Red";
				}
				else if (rdbtnNewRadioButton_1.isSelected()) {
					color = "Green";
				}
				else if (rdbtnNewRadioButton_2.isSelected()) {
					color = "Blue";
				}
				
				lblNewLabel_1.setIcon(new ImageIcon(Color_selection.class.getResource(color +
						textField.getText() + ".jpg")));
			}
		});
		btnNewButton.setBounds(61, 67, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Object");
		lblNewLabel.setBounds(10, 11, 188, 14);
		panel_1.add(lblNewLabel);
	}
}
