package gropProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;

public class SetBoundries extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblLowerBound;
	private JButton btnSetBounds;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetBoundries frame = new SetBoundries();
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
	public SetBoundries() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Please set upper and lower bounds for grades");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblUpperBound = new JLabel("Upper Bound:");
		GridBagConstraints gbc_lblUpperBound = new GridBagConstraints();
		gbc_lblUpperBound.insets = new Insets(0, 0, 5, 5);
		gbc_lblUpperBound.anchor = GridBagConstraints.EAST;
		gbc_lblUpperBound.gridx = 2;
		gbc_lblUpperBound.gridy = 3;
		contentPane.add(lblUpperBound, gbc_lblUpperBound);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 3;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblLowerBound = new JLabel("Lower Bound:");
		GridBagConstraints gbc_lblLowerBound = new GridBagConstraints();
		gbc_lblLowerBound.insets = new Insets(0, 0, 5, 5);
		gbc_lblLowerBound.anchor = GridBagConstraints.EAST;
		gbc_lblLowerBound.gridx = 2;
		gbc_lblLowerBound.gridy = 4;
		contentPane.add(lblLowerBound, gbc_lblLowerBound);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 4;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		btnSetBounds = new JButton("Set Bounds");
		GridBagConstraints gbc_btnSetBounds = new GridBagConstraints();
		gbc_btnSetBounds.anchor = GridBagConstraints.WEST;
		gbc_btnSetBounds.insets = new Insets(0, 0, 5, 5);
		gbc_btnSetBounds.gridx = 3;
		gbc_btnSetBounds.gridy = 5;
		contentPane.add(btnSetBounds, gbc_btnSetBounds);
		
		btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack.gridx = 3;
		gbc_btnBack.gridy = 6;
		contentPane.add(btnBack, gbc_btnBack);
	}

}
