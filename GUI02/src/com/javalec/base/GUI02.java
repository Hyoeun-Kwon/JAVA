package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GUI02 {

	private JFrame frmComboBox;
	private JComboBox cbFruits;
	private JTextField tfFruits;
	private JTextField tfAdd;
	private JButton btnAdd;
	private JComboBox cbAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02 window = new GUI02();
					window.frmComboBox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmComboBox = new JFrame();
		frmComboBox.setTitle("ComboBox");
		frmComboBox.setBounds(100, 100, 450, 300);
		frmComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmComboBox.getContentPane().setLayout(null);
		frmComboBox.getContentPane().add(getCbFruits());
		frmComboBox.getContentPane().add(getTfFruits());
		frmComboBox.getContentPane().add(getTfAdd());
		frmComboBox.getContentPane().add(getBtnAdd());
		frmComboBox.getContentPane().add(getCbAdd());
	}
	private JComboBox getCbFruits() {
		if (cbFruits == null) {
			cbFruits = new JComboBox();
			cbFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String stFruits = cbFruits.getSelectedItem().toString(); //
					tfFruits.setText(stFruits);
				}
			});
			cbFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
			cbFruits.setBounds(35, 26, 104, 27);
		}
		return cbFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setBounds(183, 25, 130, 26);
			tfFruits.setColumns(10);
		}
		return tfFruits;
	}
	private JTextField getTfAdd() {
		if (tfAdd == null) {
			tfAdd = new JTextField();
			tfAdd.setBounds(35, 92, 130, 26);
			tfAdd.setColumns(10);
		}
		return tfAdd;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addCombo(); //
				}
			});
			btnAdd.setBounds(35, 130, 117, 29);
		}
		return btnAdd;
	}
	private JComboBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JComboBox();
			cbAdd.setBounds(225, 93, 52, 27);
		}
		return cbAdd;
	}
	
	//Method
	private void addCombo () {
		String stTemp = tfAdd.getText();
		cbAdd.addItem(stTemp);
	}
	
}
