package com.cw;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class Histo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField averagetext;
	private JTextField passedtext;
	private JTextField hightext;
	private JTextField lowtext;
	private JTextField stdnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Histo frame = new Histo();
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
	public Histo() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 838, 518);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHorizontalHostogramFor = new JLabel("Horizontal Histogram for the Students Record System");
		lblHorizontalHostogramFor.setForeground(Color.YELLOW);
		lblHorizontalHostogramFor.setVerticalAlignment(SwingConstants.TOP);
		lblHorizontalHostogramFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorizontalHostogramFor.setBackground(Color.WHITE);
		lblHorizontalHostogramFor.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblHorizontalHostogramFor.setBounds(78, 22, 668, 36);
		contentPane.add(lblHorizontalHostogramFor);
		
		JLabel lblNewLabel = new JLabel("00-29");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBackground(UIManager.getColor("Button.disabledShadow"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 103, 55, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label1 = new JLabel("");
		label1.setBackground(Color.RED);
		label1.setForeground(Color.WHITE);
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		label1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label1.setBounds(180, 96, 614, 28);
		contentPane.add(label1);
		
		
		JLabel label = new JLabel("30-39");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 87, 46, 14);
		label1.setText(Main.hist29);
		
		
		JLabel label2 = new JLabel("");
		label2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label2.setBackground(Color.RED);
		label2.setForeground(Color.WHITE);
		label2.setHorizontalAlignment(SwingConstants.LEFT);
		label2.setBounds(178, 148, 592, 33);
		contentPane.add(label2);
		label2.setText(Main.hist39);
		
		JLabel label_2 = new JLabel("40-69");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(56, 223, 59, 14);
		contentPane.add(label_2);
		
		JLabel label3 = new JLabel("");
		label3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label3.setBackground(Color.RED);
		label3.setForeground(Color.WHITE);
		label3.setHorizontalAlignment(SwingConstants.LEFT);
		label3.setBounds(176, 210, 605, 29);
		contentPane.add(label3);
		label3.setText(Main.hist69);
		
		JLabel label_4 = new JLabel("70-100");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setForeground(Color.BLACK);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(56, 280, 68, 14);
		contentPane.add(label_4);
		
		JLabel label4 = new JLabel("");
		label4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label4.setBackground(Color.RED);
		label4.setForeground(Color.WHITE);
		label4.setHorizontalAlignment(SwingConstants.LEFT);
		label4.setBounds(179, 269, 605, 27);
		contentPane.add(label4);
		label4.setText(Main.hist100);
		
		JLabel label_1 = new JLabel("30-39");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(61, 163, 51, 14);
		contentPane.add(label_1);
		
		JLabel lblAverageMarks = new JLabel("Average Module Marks");
		lblAverageMarks.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAverageMarks.setForeground(Color.WHITE);
		lblAverageMarks.setBounds(270, 323, 170, 21);
		contentPane.add(lblAverageMarks);
		
		JLabel lblNewLabel_1 = new JLabel("Number of Passed Students");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(268, 352, 203, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Highest Module Marks");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(270, 385, 170, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lowest Module Marks");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(270, 415, 170, 14);
		contentPane.add(lblNewLabel_3);
		
		averagetext = new JTextField();
		averagetext.setBounds(488, 324, 86, 20);
		contentPane.add(averagetext);
		averagetext.setColumns(10);
		averagetext.setEditable(false);
		//String ovravv=toString(Main.overallAverage);
		averagetext.setText(Main.ovravv);
		
		passedtext = new JTextField();
		passedtext.setEditable(false);
		passedtext.setColumns(10);
		passedtext.setBounds(488, 355, 86, 20);
		contentPane.add(passedtext);
		passedtext.setText(Main.passednumber);
		
		hightext = new JTextField();
		hightext.setEditable(false);
		hightext.setColumns(10);
		hightext.setBounds(488, 385, 86, 20);
		contentPane.add(hightext);
		hightext.setText(Main.highestmarks);
		
		lowtext = new JTextField();
		lowtext.setEditable(false);
		lowtext.setColumns(10);
		lowtext.setBounds(488, 414, 86, 20);
		contentPane.add(lowtext);
		lowtext.setText(Main.lowestmarks);
		
		JLabel studentcount = new JLabel("Number of Students Enrolled");
		studentcount.setForeground(Color.WHITE);
		studentcount.setFont(new Font("Tahoma", Font.BOLD, 14));
		studentcount.setBounds(270, 444, 201, 14);
		contentPane.add(studentcount);
		
		stdnum = new JTextField();
		stdnum.setEditable(false);
		stdnum.setColumns(10);
		stdnum.setBounds(488, 443, 86, 20);
		contentPane.add(stdnum);
		stdnum.setText(String.valueOf(Main.students.size()));
	}
}
