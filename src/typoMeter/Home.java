package typoMeter;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 467);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel typometer_title = new JLabel("");
		typometer_title.setBounds(600, 160, 300, 25);
		typometer_title.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));		
		Image typometer_title_obj = new ImageIcon(this.getClass().getResource("/typometer_title_lite.png")).getImage();
		typometer_title.setIcon(new ImageIcon(typometer_title_obj));
		contentPane.add(typometer_title);
		
		JLabel keyboard = new JLabel("");
		keyboard.setIcon(new ImageIcon("C:\\Users\\Datta\\eclipse-workspace\\datta\\TypoMeter-2.1\\Pictures\\keyboard.gif"));
		keyboard.setBounds(498, 215, 493, 345);
		contentPane.add(keyboard);
		
		JButton demo_button = new JButton("DEMO");
		demo_button.setBounds(520, 590, 100, 25);
		demo_button.setForeground(Color.WHITE);
		demo_button.setBackground(new Color(204, 0, 0));
		demo_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		demo_button.setFocusable(false);
		demo_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		demo_button.setToolTipText("Take a Quick Test");
		demo_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Demo.main(null);
				//this.setVisible(false);
				dispose();
				//processEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
			}
		});
		contentPane.add(demo_button);
		
		JButton login_button = new JButton("LOGIN");
		login_button.setBounds(640, 590, 100, 25);
		login_button.setForeground(Color.WHITE);
		login_button.setBackground(new Color(204, 0, 0));
		login_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		login_button.setFocusable(false);
		login_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login_button.setToolTipText("Login Into Your Account");
		login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Login second = new Login();
				second.setVisible(true);
				dispose();
			}
		});
		contentPane.add(login_button);
		
		JButton register_button = new JButton("REGISTER");
		register_button.setBounds(760, 590, 100, 25);
		register_button.setForeground(Color.WHITE);
		register_button.setBackground(new Color(204, 0, 0));
		register_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		register_button.setFocusable(false);
		register_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register_button.setToolTipText("Create a New Account");
		register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Register second = new Register();
				second.setVisible(true);
				dispose();
			}
		});
		contentPane.add(register_button);
		
		JButton developers_button = new JButton("DEVELOPERS");
		developers_button.setBounds(880, 590, 100, 25);
		developers_button.setForeground(Color.WHITE);
		developers_button.setBackground(new Color(204, 0, 0));
		developers_button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		developers_button.setFocusable(false);
		developers_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		developers_button.setToolTipText("Reach the Developers");
		developers_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Developers second = new Developers();
				second.setVisible(true);
				dispose();
			}
		});
		contentPane.add(developers_button);
		
		JButton exit_button = new JButton("");
		exit_button.setBounds(1046, 236, 30, 30);
		exit_button.setContentAreaFilled(false);
		exit_button.setIcon(new ImageIcon("C:\\Users\\Datta\\eclipse-workspace\\datta\\TypoMeter-2.1\\Pictures\\exit_button.png"));
		exit_button.setBorder(null);
		exit_button.setFocusable(false);
		exit_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit_button.setToolTipText("Exit the Application");
		exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(exit_button);
		
		JLabel background_picture = new JLabel("");
		background_picture.setBounds(200, 100, 1100, 610);
		Image background_picture_obj = new ImageIcon(this.getClass().getResource("/magna_doodle.png")).getImage();
		background_picture.setIcon(new ImageIcon(background_picture_obj));
		contentPane.add(background_picture);
	}
}