package java_form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Listing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listing frame = new Listing();
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
	public Listing() {
		setTitle("Listing");
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
		
		textField = new JTextField();
		textField.setBounds(10, 191, 394, 37);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnlist = new JTextPane();
		txtpnlist.setEditable(false);
		txtpnlist.setBounds(10, 21, 394, 108);
		panel.add(txtpnlist);
		
		JButton btn = new JButton("Add to List");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnlist.setText(txtpnlist.getText()+textField.getText()+"\n");
			}
		});
		btn.setBounds(43, 143, 134, 37);
		panel.add(btn);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int end=0;
				for (int i=1; i<txtpnlist.getText().length(); i++) {
					if (txtpnlist.getText().substring(i-1,i).equals("\n")) {
						end = i;
					}
				}
				txtpnlist.setText(txtpnlist.getText().substring(0, end));
			}
		});
		btnNewButton.setBounds(218, 143, 88, 37);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear All");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnlist.setText("");
			}
		});
		btnNewButton_1.setBounds(316, 143, 89, 37);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("--List--");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 394, 14);
		panel.add(lblNewLabel);
		
		
	}
}
