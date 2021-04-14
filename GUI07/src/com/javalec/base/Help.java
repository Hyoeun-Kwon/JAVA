package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Help extends JDialog {
	private JLabel lblHelp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help dialog = new Help();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Help() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblHelp());

	}

	private JLabel getLblHelp() {
		if (lblHelp == null) {
			lblHelp = new JLabel("Get Information Press F1");
			lblHelp.setHorizontalAlignment(SwingConstants.CENTER);
			lblHelp.setBounds(107, 119, 192, 16);
		}
		return lblHelp;
	}
}
