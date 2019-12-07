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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 
 * @author Albert De La Cruz Matt Fleming Brennan Iannone Jacob Ybarra
 *
 */
public class ErrorWindow extends JFrame {

	private JPanel contentPane;
	private backend backend;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorWindow frame = new ErrorWindow(null);
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
	public ErrorWindow(backend newBackend) {
		backend = newBackend;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblErrors = new JLabel("Error Log");
		GridBagConstraints gbc_lblErrors = new GridBagConstraints();
		gbc_lblErrors.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrors.gridx = 3;
		gbc_lblErrors.gridy = 0;
		contentPane.add(lblErrors, gbc_lblErrors);
		
		JTextArea txtpnErrorsHere = new JTextArea();
		txtpnErrorsHere.setText(backend.geterrors());
		GridBagConstraints gbc_txtpnErrorsHere = new GridBagConstraints();
		gbc_txtpnErrorsHere.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnErrorsHere.fill = GridBagConstraints.BOTH;
		gbc_txtpnErrorsHere.gridx = 3;
		gbc_txtpnErrorsHere.gridy = 2;
		JScrollPane scrollPane = new JScrollPane(txtpnErrorsHere);
		contentPane.add(scrollPane, gbc_txtpnErrorsHere);
		
		JButton btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.insets = new Insets(0, 0, 0, 5);
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
