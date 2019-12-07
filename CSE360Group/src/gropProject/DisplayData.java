package gropProject;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
/**
 * https://github.com/brennanbpi/CSE360GroupProject.git
 * @author Albert De La Cruz Matt Fleming Brennan Iannone Jacob Ybarra
 *
 */
public class DisplayData extends JFrame {

	private JPanel contentPane;
	private backend backend;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayData frame = new DisplayData(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private String getString(ArrayList<Float> sortedList,int size,int startIndex,int endIndex)
	{
		
		String text = "";
		System.out.println("size" + size + " fds" + sortedList.get(0));
		for(int i=startIndex; i < endIndex; i++)
		{
			System.out.println("index" + i);
			text += sortedList.get(i) + "\n";//makes a line for smallest data
		}
		
		return text;
	}

	/**
	 * Create the frame.
	 */
	public DisplayData(backend newBackend) {
		backend = newBackend;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{97, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblData = new JLabel("Current Data Set");
		GridBagConstraints gbc_lblData = new GridBagConstraints();
		gbc_lblData.insets = new Insets(0, 0, 5, 5);
		gbc_lblData.gridx = 2;
		gbc_lblData.gridy = 0;
		contentPane.add(lblData, gbc_lblData);
		
		
		
		ArrayList<Float> sortedList = backend.getgrades();
		int size = sortedList.size();//gets size for division
		int partSize = size/4;

		
		
		JTextArea txtrTextHere = new JTextArea();
		txtrTextHere.setText(getString(sortedList,size,(size/2+partSize)+1,size));
		GridBagConstraints gbc_txtrTextHere = new GridBagConstraints();
		gbc_txtrTextHere.insets = new Insets(0, 0, 5, 5);
		gbc_txtrTextHere.fill = GridBagConstraints.BOTH;
		gbc_txtrTextHere.gridx = 0;
		gbc_txtrTextHere.gridy = 2;
		JScrollPane textHereScroll = new JScrollPane(txtrTextHere);
		contentPane.add(textHereScroll, gbc_txtrTextHere);
		
		JTextArea txtrTextHere_1 = new JTextArea();
		txtrTextHere_1.setText(getString(sortedList,size,size/2,size/2+partSize));
		GridBagConstraints gbc_txtrTextHere_1 = new GridBagConstraints();
		gbc_txtrTextHere_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtrTextHere_1.fill = GridBagConstraints.BOTH;
		gbc_txtrTextHere_1.gridx = 1;
		gbc_txtrTextHere_1.gridy = 2;
		JScrollPane textHereScroll_1 = new JScrollPane(txtrTextHere_1);
		contentPane.add(textHereScroll_1, gbc_txtrTextHere_1);
		
		
		JTextArea txtrTextHere_2 = new JTextArea();
		txtrTextHere_2.setText(getString(sortedList,size,partSize,size/2));
		GridBagConstraints gbc_txtrTextHere_2 = new GridBagConstraints();
		gbc_txtrTextHere_2.insets = new Insets(0, 0, 5, 5);
		gbc_txtrTextHere_2.fill = GridBagConstraints.BOTH;
		gbc_txtrTextHere_2.gridx = 2;
		gbc_txtrTextHere_2.gridy = 2;
		JScrollPane textHereScroll_2 = new JScrollPane(txtrTextHere_2);
		contentPane.add(textHereScroll_2, gbc_txtrTextHere_2);
		
		JTextArea txtrTextHere_3 = new JTextArea();
		txtrTextHere_3.setText(getString(sortedList,size,0,partSize));
		GridBagConstraints gbc_txtrTextHere_3 = new GridBagConstraints();
		gbc_txtrTextHere_3.insets = new Insets(0, 0, 5, 0);
		gbc_txtrTextHere_3.fill = GridBagConstraints.BOTH;
		gbc_txtrTextHere_3.gridx = 3;
		gbc_txtrTextHere_3.gridy = 2;
		JScrollPane textHereScroll_3 = new JScrollPane(txtrTextHere_3);
		contentPane.add(textHereScroll_3, gbc_txtrTextHere_3);
		
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
