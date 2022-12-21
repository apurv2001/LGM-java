package currency_converter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class currency {

	private JFrame frame;
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
					currency window = new currency();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public currency() {
		initialize();
	}

	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.setBackground(new Color(255, 250, 250));
		frame.setBounds(100, 100, 550, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setBounds(92, 1, 235, 42);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Select conversion");
		lblNewLabel_1.setBounds(25, 53, 124, 26);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_1);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(152, 251, 152));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Rupee-to-dollar", "Dollar-to-rupee", "Rupee-to-Pound", "Pound-to-rupee"}));
		comboBox.setBounds(144, 53, 182, 26);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = ""+comboBox.getItemAt(comboBox.getSelectedIndex());
				textField.setText(s);
			}
			
		});
		btnNewButton.setBounds(337, 51, 83, 26);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Selected conversion");
		lblNewLabel_2.setBounds(20, 102, 129, 26);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(152, 104, 175, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Amount");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(33, 144, 103, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setBounds(151, 142, 175, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Result :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(63, 186, 69, 26);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setBounds(155, 178, 172, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Convert");
		btnNewButton_1.setBackground(new Color(152, 251, 152));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					float a = Float.parseFloat(textField_1.getText());
				   if(textField.getText().equals("Rupee-to-dollar")) {
					  float x = (a/82);
					  textField_2.setText(x+" Dollars");
				   }
				   else if(textField.getText().equals("Dollar-to-rupee")) {
					   float y = (a*82);
					   textField_2.setText(y+" Rupee");
				   }
				  else if(textField.getText().equals("Rupee-to-Pound")) {
					  float z = (a/101);
					  textField_2.setText(z+" Pounds");
				  }
				  else{
					  float w = (a*101);
					  textField_2.setText(w+" Rupee");
				  }
				 }catch(Exception e1) {
					JOptionPane.showMessageDialog(frame, "Please Enter a valid number" );
				 }
			}
		});
		btnNewButton_1.setBounds(176, 214, 92, 26);
		frame.getContentPane().add(btnNewButton_1);
	}
}