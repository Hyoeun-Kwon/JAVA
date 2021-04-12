package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUI03 {

	private JFrame frmCheckboxradiobutton;
	private JCheckBox chApple;
	private JCheckBox chBanana;
	private JButton btnFruit;
	private JTextField tfFruit;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
					window.frmCheckboxradiobutton.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxradiobutton = new JFrame();
		frmCheckboxradiobutton.setTitle("CheckBox / RadioButton");
		frmCheckboxradiobutton.setBounds(100, 100, 450, 300);
		frmCheckboxradiobutton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxradiobutton.getContentPane().setLayout(null);
		frmCheckboxradiobutton.getContentPane().add(getChApple());
		frmCheckboxradiobutton.getContentPane().add(getChBanana());
		frmCheckboxradiobutton.getContentPane().add(getBtnFruit());
		frmCheckboxradiobutton.getContentPane().add(getTfFruit());
		frmCheckboxradiobutton.getContentPane().add(getRbKBS());
		frmCheckboxradiobutton.getContentPane().add(getRbMBC());
		frmCheckboxradiobutton.getContentPane().add(getBtnBroad());
		frmCheckboxradiobutton.getContentPane().add(getTfBroad());
	}
	private JCheckBox getChApple() {
		if (chApple == null) {
			chApple = new JCheckBox("Apple");
			chApple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			chApple.setBounds(22, 25, 128, 23);
		}
		return chApple;
	}
	private JCheckBox getChBanana() {
		if (chBanana == null) {
			chBanana = new JCheckBox("Banana");
			chBanana.setBounds(22, 74, 128, 23);
		}
		return chBanana;
	}
	private JButton getBtnFruit() {
		if (btnFruit == null) {
			btnFruit = new JButton("OK");
			btnFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();				}
			});
			btnFruit.setBounds(22, 116, 117, 29);
		}
		return btnFruit;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setBounds(20, 168, 224, 26);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	
	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			rbKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbKBS);
			rbKBS.setBounds(272, 25, 141, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			rbMBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbMBC);
			rbMBC.setBounds(272, 74, 141, 23);
		}
		return rbMBC;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			btnBroad.setBounds(261, 116, 117, 29);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(271, 168, 130, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	
	//Method  --: CheckBox Select ->>> Message 
	private void fruitCheck() {
		tfFruit.setText("");      // all delete 
		
		if(chApple.isSelected() == true) {
			tfFruit.setText("Apple is Selected");
		}
		if(chBanana.isSelected() == true) {
			tfFruit.setText("Banana is Selected");
		}
		if(chApple.isSelected() && chBanana.isSelected() == true) {
			tfFruit.setText("Apple and Banana is Selected");
		}
		
		
	}	
	
	//Method
	private void broadCheck() {
		if(rbKBS.isSelected() == true) {
			tfBroad.setText("KBS is Selected");
		}
		if(rbMBC.isSelected() == true) {
			tfBroad.setText("MBC is Selected");
		}

	}
	
	
}//end
