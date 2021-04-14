package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI06 {

	private JFrame frame;
	private JLabel lblID;
	private JLabel lblPass;
	private JTextField tfID;
	private JPasswordField pfPass;
	private JButton btnOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI06 window = new GUI06();
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
	public GUI06() {
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
		frame.getContentPane().add(getLblID());
		frame.getContentPane().add(getLblPass());
		frame.getContentPane().add(getTfID());
		frame.getContentPane().add(getPfPass());
		frame.getContentPane().add(getBtnOK());
	}

	private JLabel getLblID() {
		if (lblID == null) {
			lblID = new JLabel("UserID");
			lblID.setHorizontalAlignment(SwingConstants.CENTER);
			lblID.setBounds(68, 60, 61, 16);
		}
		return lblID;
	}
	private JLabel getLblPass() {
		if (lblPass == null) {
			lblPass = new JLabel("UserPassword");
			lblPass.setHorizontalAlignment(SwingConstants.CENTER);
			lblPass.setBounds(32, 106, 97, 16);
		}
		return lblPass;
	}
	private JTextField getTfID() {
		if (tfID == null) {
			tfID = new JTextField();
			tfID.setHorizontalAlignment(SwingConstants.TRAILING);
			tfID.setBounds(130, 55, 130, 26);
			tfID.setColumns(10);
		}
		return tfID;
	}
	private JPasswordField getPfPass() {
		if (pfPass == null) {
			pfPass = new JPasswordField();
			pfPass.setHorizontalAlignment(SwingConstants.TRAILING);
			pfPass.setBounds(130, 101, 130, 26);
		}
		return pfPass;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkUser();
					
				}
			});
			btnOK.setBounds(285, 101, 117, 29);
		}
		return btnOK;
	}
	
	private void checkUser(){
		String Id = tfID.getText();
		char[] inputPass = pfPass.getPassword();
		String Pass = new String(inputPass);
		
		if(Id.equals("abc")&&Pass.equals("1234")) {
			Welcome welcome = new Welcome();
			welcome.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "Worng Information");
		}
	}
	
	
	
	
	
	
	
	
	
}//end
