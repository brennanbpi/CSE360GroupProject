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

import javax.swing.JButton;

public class AnalyzeData extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnalyzeData frame = new AnalyzeData();
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
	public AnalyzeData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblDataAnalysis = new JLabel("Data Analysis");
		GridBagConstraints gbc_lblDataAnalysis = new GridBagConstraints();
		gbc_lblDataAnalysis.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataAnalysis.gridx = 3;
		gbc_lblDataAnalysis.gridy = 1;
		contentPane.add(lblDataAnalysis, gbc_lblDataAnalysis);
		
		JLabel lblNewLabel = new JLabel("Number Of Entries:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblentries = new JLabel("#entries");
		GridBagConstraints gbc_lblentries = new GridBagConstraints();
		gbc_lblentries.insets = new Insets(0, 0, 5, 5);
		gbc_lblentries.gridx = 3;
		gbc_lblentries.gridy = 2;
		contentPane.add(lblentries, gbc_lblentries);
		
		JLabel lblHigh = new JLabel("High:");
		GridBagConstraints gbc_lblHigh = new GridBagConstraints();
		gbc_lblHigh.insets = new Insets(0, 0, 5, 5);
		gbc_lblHigh.gridx = 2;
		gbc_lblHigh.gridy = 3;
		contentPane.add(lblHigh, gbc_lblHigh);
		
		JLabel lblHigh_1 = new JLabel("High#");
		GridBagConstraints gbc_lblHigh_1 = new GridBagConstraints();
		gbc_lblHigh_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblHigh_1.gridx = 3;
		gbc_lblHigh_1.gridy = 3;
		contentPane.add(lblHigh_1, gbc_lblHigh_1);
		
		JLabel lblLow = new JLabel("Low");
		GridBagConstraints gbc_lblLow = new GridBagConstraints();
		gbc_lblLow.insets = new Insets(0, 0, 5, 5);
		gbc_lblLow.gridx = 2;
		gbc_lblLow.gridy = 4;
		contentPane.add(lblLow, gbc_lblLow);
		
		JLabel lblLow_1 = new JLabel("Low#");
		GridBagConstraints gbc_lblLow_1 = new GridBagConstraints();
		gbc_lblLow_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblLow_1.gridx = 3;
		gbc_lblLow_1.gridy = 4;
		contentPane.add(lblLow_1, gbc_lblLow_1);
		
		JLabel lblMean = new JLabel("Mean:");
		GridBagConstraints gbc_lblMean = new GridBagConstraints();
		gbc_lblMean.insets = new Insets(0, 0, 5, 5);
		gbc_lblMean.gridx = 2;
		gbc_lblMean.gridy = 5;
		contentPane.add(lblMean, gbc_lblMean);
		
		JLabel lblMean_1 = new JLabel("Mean#");
		GridBagConstraints gbc_lblMean_1 = new GridBagConstraints();
		gbc_lblMean_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMean_1.gridx = 3;
		gbc_lblMean_1.gridy = 5;
		contentPane.add(lblMean_1, gbc_lblMean_1);
		
		JLabel lblMedian = new JLabel("Median:");
		GridBagConstraints gbc_lblMedian = new GridBagConstraints();
		gbc_lblMedian.insets = new Insets(0, 0, 5, 5);
		gbc_lblMedian.gridx = 2;
		gbc_lblMedian.gridy = 6;
		contentPane.add(lblMedian, gbc_lblMedian);
		
		JLabel lblMedian_1 = new JLabel("Median#");
		GridBagConstraints gbc_lblMedian_1 = new GridBagConstraints();
		gbc_lblMedian_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMedian_1.gridx = 3;
		gbc_lblMedian_1.gridy = 6;
		contentPane.add(lblMedian_1, gbc_lblMedian_1);
		
		JLabel lblMode = new JLabel("Mode:");
		GridBagConstraints gbc_lblMode = new GridBagConstraints();
		gbc_lblMode.insets = new Insets(0, 0, 5, 5);
		gbc_lblMode.gridx = 2;
		gbc_lblMode.gridy = 7;
		contentPane.add(lblMode, gbc_lblMode);
		
		JLabel lblMode_1 = new JLabel("Mode#");
		GridBagConstraints gbc_lblMode_1 = new GridBagConstraints();
		gbc_lblMode_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMode_1.gridx = 3;
		gbc_lblMode_1.gridy = 7;
		contentPane.add(lblMode_1, gbc_lblMode_1);
	
		
		JButton btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.gridx = 4;
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
