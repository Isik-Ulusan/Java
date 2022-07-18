package java_form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;

public class Ingame_Method_Tracker extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int count=0;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private DefaultListModel<String> model;
	int finishNum = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingame_Method_Tracker frame = new Ingame_Method_Tracker();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void updateCurrent() {
		if(model.getSize() < 1) {
			lblNewLabel_2.setText("Current Step: ");
		}
		else if(count < model.getSize()) {
			lblNewLabel_2.setText("Current Step: " + model.getElementAt(count));
		}
		else {
			lblNewLabel_2.setText("Current Step: ");
		}
	}
	private void updateNext() {
		if(model.getSize() < 2) {
			lblNewLabel_3.setText("Next Step: ");
		}
		else if(count+1 < model.getSize()) {
			lblNewLabel_3.setText("Next Step: " + model.getElementAt(count+1));
		}
		else {
			lblNewLabel_3.setText("Next Step: ");
		}
	}

	/**
	 * Create the frame.
	 */
	public Ingame_Method_Tracker() {
		setResizable(false);
		setTitle("Method Tracker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		model = new DefaultListModel<>();
		JList<String> list = new JList<>( model );
		list.setVisibleRowCount(1);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(10, 33, 210, 160);
		//contentPane.add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(list);
		scrollPane.setBounds(10, 33, 210, 160);
		list.setLayoutOrientation(JList.VERTICAL);
		contentPane.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(230, 31, 194, 20);
		contentPane.add(textField);
		textField.setColumns(10);
				
		JLabel lblNewLabel = new JLabel("Method Steps");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 117, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Add Step:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(230, 11, 106, 14);
		contentPane.add(lblNewLabel_1);
				
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 230, 414, 20);
		contentPane.add(progressBar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(230, 130, 194, 2);
		contentPane.add(separator_1);
				
		lblNewLabel_2 = new JLabel("Current Step: ");
		lblNewLabel_2.setBounds(230, 143, 194, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Next Step: ");
		lblNewLabel_3.setBounds(230, 168, 194, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number of Finishes: " + finishNum);
		lblNewLabel_4.setBounds(10, 204, 178, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_4 = new JButton("Task Complete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(progressBar.getValue() == progressBar.getMaximum()-1) {
					btnNewButton_4.setText("Finish");
				}
				if(progressBar.getValue() == progressBar.getMaximum()) {
					progressBar.setValue(0);
					count = 0;
					finishNum ++;
					lblNewLabel_4.setText("Number of Finishes: " + finishNum);
					btnNewButton_4.setText("Task Complete");
				}
				else {
					count++;
					updateCurrent();
					updateNext();
					progressBar.setValue(count);
				}
			}
		});
		btnNewButton_4.setBounds(230, 196, 189, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedIndex() != -1) {
					model.removeElement(model.getElementAt(list.getSelectedIndex()));
					progressBar.setMaximum(model.getSize());
					progressBar.setValue(0);
					count = 0;
					updateCurrent();
					updateNext();
				}
			}
		});
		btnNewButton_1.setBounds(286, 96, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(textField.getText());
				progressBar.setMaximum(model.getSize());
				updateCurrent();
				updateNext();				
			}
		});
		btnNewButton.setBounds(286, 62, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishNum = 0;
				count = 0;
				progressBar.setMaximum(100);
				progressBar.setValue(0);
				model.removeAllElements();
				updateCurrent();
				updateNext();
				lblNewLabel_4.setText("Number of Finishes: 0");
				textField.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 7));
		btnNewButton_2.setBounds(368, 5, 56, 19);
		contentPane.add(btnNewButton_2);
	}
}
