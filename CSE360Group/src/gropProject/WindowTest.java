package gropProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JLabel;

/**
 * Main window for the program, links to other features with buttons,
 * and keeps track by using the back end class
 * Majority built using Eclipse WindowBuilder plug in
 * @author Albert De La Cruz
 *
 */
public class WindowTest {

	private JFrame frame;
	private backend backend;
	private String fileString = "yo";

	/**
	 *  Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowTest window = new WindowTest();
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
	public WindowTest() {
		backend = new backend(0, 100);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 694, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{150, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{150, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblCurrentFile = new JLabel("");
		GridBagConstraints gbc_lblCurrentFile = new GridBagConstraints();
		gbc_lblCurrentFile.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentFile.gridx = 7;
		gbc_lblCurrentFile.gridy = 1;
		frame.getContentPane().add(lblCurrentFile, gbc_lblCurrentFile);
		
		
		JButton importDataButton = new JButton("Import Data");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 3;
		frame.getContentPane().add(importDataButton, gbc_btnNewButton);
		
		//changing the frame when button is pressed
		importDataButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent arg0)
					{
						ImportData importDataFrame = new ImportData();
						importDataFrame.setVisible(true);
						//lblCurrentFile.setText("Current File: " + fileString);
						importDataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						importDataFrame.addWindowListener(new WindowListener()
								{
									@Override
									public void windowOpened(WindowEvent e) {
										// TODO Auto-generated method stub
										importDataFrame.setFileString(fileString);
									}
									@Override
									public void windowClosing(WindowEvent e) {
										fileString = importDataFrame.getFileString();
										lblCurrentFile.setText("Current File: " + fileString);
									}
									@Override
									public void windowClosed(WindowEvent e) {
										// TODO Auto-generated method stub
										fileString = importDataFrame.getFileString();
										lblCurrentFile.setText("Current File: " + fileString);
										try {
											backend.loadfile(fileString);
										}
										catch(IOException error)
										{
											
										}
									}
									@Override
									public void windowIconified(WindowEvent e) {}
									@Override
									public void windowDeiconified(WindowEvent e) {}
									@Override
									public void windowActivated(WindowEvent e) {}
									@Override
									public void windowDeactivated(WindowEvent e) {}
								});
						}
				});
		
		JButton appendDataButton = new JButton("Append data");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 7;
		gbc_btnNewButton_1.gridy = 3;
		frame.getContentPane().add(appendDataButton, gbc_btnNewButton_1);
		
		appendDataButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				appendDataSet appendDataFrame = new appendDataSet(backend);
				appendDataFrame.setVisible(true);
				appendDataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		
		});
		
		JButton deleteValueButton = new JButton("Delete value");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 9;
		gbc_btnNewButton_2.gridy = 3;
		frame.getContentPane().add(deleteValueButton , gbc_btnNewButton_2);
		deleteValueButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				DeleteValue DeleteValueFrame = new DeleteValue(backend);
				DeleteValueFrame.setVisible(true);
				DeleteValueFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		
		});
		
		JButton analyzeDataButton = new JButton("Analyze Data");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 4;
		gbc_btnNewButton_3.gridy = 6;
		frame.getContentPane().add(analyzeDataButton , gbc_btnNewButton_3);
		analyzeDataButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				AnalyzeData analyzeDataFrame = new AnalyzeData(backend);
				analyzeDataFrame.setVisible(true);
				analyzeDataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		
		});
		
		JButton setBoundsButton = new JButton("Set Bounds");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 7;
		gbc_btnNewButton_4.gridy = 6;
		frame.getContentPane().add(setBoundsButton, gbc_btnNewButton_4);
		setBoundsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				SetBoundries setBoundriesFrame = new SetBoundries(backend);
				setBoundriesFrame.setVisible(true);
				setBoundriesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		
		});
		
		JButton displayDataButton = new JButton("Display Data");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.gridx = 9;
		gbc_btnNewButton_5.gridy = 6;
		frame.getContentPane().add(displayDataButton, gbc_btnNewButton_5);
		displayDataButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				DisplayData displayDataFrame = new DisplayData(backend);
				displayDataFrame.setVisible(true);
				displayDataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		
		});
		
		JButton displayGraphButton = new JButton("Display Graph");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 4;
		gbc_btnNewButton_6.gridy = 9;
		frame.getContentPane().add(displayGraphButton , gbc_btnNewButton_6);
		displayGraphButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				displayGraph displayGraphFrame = new displayGraph();
				displayGraphFrame.setVisible(true);
				displayGraphFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		
		}); 
		
		JButton errorsButton = new JButton("Errors");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 7;
		gbc_btnNewButton_7.gridy = 9;
		frame.getContentPane().add(errorsButton, gbc_btnNewButton_7);
		errorsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				ErrorWindow errorWindowFrame = new ErrorWindow(backend);
				errorWindowFrame.setVisible(true);
				errorWindowFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		
		});
		
		JButton createReportButton = new JButton("Create Report");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 9;
		gbc_btnNewButton_8.gridy = 9;
		frame.getContentPane().add(createReportButton, gbc_btnNewButton_8);
		createReportButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				ReportWindow reportWindowFrame = new ReportWindow(backend);
				reportWindowFrame.setVisible(true);
				reportWindowFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		
		});
		
		
		JButton exitButton = new JButton("Exit");
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.gridx = 9;
		gbc_btnNewButton_9.gridy = 11;
		frame.getContentPane().add(exitButton, gbc_btnNewButton_9);
		exitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				frame.dispose();//closes window
			}
		});
	}

}
