package gropProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
/**
 * https://github.com/brennanbpi/CSE360GroupProject.git
 * @author Albert De La Cruz Matt Fleming Brennan Iannone Jacob Ybarra
 *
 */
public class ImportData extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String fileString;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImportData frame = new ImportData();
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
	public ImportData() {
		fileString = "";
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 555, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{136, 173, 0, 0};
		gbl_contentPane.rowHeights = new int[]{93, 94, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPleaseEnter = new JLabel("Please enter file name");
		GridBagConstraints gbc_lblPleaseEnter = new GridBagConstraints();
		gbc_lblPleaseEnter.anchor = GridBagConstraints.EAST;
		gbc_lblPleaseEnter.fill = GridBagConstraints.VERTICAL;
		gbc_lblPleaseEnter.insets = new Insets(0, 0, 5, 5);
		gbc_lblPleaseEnter.gridx = 0;
		gbc_lblPleaseEnter.gridy = 0;
		contentPane.add(lblPleaseEnter, gbc_lblPleaseEnter);
		
		JLabel lblHi = new JLabel("");
		GridBagConstraints gbc_lblHi = new GridBagConstraints();
		gbc_lblHi.fill = GridBagConstraints.VERTICAL;
		gbc_lblHi.insets = new Insets(0, 0, 5, 5);
		gbc_lblHi.gridx = 1;
		gbc_lblHi.gridy = 0;
		contentPane.add(lblHi, gbc_lblHi);
		
		JLabel lblNewLabel = new JLabel("File Name: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnImport = new JButton("Import");
		GridBagConstraints gbc_btnImport = new GridBagConstraints();
		gbc_btnImport.anchor = GridBagConstraints.NORTH;
		gbc_btnImport.insets = new Insets(0, 0, 5, 0);
		gbc_btnImport.gridx = 2;
		gbc_btnImport.gridy = 1;
		contentPane.add(btnImport, gbc_btnImport);
		//getting the file name from the text box
		btnImport.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent arg0)
					{
						fileString = textField.getText();//sets fileString to the text
						lblHi.setText("Current File: " + fileString);
					}
				});
			
		
		
		JButton btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.gridx = 2;
		gbc_btnBack.gridy = 2;
		contentPane.add(btnBack, gbc_btnBack);
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//setVisible(false);
				dispose();//closes window
				
			}
		});
	}
	
	public String getFileString()
	{
		return fileString;
	}
	
	public void setFileString(String inputString)
	{
		fileString = inputString;
	}
}
