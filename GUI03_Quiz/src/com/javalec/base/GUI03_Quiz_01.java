package com.javalec.base;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI03_Quiz_01 {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JCheckBox cbAdd;
	private JCheckBox cbSub;
	private JCheckBox cbMul;
	private JCheckBox cbDiv;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03_Quiz_01 window = new GUI03_Quiz_01();
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
	public GUI03_Quiz_01() {
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
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getCbAdd());
		frame.getContentPane().add(getCbSub());
		frame.getContentPane().add(getCbMul());
		frame.getContentPane().add(getCbDiv());
		frame.getContentPane().add(getLbl1());
		frame.getContentPane().add(getLbl2());
		frame.getContentPane().add(getLbl3());
		frame.getContentPane().add(getLbl4());
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(76, 32, 112, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(76, 88, 112, 26);
		}
		return tfNum2;
	}
	private JCheckBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JCheckBox("+");
			cbAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calculation();
				}
			});
			cbAdd.setBounds(307, 19, 55, 23);
		}
		return cbAdd;
	}
	private JCheckBox getCbSub() {
		if (cbSub == null) {
			cbSub = new JCheckBox("-");
			cbSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calculation();
				}
			});
			cbSub.setBounds(307, 54, 55, 23);
		}
		return cbSub;
	}
	private JCheckBox getCbMul() {
		if (cbMul == null) {
			cbMul = new JCheckBox("*");
			cbMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calculation();
				}
			});
			cbMul.setBounds(307, 89, 55, 23);
		}
		return cbMul;
	}
	private JCheckBox getCbDiv() {
		if (cbDiv == null) {
			cbDiv = new JCheckBox("/");
			cbDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calculation();
				}
			});
			cbDiv.setBounds(307, 126, 55, 23);
		}
		return cbDiv;
	}
	private JLabel getLbl1() {
		if (lbl1 == null) {
			lbl1 = new JLabel("");
			lbl1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl1.setBounds(86, 167, 238, 16);
		}
		return lbl1;
	}
	private JLabel getLbl2() {
		if (lbl2 == null) {
			lbl2 = new JLabel("");
			lbl2.setHorizontalAlignment(SwingConstants.CENTER);
			lbl2.setBounds(86, 195, 238, 16);
		}
		return lbl2;
	}
	private JLabel getLbl3() {
		if (lbl3 == null) {
			lbl3 = new JLabel("");
			lbl3.setHorizontalAlignment(SwingConstants.CENTER);
			lbl3.setBounds(86, 222, 238, 16);
		}
		return lbl3;
	}
	private JLabel getLbl4() {
		if (lbl4 == null) {
			lbl4 = new JLabel("");
			lbl4.setHorizontalAlignment(SwingConstants.CENTER);
			lbl4.setBounds(86, 250, 238, 16);
		}
		return lbl4;
	}
	
	//Method
	private void Calculation() {
		int Num1 = Integer.parseInt(tfNum1.getText());
		int Num2 = Integer.parseInt(tfNum2.getText());
		
	//add
		lbl1.setText("");
		lbl2.setText("");
		lbl3.setText("");
		lbl4.setText("");
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		if(cbAdd.isSelected()==true) {
			int addResult = Num1+Num2;
			arrayList.add(Num1+" + "+Num2+ " = " +addResult);
		}else if (cbSub.isSelected()==true) {
			int subResult = Num1- Num2;
			arrayList.add(Num1+" + "+Num2+ " = " +subResult);
		}else if (cbMul.isSelected()==true) {
			int mulResult = Num1 * Num2;
			arrayList.add(Num1+" + "+Num2+ " = " +mulResult);
		}else if (cbDiv.isSelected()==true) {
			double divResult = (double)Num1 / Num2;
			arrayList.add(Num1+" + "+Num2+ " = " +divResult);

		}
		//try
		for(int i=0; i<arrayList.size(); i++) {

		switch(i){
			case 0 : lbl1.setText(arrayList.get(i));
			break;
			case 1 : lbl2.setText(arrayList.get(i));
			break;
			case 2 : lbl3.setText(arrayList.get(i));
			break;
			case 3 : lbl4.setText(arrayList.get(i));
			break;
			
		}
		
		
		}
		
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end
