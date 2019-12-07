package gropProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * https://github.com/brennanbpi/CSE360GroupProject.git
 * @author Albert De La Cruz Matt Fleming Brennan Iannone Jacob Ybarra
 *
 */
public class appendDataSet extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private backend backend;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appendDataSet frame = new appendDataSet(null);
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
	public appendDataSet(backend backend) {
		this.backend = backend;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPleaseEnterThe = new JLabel("Please enter the value you would like to add");
		GridBagConstraints gbc_lblPleaseEnterThe = new GridBagConstraints();
		gbc_lblPleaseEnterThe.insets = new Insets(0, 0, 5, 5);
		gbc_lblPleaseEnterThe.gridx = 3;
		gbc_lblPleaseEnterThe.gridy = 1;
		contentPane.add(lblPleaseEnterThe, gbc_lblPleaseEnterThe);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnAppend = new JButton("Append");
		GridBagConstraints gbc_btnAppend = new GridBagConstraints();
		gbc_btnAppend.insets = new Insets(0, 0, 5, 5);
		gbc_btnAppend.gridx = 3;
		gbc_btnAppend.gridy = 5;
		contentPane.add(btnAppend, gbc_btnAppend);
		btnAppend.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				backend.append(Float.parseFloat(textField.getText()));//closes window
			}
		});
		
		JButton btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.anchor = GridBagConstraints.EAST;
		gbc_btnBack.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack.gridx = 3;
		gbc_btnBack.gridy = 8;
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
