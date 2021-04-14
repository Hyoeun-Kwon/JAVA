package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GUI04 {

	private JFrame frame;
	private JLabel lblPass;
	private JPasswordField pfInput;
	private JTextField tfMessage;
	private JButton btnOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04 window = new GUI04();
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
	public GUI04() {
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
		frame.getContentPane().add(getLblPass());
		frame.getContentPane().add(getPfInput());
		frame.getContentPane().add(getTfMessage());
		frame.getContentPane().add(getBtnOK());
	}
	private JLabel getLblPass() {
		if (lblPass == null) {
			lblPass = new JLabel("Password");
			lblPass.setBounds(31, 57, 72, 16);
		}
		return lblPass;
	}
	private JPasswordField getPfInput() {
		if (pfInput == null) {
			pfInput = new JPasswordField();
			pfInput.setHorizontalAlignment(SwingConstants.TRAILING);
			pfInput.setBounds(115, 52, 130, 26);
		}
		return pfInput;
	}
	private JTextField getTfMessage() {
		if (tfMessage == null) {
			tfMessage = new JTextField();
			tfMessage.setHorizontalAlignment(SwingConstants.TRAILING);
			tfMessage.setBounds(115, 115, 130, 26);
			tfMessage.setColumns(10);
		}
		return tfMessage;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btnOK.setBounds(288, 75, 117, 29);
		}
		return btnOK;
	}
	
	private void checkPassword(){
		char[] str = pfInput.getPassword();
		String passString = new String(str);
		tfMessage.setText(passString);
	}
	
	
	
	
	
	
	
}//end







