package java_form;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_screen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String user = "Isik_Ulusan";
	private String pass = "123asdf";
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_screen frame = new Login_screen();
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
	public Login_screen() {
		setResizable(false);
		setTitle("Login Screen");
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
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(206, 11, 1, 217);
		panel.add(separator);
		
		JLabel username = new JLabel("Usename:");
		username.setBounds(217, 11, 75, 14);
		panel.add(username);
		
		textField = new JTextField();
		textField.setBounds(217, 36, 187, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel password = new JLabel("Password:");
		password.setBounds(217, 67, 90, 14);
		panel.add(password);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon(Login_screen.class.getResource("github.png")));
		image.setBounds(10, 11, 180, 180);
		panel.add(image);
		
		JLabel tick = new JLabel("");
		tick.setBounds(272, 157, 72, 71);
		panel.add(tick);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(217, 92, 187, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(user) && new String(passwordField.getPassword()).equals(pass)) {
					tick.setIcon(new ImageIcon(Login_screen.class.getResource("Check.png")));
				} else {
					tick.setIcon(new ImageIcon(Login_screen.class.getResource("Cross.png")));
				}
			}
		});
		btnNewButton.setBounds(262, 123, 89, 23);
		panel.add(btnNewButton);
		

	}
}
