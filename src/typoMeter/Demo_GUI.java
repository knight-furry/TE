package typoMeter;

import javax.swing.JFrame;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import java.awt.Insets;

public class Demo_GUI
{
	public JFrame frame;
	private JTextField testField;
	private Stopwatch sw = new Stopwatch();
	private final WordUtility wu = new WordUtility();

	public Demo_GUI(TypingSample sample)
	{
		initialize(sample);
	}

	private void initialize(TypingSample sample)
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		// frame.setBounds(100, 100, 600, 300);
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel typometer_title = new JLabel("");
		typometer_title.setBounds(600, 160, 300, 25);
		typometer_title.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Image typometer_title_obj = new ImageIcon(this.getClass().getResource("/typometer_title_lite.png")).getImage();
		typometer_title.setIcon(new ImageIcon(typometer_title_obj));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(typometer_title);
		
		JTextArea paragraph = new JTextArea(sample.getSampleText());
		paragraph.setForeground(new Color(0, 0, 0));
		paragraph.setWrapStyleWord(true);
		paragraph.setMargin(new Insets(2, 5, 2, 5));
		paragraph.setFocusable(false);
		paragraph.setBorder(null);
		paragraph.setBackground(new Color(245, 245, 245));
		paragraph.setBounds(514, 250, 460, 150);
		paragraph.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		paragraph.setLineWrap(true);
		paragraph.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		paragraph.setToolTipText("Sample Paragraph");
		paragraph.setEditable(false);
		frame.getContentPane().add(paragraph);		
		
		testField = new JTextField();
		testField.setBounds(514, 440, 460, 100);
		testField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		testField.setHorizontalAlignment(SwingConstants.CENTER);
		testField.setForeground(Color.BLACK);
		testField.setBackground(new Color(245, 245, 245));
		testField.setBorder(null);
		testField.setToolTipText("Start Typing here...");
		frame.getContentPane().add(testField);
		
		JButton home_button = new JButton("HOME");
		home_button.setBounds(515, 590, 100, 25);
		home_button.setForeground(Color.WHITE);
		home_button.setBackground(new Color(204, 0, 0));
		home_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		home_button.setFocusable(false);
		home_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		home_button.setToolTipText("Back to Homepage");
		home_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Home obj = new Home();
				obj.setVisible(true);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(home_button);
		
		JButton login_button = new JButton("LOGIN");
		login_button.setBounds(640, 590, 100, 25);
		login_button.setForeground(Color.WHITE);
		login_button.setBackground(new Color(204, 0, 0));
		login_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		login_button.setFocusable(false);
		login_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login_button.setToolTipText("Login Into Your Account");
		login_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Login obj = new Login();
				obj.setVisible(true);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(login_button);
		
		JButton register_button = new JButton("REGISTER");
		register_button.setBounds(758, 590, 100, 25);
		register_button.setForeground(Color.WHITE);
		register_button.setBackground(new Color(204, 0, 0));
		register_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		register_button.setFocusable(false);
		register_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register_button.setToolTipText("Create a New Account");
		register_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Register obj = new Register();
				obj.setVisible(true);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(register_button);
		
		JButton developers_button = new JButton("DEVELOPERS");
		developers_button.setBounds(883, 590, 100, 25);
		developers_button.setForeground(Color.WHITE);
		developers_button.setBackground(new Color(204, 0, 0));
		developers_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		developers_button.setFocusable(false);
		developers_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		developers_button.setToolTipText("Reach the Developers");
		developers_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Developers obj = new Developers();
				obj.setVisible(true);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(developers_button);
		
		JButton exit_button = new JButton("");
		exit_button.setBounds(1046, 236, 30, 30);
		exit_button.setContentAreaFilled(false);
		exit_button.setIcon(new ImageIcon("C:\\Users\\Datta\\eclipse-workspace\\datta\\TypoMeter-2.0\\Pictures\\exit_button.png"));
		exit_button.setBorder(null);
		exit_button.setFocusable(false);
		exit_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit_button.setToolTipText("Exit the Application");
		exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(exit_button);
		
		JButton refresh_button = new JButton("");
		refresh_button.setBounds(1046, 318, 30, 30);
		refresh_button.setContentAreaFilled(false);
		refresh_button.setIcon(new ImageIcon("C:\\Users\\Datta\\eclipse-workspace\\datta\\TypoMeter-2.0\\Pictures\\refresh_button.png"));
		refresh_button.setBorder(null);
		refresh_button.setFocusable(false);
		refresh_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		refresh_button.setToolTipText("Restart the Test");
		refresh_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Demo.main(null);
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(refresh_button);
		
		JPanel result_board = new JPanel();
		result_board.setBackground(new Color(245, 245, 245));
		result_board.setToolTipText("Results for the Completed Test");
		result_board.setBounds(1140, 160, 300, 200);
		result_board.setBorder(new MatteBorder(1, 1, 5, 5, (Color) new Color(0, 51, 153)));
		frame.getContentPane().add(result_board);
		result_board.setLayout(new BoxLayout(result_board, BoxLayout.Y_AXIS));
		
		JLabel result_title = new JLabel("           RESULT");
		result_title.setForeground(new Color(0, 51, 153));
		result_title.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		result_board.add(result_title);
		
		JLabel stopwatchField = new JLabel(" Time: 0.0 Seconds");
		stopwatchField.setForeground(Color.RED);
		stopwatchField.setFont(new Font("Verdana", Font.PLAIN, 18));
		result_board.add(stopwatchField);
		
		JLabel wordCountField = new JLabel(" Number of Words: 0");
		wordCountField.setFont(new Font("Verdana", Font.PLAIN, 18));
		result_board.add(wordCountField);
		
		JLabel accuracyField = new JLabel("");
		accuracyField.setFont(new Font("Verdana", Font.PLAIN, 18));
		accuracyField.setVisible(false);
		result_board.add(accuracyField);
		
		JLabel wrdPerMinField = new JLabel("");
		wrdPerMinField.setFont(new Font("Verdana", Font.PLAIN, 18));
		wrdPerMinField.setVisible(false);
		result_board.add(wrdPerMinField);

		Timer stopwatchTimer = new Timer(500, new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				double timeElapsed = sw.timeElapsed()/1000;
				stopwatchField.setText(String.format(" Time : %.1f Seconds", (float)timeElapsed));
			}
		});
		
		JLabel background_picture = new JLabel("");
		background_picture.setBounds(200, 100, 1100, 610);
		background_picture.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(background_picture);
		Image background_picture_obj = new ImageIcon(this.getClass().getResource("/magna_doodle.png")).getImage();
		background_picture.setIcon(new ImageIcon(background_picture_obj));
		
		testField.addKeyListener(new KeyAdapter()
		{
                        @Override
			public void keyReleased(KeyEvent e)
			{
				if (!stopwatchTimer.isRunning()) 
				{
					sw = new Stopwatch(); 
					stopwatchTimer.start();
				}
				int wordCount = wu.countWords(testField.getText());
				wordCountField.setText(String.format(" Number of Words : %d",wordCount));
				if (testField.getText().length() >= sample.getCharacterCount())
				{
					testField.setEnabled(false); 
					stopwatchTimer.stop();
					sw.setStop(); 
					float acurracyPercent = wu.acurracy(sample.getSampleText(),testField.getText())*100; 
					accuracyField.setText(String.format(" Accuracy : %.2f%%", acurracyPercent)); 
					double wordsPerMin = wu.wordsPerMinute(sw.getTotalTime(), wordCount); 
					wrdPerMinField.setText(String.format(" Net Speed : %.2f WPM", wordsPerMin)); 

					wrdPerMinField.setVisible(true);
					accuracyField.setVisible(true);
				}
				
			}
		});
		
	}
}