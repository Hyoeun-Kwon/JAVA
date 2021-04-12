package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui02_Quiz {

	private JFrame frame;
	private JComboBox cbNum1;
	private JComboBox cbCal;
	private JComboBox cbNum2;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui02_Quiz window = new Gui02_Quiz();
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
	public Gui02_Quiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbNum1());
		frame.getContentPane().add(getCbCal());
		frame.getContentPane().add(getCbNum2());
		frame.getContentPane().add(getTfResult());
	}

	private JComboBox getCbNum1() {
		if (cbNum1 == null) {
			cbNum1 = new JComboBox();
			cbNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reCalc();
					
				}
			});
			cbNum1.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8", "9"}));
			cbNum1.setBounds(31, 29, 82, 27);
		}
		return cbNum1;
	}
	private JComboBox getCbCal() {
		if (cbCal == null) {
			cbCal = new JComboBox();
			cbCal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reCalc();
;					
				}
			});
			cbCal.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
			cbCal.setBounds(144, 29, 82, 27);
		}
		return cbCal;
	}
	private JComboBox getCbNum2() {
		if (cbNum2 == null) {
			cbNum2 = new JComboBox();
			cbNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reCalc();
					
					
				}
			});
			cbNum2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cbNum2.setBounds(251, 29, 82, 27);
		}
		return cbNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setBounds(353, 28, 82, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	
	//Method
	

	//Calculation
	private void reCalc() {
	String reNum1 =cbNum1.getSelectedItem().toString();
	int	Num1 = Integer.parseInt(reNum1);
	String reNum2 =cbNum2.getSelectedItem().toString();
	int Num2 = Integer.parseInt(reNum2);
	int Calc = cbCal.getSelectedIndex();

		switch(Calc) {
	
		case 0 : tfResult.setText(Integer.toString(Num1+Num2));
				break;
		case 1 : tfResult.setText(Integer.toString(Num1-Num2));
				break;
		case 2 : tfResult.setText(Integer.toString(Num1*Num2));
				break;
		case 3 : 
			try {
				tfResult.setText(String.format("%2.3f",(1.0)*Num1/Num2));
			} catch (Exception e) {
				tfResult.setText("error");
				
			}
				break;

		} //switch
	}//method
	
	//if Practice
//	private void re_Calc() {
//	int re_Num1 = cbNum1.getSelectedIndex() + 2;
//	int re_Num2 = cbNum2.getSelectedIndex() + 1;
//	}//reCalc Method
	
	
	
	
	
	
	
	

	
	
	
}//end
