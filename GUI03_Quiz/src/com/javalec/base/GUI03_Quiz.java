package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI03_Quiz {

	private JFrame frmCaculation;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JRadioButton rbAdd;
	private JRadioButton rbSub;
	private JRadioButton rbMul;
	private JRadioButton rbDiv;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03_Quiz window = new GUI03_Quiz();
					window.frmCaculation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI03_Quiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCaculation = new JFrame();
		frmCaculation.setTitle("Caculation");
		frmCaculation.setBounds(100, 100, 450, 300);
		frmCaculation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCaculation.getContentPane().setLayout(null);
		frmCaculation.getContentPane().add(getTfNum1());
		frmCaculation.getContentPane().add(getTfNum2());
		frmCaculation.getContentPane().add(getRbAdd());
		frmCaculation.getContentPane().add(getRbSub());
		frmCaculation.getContentPane().add(getRbMul());
		frmCaculation.getContentPane().add(getRbDiv());
		frmCaculation.getContentPane().add(getLblResult());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(65, 49, 117, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(65, 115, 117, 26);
		}
		return tfNum2;
	}
	private JRadioButton getRbAdd() {
		if (rbAdd == null) {
			rbAdd = new JRadioButton("+");
			rbAdd.setSelected(true);
			rbAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calculation();
				}
			});
			buttonGroup.add(rbAdd);
			rbAdd.setBounds(270, 31, 66, 23);
		}
		return rbAdd;
	}
	private JRadioButton getRbSub() {
		if (rbSub == null) {
			rbSub = new JRadioButton("-");
			rbSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calculation();
				}
			});
			buttonGroup.add(rbSub);
			rbSub.setBounds(270, 67, 66, 23);
		}
		return rbSub;
	}
	private JRadioButton getRbMul() {
		if (rbMul == null) {
			rbMul = new JRadioButton("X");
			rbMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calculation();
				}
			});
			buttonGroup.add(rbMul);
			rbMul.setBounds(270, 102, 66, 23);
		}
		return rbMul;
	}
	private JRadioButton getRbDiv() {
		if (rbDiv == null) {
			rbDiv = new JRadioButton("/");
			rbDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calculation();
				}
			});
			buttonGroup.add(rbDiv);
			rbDiv.setBounds(270, 137, 66, 23);
		}
		return rbDiv;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setBounds(94, 198, 221, 16);
		}
		return lblResult;
	}
	
	//Method
	private void Calculation() {
	int Num1 = Integer.parseInt(tfNum1.getText()); // Sting -> Integer
	int Num2 = Integer.parseInt(tfNum2.getText());
	
	if (rbAdd.isSelected()==true) {
		int addResult = Num1 + Num2;
		lblResult.setText(Num1+" + "+Num2+ " = " +addResult);
	}else if(rbSub.isSelected()==true) {
		int subResult = Num1 - Num2;
		lblResult.setText(Num1+" - "+Num2+ " = " +subResult);
	}else if(rbMul.isSelected() == true) {
		int mulResult = Num1 * Num2;
		lblResult.setText(Num1+" * "+Num2+ " = " +mulResult);
	}else {
		double divResult = ((1.0)*Num1/Num2);
		if(Num1==0||Num2==0) {
		lblResult.setText("0 is not allowed");
		}else {
		lblResult.setText(Num1+" / "+Num2+ " = " +String.format("%2.3f", divResult));
		}
	}
	
	}//Calculation Method
}//end
