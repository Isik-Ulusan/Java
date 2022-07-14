package java_form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Addition extends JFrame {

	private JPanel contentPane;
	private JTextField numField_1;
	private JTextField numField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addition frame = new Addition();
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
	public Addition() {
		setTitle("Addition");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		numField_1 = new JTextField();
		numField_1.setBounds(10, 11, 394, 38);
		panel.add(numField_1);
		numField_1.setColumns(10);
		
		numField_2 = new JTextField();
		numField_2.setBounds(10, 60, 394, 38);
		panel.add(numField_2);
		numField_2.setColumns(10);
		
		JLabel Answer = new JLabel("");
		Answer.setHorizontalAlignment(SwingConstants.CENTER);
		Answer.setBounds(139, 158, 135, 38);
		panel.add(Answer);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Double.parseDouble(numField_1.getText())+Double.parseDouble(numField_2.getText())+"");
			}
		});
		btnNewButton.setBounds(139, 109, 135, 38);
		panel.add(btnNewButton);
		
	}
}
