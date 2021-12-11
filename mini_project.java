package lab;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class project extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project frame = new project();
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
	public project() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 494);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Star to Delta");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(65, 39, 120, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter R1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 99, 70, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter R2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 145, 70, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter R3");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(10, 187, 70, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Enter Ra");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(339, 101, 70, 13);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Enter Rb");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(339, 147, 70, 13);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Enter Rc");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_5.setBounds(339, 186, 70, 15);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblDeltaToStar = new JLabel("Delta to Star");
		lblDeltaToStar.setForeground(Color.RED);
		lblDeltaToStar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeltaToStar.setBounds(312, 39, 120, 20);
		contentPane.add(lblDeltaToStar);
		
		textField = new JTextField();
		textField.setBounds(89, 98, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(90, 144, 96, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(89, 186, 96, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(408, 98, 96, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(408, 144, 96, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(408, 186, 96, 19);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Star to Delta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float R1,R2,R3,Ra,Rb,Rc;
				R1=Float.parseFloat(textField.getText());
				R2=Float.parseFloat(textField_1.getText());
				R3=Float.parseFloat(textField_2.getText());
				Ra=R2+R3+(R2*R3)/R1;
				Rb=R1+R3+(R1*R3)/R2;
				Rc=R2+R1+(R2*R1)/R3;
				textField_6.setText(Float.toString(Ra));
				textField_7.setText(Float.toString(Rb));
				textField_8.setText(Float.toString(Rc));
			}
			
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 271, 135, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel(" Ra :-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 329, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(" Rb :-");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 364, 45, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel(" Rc :-");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(10, 399, 45, 13);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btnDeltaToStar = new JButton("Delta to Star");
		btnDeltaToStar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float R1,R2,R3,Ra,Rb,Rc;
				Ra=Float.parseFloat(textField_3.getText());
				Rb=Float.parseFloat(textField_4.getText());
				Rc=Float.parseFloat(textField_5.getText());
				R1=Rb*Rc/(Ra+Rb+Rc);
				R2=Ra*Rc/(Ra+Rb+Rc);
				R3=Rb*Ra/(Ra+Rb+Rc);
				textField_9.setText(Float.toString(R1));
				textField_10.setText(Float.toString(R2));
				textField_11.setText(Float.toString(R3));
			}
		});
		btnDeltaToStar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDeltaToStar.setBackground(Color.MAGENTA);
		btnDeltaToStar.setBounds(312, 273, 135, 21);
		contentPane.add(btnDeltaToStar);
		
		textField_6 = new JTextField();
		textField_6.setBounds(89, 328, 96, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(89, 363, 96, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(89, 398, 96, 19);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_2_3 = new JLabel(" R1 :-");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3.setBounds(348, 331, 45, 13);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel(" R2 :-");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_4.setBounds(348, 366, 45, 13);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel(" R3 :-");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_5.setBounds(348, 401, 45, 13);
		contentPane.add(lblNewLabel_2_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(408, 328, 96, 19);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(408, 363, 96, 19);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(408, 398, 96, 19);
		contentPane.add(textField_11);
		
		JLabel lblNewLabel_3 = new JLabel("Welcome to the World of Engineering");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBackground(Color.MAGENTA);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_3.setBounds(89, 10, 427, 21);
		contentPane.add(lblNewLabel_3);
	}
}
