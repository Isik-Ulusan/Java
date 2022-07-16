package java_form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JWTG_Damage_Calculator extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField attack;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JWTG_Damage_Calculator frame = new JWTG_Damage_Calculator();
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
	public JWTG_Damage_Calculator() {
		setResizable(false);
		setTitle("JW:TG Damage Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		attack = new JTextField();
		attack.setText("0");
		attack.setBounds(113, 57, 86, 20);
		contentPane.add(attack);
		attack.setColumns(10);
				
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setRowSelectionAllowed(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Count", "-50%", "Base", "+50%"},
				{1, 0, 0, 0},
				{2, 0, 0, 0},
				{3, 0, 0, 0},
				{4, 0, 0, 0},
				{5, 0, 0, 0},
				{6, 0, 0, 0},
				{7, 0, 0, 0},
				{8, 0, 0, 0},
			},
			new String[] {
				"Count", "-50%", "Base", "+50%"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.setBounds(24, 138, 270, 141);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Attack");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(134, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int atk = Integer.parseInt(attack.getText());
				int latk = (int)(atk * 0.5);
				int hatk = (int)(atk * 1.5);
				
				table.setModel(new DefaultTableModel(
						new Object[][] {
							{"Count", "-50%", "Base", "+50%"},
							{1, (int)(latk), atk, (int)(hatk)},
							{2, (int)(latk*2.4), (int)(atk*2.4), (int)(hatk*2.4)},
							{3, (int)(latk*4.2), (int)(atk*4.2), (int)(hatk*4.2)},
							{4, (int)(latk*6.4), (int)(atk*6.4), (int)(hatk*6.4)},
							{5, (int)(latk*9), (int)(atk*9), (int)(hatk*9)},
							{6, (int)(latk*12), (int)(atk*12), (int)(hatk*12)},
							{7, (int)(latk*15.4), (int)(atk*15.4), (int)(hatk*15.4)},
							{8, (int)(latk*20), (int)(atk*20), (int)(hatk*20)},
						},
						new String[] {
							"Count", "-50%", "Base", "+50%"
						}
					));
			}
		});
		btnNewButton.setBounds(110, 90, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
