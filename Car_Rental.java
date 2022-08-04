package java_form;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;

public class Car_Rental extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JList<String> list;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Car_Rental frame = new Car_Rental();
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
	public Car_Rental() {
		setTitle("Car Rental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 30, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Surname:");
		lblNewLabel_1.setBounds(106, 11, 105, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 30, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		DefaultListModel<String> model = new DefaultListModel<>();
		
		list = new JList<>(model);
		list.setBounds(10, 64, 186, 139);
		list.setVisible(false);
		contentPane.add(list);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 230, 86, 20);
		contentPane.add(textField_2);
		textField_2.setVisible(false);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Number of Days:");
		lblNewLabel_3.setBounds(10, 212, 145, 14);
		lblNewLabel_3.setVisible(false);
		contentPane.add(lblNewLabel_3);
		
		ButtonGroup btngrp2 = new ButtonGroup();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("1 Year");
		chckbxNewCheckBox.setBounds(214, 64, 97, 23);
		btngrp2.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setVisible(false);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				list.setVisible(true);
				textField_2.setVisible(true);
				lblNewLabel_3.setVisible(true);
				
				model.removeAllElements();
				model.addElement("Fiat Doblo 2016 | 450tl");
				model.addElement("Fiat Punto 2016 | 350tl");
				model.addElement("Peugeot 308 2016 | 300tl");
				
				
			}
		});
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("2 Years");
		chckbxNewCheckBox_1.setBounds(214, 90, 97, 23);
		btngrp2.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setVisible(false);
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				list.setVisible(true);
				textField_2.setVisible(true);
				lblNewLabel_3.setVisible(true);
				
				model.removeAllElements();
				model.addElement("Audi Q5 2018 | 1000tl");
				model.addElement("Ford Mustang 1969 | 1200tl");
				model.addElement("Mercedes CLA 2014 | 650tl");
				
				
			}
		});
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("4 Years");
		chckbxNewCheckBox_2.setBounds(214, 116, 97, 23);
		btngrp2.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setVisible(false);
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				list.setVisible(true);
				textField_2.setVisible(true);
				lblNewLabel_3.setVisible(true);
				
				model.removeAllElements();
				model.addElement("Bugatti Chiron 2022 | 10000tl");
				model.addElement("Porche 911 2022 | 7000tl");
				model.addElement("Hummer H1 1996 | 13000tl");
				
				
			}
		});
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("Price: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(248, 212, 158, 20);
		lblNewLabel_4.setVisible(false);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setVisible(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int base = 0;
				int day = Integer.parseInt(textField_2.getText());
				switch(list.getSelectedValue()) {
				case "Fiat Doblo 2016 | 450tl":
					base = 450;
					break;
				case "Fiat Punto 2016 | 350tl":
					base = 350;
					break;
				case "Peugeot 308 2016 | 300tl":
					base = 300;
					break;
				case "Audi Q5 2018 | 1000tl":
					base = 1000;
					break;
				case "Ford Mustang 1969 | 1200tl":
					base = 1200;
					break;
				case "Mercedes CLA 2014 | 650tl":
					base = 650;
					break;
				case "Bugatti Chiron 2022 | 10000tl":
					base = 10000;
					break;
				case "Porche 911 2022 | 7000tl":
					base = 7000;
					break;
				case "Hummer H1 1996 | 13000tl":
					base = 13000;
					break;
				}
				
				lblNewLabel_4.setText("Price: " + base*day + "tl");
				
			}
		});
		btnNewButton.setBounds(257, 158, 109, 29);
		contentPane.add(btnNewButton);
				
		ButtonGroup btngrp1 = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.setBounds(214, 29, 55, 23);
		btngrp1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox.setVisible(true);
				chckbxNewCheckBox_1.setVisible(true);
				chckbxNewCheckBox_2.setVisible(true);
				
				btnNewButton.setVisible(true);
				lblNewLabel_4.setVisible(true);
				
			}
		});
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1.setBounds(271, 29, 109, 23);
		btngrp1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox.setVisible(false);
				chckbxNewCheckBox_1.setVisible(false);
				chckbxNewCheckBox_2.setVisible(false);
				
				model.removeAllElements();
				
				list.setVisible(false);
				lblNewLabel_3.setVisible(false);
				textField_2.setVisible(false);
				
				btnNewButton.setVisible(false);
				lblNewLabel_4.setVisible(false);
				
			}
		});
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Drivers License?");
		lblNewLabel_2.setBounds(221, 11, 145, 14);
		contentPane.add(lblNewLabel_2);
		

	}
}
