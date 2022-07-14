package java_form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Classroom_List extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classroom_List frame = new Classroom_List();
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
	public Classroom_List() {
		setTitle("Classroom List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 379);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 239, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 42, 239, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 73, 394, 2);
		panel.add(separator);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 86, 239, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 117, 394, 251);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<=textArea.getText().length()-textField_2.getText().length();i++) {
					if(textArea.getText().substring(i, i+textField_2.getText().length()).equals(textField_2.getText())) {
						textArea.setText(textArea.getText().substring(0,i)+textArea.getText().substring(i+1+textField_2.getText().length()));
						break;
					}
				}
			}
		});
		btnNewButton.setBounds(259, 85, 145, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+textField.getText()+", "+textField_1.getText()+"\n");
			}
		});
		btnNewButton_1.setBounds(259, 10, 145, 52);
		panel.add(btnNewButton_1);
	}
}
