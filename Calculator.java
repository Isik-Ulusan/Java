package java_form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField Screen;
	private double cevap,sayi;
	int operation;
	private JTextField Mem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_5 frame = new Form_5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void addInput(String str) {
		Screen.setText(Screen.getText() + str);
	}
	public void calculate() {
		switch (operation) {
		case 1:
			cevap = sayi + Double.parseDouble(Screen.getText());
			Screen.setText(Double.toString(cevap));
			Mem.setText("");
			break;
		case 2:
			cevap = sayi - Double.parseDouble(Screen.getText());
			Screen.setText(Double.toString(cevap));
			Mem.setText("");
			break;
		case 3:
			cevap = sayi * Double.parseDouble(Screen.getText());
			Screen.setText(Double.toString(cevap));
			Mem.setText("");
			break;
		case 4:
			cevap = sayi / Double.parseDouble(Screen.getText());
			Screen.setText(Double.toString(cevap));
			Mem.setText("");
			break;
		}
	}
	
	/**
	 * Create the frame.
	 */
	public Form_5() {
		setTitle("Hesap Makinesi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 322, 56);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Screen = new JTextField();
		Screen.setHorizontalAlignment(SwingConstants.TRAILING);
		Screen.setBounds(159, 11, 153, 34);
		panel.add(Screen);
		Screen.setColumns(10);
		
		Mem = new JTextField();
		Mem.setBounds(10, 11, 150, 34);
		panel.add(Mem);
		Mem.setColumns(10);
		
		JPanel Buttons = new JPanel();
		Buttons.setBounds(10, 78, 322, 360);
		contentPane.add(Buttons);
		Buttons.setLayout(new GridLayout(0, 4, 10, 10));
				
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("+");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(Screen.getText());
				operation = 1;
				Screen.setText("");
				Mem.setText(sayi + " " + e.getActionCommand());
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_3_1);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_1);
		
		JButton btnNewButton_3_3 = new JButton("5");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_2 = new JButton("6");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_4 = new JButton("-");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(Screen.getText());
				operation = 2;
				Screen.setText("");
				Mem.setText(sayi + " " + e.getActionCommand());
			}
		});
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		Buttons.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_6 = new JButton("7");
		btnNewButton_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_3_6);
		
		JButton btnNewButton_3_5 = new JButton("8");
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_3_5);
		
		JButton btnNewButton_3_7 = new JButton("9");
		btnNewButton_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_3_7);
		
		JButton btnNewButton_3_9 = new JButton("X");
		btnNewButton_3_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(Screen.getText());
				operation = 3;
				Screen.setText("");
				Mem.setText(sayi + " " + e.getActionCommand());
			}
		});
		btnNewButton_3_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_3_9);
		
		JButton btnNewButton_3_8 = new JButton("0");
		btnNewButton_3_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		Buttons.add(btnNewButton_3_8);
		
		JButton btnNewButton_3_8_1 = new JButton("=");
		btnNewButton_3_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		btnNewButton_3_8_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		Buttons.add(btnNewButton_3_8_1);
		
		JButton btnNewButton_3_8_2 = new JButton("C");
		btnNewButton_3_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText("");
			}
		});
		btnNewButton_3_8_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buttons.add(btnNewButton_3_8_2);
		
		JButton btnNewButton_3_8_3 = new JButton("/");
		btnNewButton_3_8_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(Screen.getText());
				operation = 4;
				Screen.setText("");
				Mem.setText(sayi + " " + e.getActionCommand());
			}
		});
		Buttons.add(btnNewButton_3_8_3);
		
	}
}
