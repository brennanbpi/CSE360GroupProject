package gropProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextPane;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ErrorWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorWindow frame = new ErrorWindow();
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
	public ErrorWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblErrors = new JLabel("Error Log");
		GridBagConstraints gbc_lblErrors = new GridBagConstraints();
		gbc_lblErrors.insets = new Insets(0, 0, 5, 0);
		gbc_lblErrors.gridx = 3;
		gbc_lblErrors.gridy = 0;
		contentPane.add(lblErrors, gbc_lblErrors);
		
		JTextPane txtpnErrorsHere = new JTextPane();
		txtpnErrorsHere.setText("Errors Here");
		GridBagConstraints gbc_txtpnErrorsHere = new GridBagConstraints();
		gbc_txtpnErrorsHere.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnErrorsHere.fill = GridBagConstraints.BOTH;
		gbc_txtpnErrorsHere.gridx = 3;
		gbc_txtpnErrorsHere.gridy = 2;
		contentPane.add(txtpnErrorsHere, gbc_txtpnErrorsHere);
		
		JButton btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.gridx = 3;
		gbc_btnBack.gridy = 3;
		contentPane.add(btnBack, gbc_btnBack);
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();//closes window
			}
		});
	}

}
