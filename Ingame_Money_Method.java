package java_form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class Ingame_Money_Method extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingame_Money_Method frame = new Ingame_Money_Method();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Money() {
		textField.setVisible(true);
		textField_1.setVisible(true);
		lblNewLabel_1.setVisible(true);
		lblNewLabel_1.setText("Money/Hour:");
		lblNewLabel_2.setVisible(true);
		lblNewLabel_2.setText("Time taken:");
		lblNewLabel_3.setVisible(true);
		lblNewLabel_3.setText("Total Money:");
		btnNewButton_1.removeActionListener(btnNewButton_1.getActionListeners()[0]);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_3.setText("Total Money: "+(Double.parseDouble(textField.getText()) * Double.parseDouble(textField_1.getText())));
			}
		});
		btnNewButton_1.setVisible(true);
		
	}

	public void Time() {
		textField.setVisible(true);
		textField_1.setVisible(true);
		lblNewLabel_1.setVisible(true);
		lblNewLabel_1.setText("Money/Hour:");
		lblNewLabel_2.setVisible(true);
		lblNewLabel_2.setText("Money wanted:");
		lblNewLabel_3.setVisible(true);
		lblNewLabel_3.setText("Time needed:");
		btnNewButton_1.removeActionListener(btnNewButton_1.getActionListeners()[0]);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_3.setText("Time needed: "+(Double.parseDouble(textField_1.getText()) / Double.parseDouble(textField.getText()))+" hour(s)");
			}
		});
		btnNewButton_1.setVisible(true);
	}
	
	public void MoneyTime() {
		textField.setVisible(true);
		textField_1.setVisible(true);
		lblNewLabel_1.setVisible(true);
		lblNewLabel_1.setText("Money made:");
		lblNewLabel_2.setVisible(true);
		lblNewLabel_2.setText("Time taken:");
		lblNewLabel_3.setVisible(true);
		lblNewLabel_3.setText("Money/Hour:");
		btnNewButton_1.removeActionListener(btnNewButton_1.getActionListeners()[0]);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_3.setText("Money/Hour: "+(Double.parseDouble(textField.getText()) / Double.parseDouble(textField_1.getText())));
			}
		});
		btnNewButton_1.setVisible(true);

	}
	
	/**
	 * Create the frame.
	 */
	public Ingame_Money_Method() {
		setResizable(false);
		setTitle("Money Method Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 464, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What to calculate?");
		lblNewLabel.setBounds(10, 11, 137, 14);
		panel.add(lblNewLabel);
		
		JRadioButton rdbtnMH = new JRadioButton("Money/hour");
		rdbtnMH.setBounds(134, 7, 114, 23);
		panel.add(rdbtnMH);
		
		JRadioButton rdbtnM = new JRadioButton("Total Money");
		rdbtnM.setBounds(250, 7, 114, 23);
		panel.add(rdbtnM);
		
		JRadioButton rdbtnH = new JRadioButton("Total Time");
		rdbtnH.setBounds(369, 7, 95, 23);
		panel.add(rdbtnH);
		
		ButtonGroup btnGroup = new ButtonGroup();
		
		btnGroup.add(rdbtnMH);
		btnGroup.add(rdbtnH);
		btnGroup.add(rdbtnM);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 83, 464, 167);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
			
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnMH.isSelected()) {
					MoneyTime();
				} else if (rdbtnM.isSelected()) {
					Money();
				} else if (rdbtnH.isSelected()) {
					Time();
				}
			}
		});
		btnNewButton.setBounds(168, 37, 89, 23);
		panel.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 11, 77, 14);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 133, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 83, 133, 14);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 108, 133, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		
		lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(177, 90, 211, 52);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		

		btnNewButton_1 = new JButton("Results");
		btnNewButton_1.setBounds(234, 35, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setVisible(false);

		
	}
}
