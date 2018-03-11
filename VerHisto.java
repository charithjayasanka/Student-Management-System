package com.cw;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class VerHisto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerHisto frame = new VerHisto();
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
	public VerHisto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 864, 595);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVerticalHistogramFor = new JLabel("Vertical Histogram for the Students Record System");
		lblVerticalHistogramFor.setVerticalAlignment(SwingConstants.TOP);
		lblVerticalHistogramFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerticalHistogramFor.setForeground(Color.YELLOW);
		lblVerticalHistogramFor.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblVerticalHistogramFor.setBackground(Color.WHITE);
		lblVerticalHistogramFor.setBounds(129, 11, 663, 38);
		contentPane.add(lblVerticalHistogramFor);
		
		JLabel lblNewLabel = new JLabel("00-29");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(398, 60, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("30-39");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(524, 60, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("40-69");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(648, 60, 59, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("70-100");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(764, 60, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel label4 = new JLabel("");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label4.setVerticalAlignment(SwingConstants.TOP);
		label4.setBounds(775, 104, 48, 414);
		contentPane.add(label4);
		label4.setText(Main.hist100v);
		
		JLabel label3l = new JLabel("");
		label3l.setHorizontalAlignment(SwingConstants.CENTER);
		label3l.setFont(new Font("Tahoma", Font.BOLD, 14));
		label3l.setVerticalAlignment(SwingConstants.TOP);
		label3l.setBounds(647, 104, 48, 414);
		contentPane.add(label3l);
		label3l.setText(Main.hist69v);
		
		JLabel label2 = new JLabel("");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label2.setVerticalAlignment(SwingConstants.TOP);
		label2.setBounds(524, 104, 48, 414);
		contentPane.add(label2);
		label2.setText(Main.hist39v);
		
		JLabel label1 = new JLabel("");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label1.setVerticalAlignment(SwingConstants.TOP);
		label1.setBounds(398, 104, 48, 414);
		contentPane.add(label1);
		label1.setText(Main.hist29v);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(230, 366, 86, 20);
		contentPane.add(textField);
		textField.setText(String.valueOf(Main.students.size()));
		
		textField_1 = new JTextField();
		textField_1.setText(" ");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(230, 303, 86, 20);
		contentPane.add(textField_1);
		textField_1.setText(Main.lowestmarks);
		
		textField_2 = new JTextField();
		textField_2.setText(" ");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(230, 230, 86, 20);
		contentPane.add(textField_2);
		textField_2.setText(Main.highestmarks);
		
		textField_3 = new JTextField();
		textField_3.setText("");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(232, 166, 86, 20);
		contentPane.add(textField_3);
		textField_3.setText(Main.passednumber);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(230, 105, 86, 20);
		contentPane.add(textField_4);
		textField_4.setText(Main.ovravv);
		
		JLabel label = new JLabel("Average Module Marks");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(12, 104, 170, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Number of Passed Students");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(12, 163, 203, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Highest Module Marks");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(12, 230, 170, 19);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Lowest Module Marks");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(12, 304, 170, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Number of Students Enrolled");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(12, 367, 201, 14);
		contentPane.add(label_4);
	}
}
