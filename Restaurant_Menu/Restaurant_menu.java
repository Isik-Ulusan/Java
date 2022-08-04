import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaurant_menu extends JFrame {

	private JPanel contentPane;
	private int total = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant_menu frame = new Restaurant_menu();
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
	public Restaurant_menu() {
		setResizable(false);
		setTitle("Restaurant Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Drinks");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 114, 130, 26);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Water   | 3tl");
		chckbxNewCheckBox.setBounds(10, 147, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Ice Tea | 7tl");
		chckbxNewCheckBox_1.setBounds(10, 173, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Coke     | 8tl");
		chckbxNewCheckBox_2.setBounds(10, 199, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Bread             | 3tl");
		chckbxNewCheckBox_3.setBounds(191, 147, 130, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Garlic Bread | 5tl");
		chckbxNewCheckBox_4.setBounds(191, 173, 130, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(150, 115, 12, 107);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Extras");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(191, 114, 130, 26);
		contentPane.add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 704, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Appetizers");
		mnNewMenu.add(mnNewMenu_1);
		
		ButtonGroup btngrp1 = new ButtonGroup();
		ButtonGroup btngrp2 = new ButtonGroup();
		ButtonGroup btngrp3 = new ButtonGroup();
		
		JCheckBoxMenuItem chckbxmnıtmNewCheckItem = new JCheckBoxMenuItem("Lentil Soup         | 20tl");
		mnNewMenu_1.add(chckbxmnıtmNewCheckItem);
		btngrp1.add(chckbxmnıtmNewCheckItem);
		
		JCheckBoxMenuItem chckbxmnıtmNewCheckItem_1 = new JCheckBoxMenuItem("Seasonal Salad | 12tl");
		mnNewMenu_1.add(chckbxmnıtmNewCheckItem_1);
		btngrp1.add(chckbxmnıtmNewCheckItem_1);
		
		JCheckBoxMenuItem chckbxmnıtmNewCheckItem_2 = new JCheckBoxMenuItem("Turkish Tibbeh  | 18tl");
		mnNewMenu_1.add(chckbxmnıtmNewCheckItem_2);
		btngrp1.add(chckbxmnıtmNewCheckItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Main Course");
		mnNewMenu.add(mnNewMenu_2);
		
		JCheckBoxMenuItem chckbxmnıtmNewCheckItem_3 = new JCheckBoxMenuItem("Rice & Chicken    | 35tl");
		mnNewMenu_2.add(chckbxmnıtmNewCheckItem_3);
		btngrp2.add(chckbxmnıtmNewCheckItem_3);
		
		JCheckBoxMenuItem chckbxmnıtmNewCheckItem_4 = new JCheckBoxMenuItem("Stuffed Eggplant  | 50tl");
		mnNewMenu_2.add(chckbxmnıtmNewCheckItem_4);
		btngrp2.add(chckbxmnıtmNewCheckItem_4);
		
		JCheckBoxMenuItem chckbxmnıtmNewCheckItem_5 = new JCheckBoxMenuItem("Turkish Kebab     | 85tl");
		mnNewMenu_2.add(chckbxmnıtmNewCheckItem_5);
		btngrp2.add(chckbxmnıtmNewCheckItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Dessert");
		mnNewMenu.add(mnNewMenu_3);
		
		JCheckBoxMenuItem chckbxmnıtmNewCheckItem_6 = new JCheckBoxMenuItem("Baklawa   | 70tl");
		mnNewMenu_3.add(chckbxmnıtmNewCheckItem_6);
		btngrp3.add(chckbxmnıtmNewCheckItem_6);
		
		JCheckBoxMenuItem chckbxmnıtmNewCheckItem_7 = new JCheckBoxMenuItem("Künefe      | 45tl");
		mnNewMenu_3.add(chckbxmnıtmNewCheckItem_7);
		btngrp3.add(chckbxmnıtmNewCheckItem_7);
		
		JCheckBoxMenuItem chckbxmnıtmNewCheckItem_8 = new JCheckBoxMenuItem("Kazandibi | 30tl");
		mnNewMenu_3.add(chckbxmnıtmNewCheckItem_8);
		btngrp3.add(chckbxmnıtmNewCheckItem_8);
		
		JLabel lblNewLabel_2 = new JLabel("Total: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(196, 50, 144, 37);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(368, 208, 173, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(338, 251, 2, 125);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(353, 33, 200, 150);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(353, 237, 200, 150);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(121, 237, 200, 150);
		contentPane.add(lblNewLabel_5);

		JButton btnNewButton = new JButton("Bill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				total=0;
				
				if (chckbxmnıtmNewCheckItem.isSelected() == true) {
					total += 20;
					lblNewLabel_3.setIcon(new ImageIcon(Image_selection.class.getResource("/img/yemekMercimek.png")));
				}
				if (chckbxmnıtmNewCheckItem_1.isSelected() == true) {
					total += 12;
					lblNewLabel_3.setIcon(new ImageIcon(Image_selection.class.getResource("/img/yemekCoban.png")));
				}
				if (chckbxmnıtmNewCheckItem_2.isSelected() == true) {
					total += 18;
					lblNewLabel_3.setIcon(new ImageIcon(Image_selection.class.getResource("/yemekIcli.png")));
				}
				if (chckbxmnıtmNewCheckItem_3.isSelected() == true) {
					total += 35;
					lblNewLabel_4.setIcon(new ImageIcon(Image_selection.class.getResource("/yemekPilav.png")));
				}
				if (chckbxmnıtmNewCheckItem_4.isSelected() == true) {
					total += 50;
					lblNewLabel_4.setIcon(new ImageIcon(Image_selection.class.getResource("/yemekKarniyarik.png")));
				}
				if (chckbxmnıtmNewCheckItem_5.isSelected() == true) {
					total += 85;
					lblNewLabel_4.setIcon(new ImageIcon(Image_selection.class.getResource("/yemekKebap.png")));
				}
				if (chckbxmnıtmNewCheckItem_6.isSelected() == true) {
					total += 70;
					lblNewLabel_5.setIcon(new ImageIcon(Image_selection.class.getResource("/yemekBaklava.png")));
				}
				if (chckbxmnıtmNewCheckItem_7.isSelected() == true) {
					total += 45;
					lblNewLabel_5.setIcon(new ImageIcon(Image_selection.class.getResource("/yemekKunefe.png")));
				}
				if (chckbxmnıtmNewCheckItem_8.isSelected() == true) {
					total += 30;
					lblNewLabel_5.setIcon(new ImageIcon(Image_selection.class.getResource("/yemekKazandibi.png")));
				}
				if (chckbxNewCheckBox.isSelected() == true) {
					total += 3;
				}
				if (chckbxNewCheckBox_1.isSelected() == true) {
					total += 7;
				}
				if (chckbxNewCheckBox_2.isSelected() == true) {
					total += 8;
				}
				if (chckbxNewCheckBox_3.isSelected() == true) {
					total += 3;
				}
				if (chckbxNewCheckBox_4.isSelected() == true) {
					total += 5;
				}
				
				lblNewLabel_2.setText("Total: " + total + "tl");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(10, 33, 176, 70);
		contentPane.add(btnNewButton);
		

	}
}
