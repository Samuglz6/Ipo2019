package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JTextField;

import Domain.Application;
import Persistence.DBManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dialog.ModalExclusionType;

public class LoginWindow
{

	JFrame frameLogin;
	
	/**
	 * Launch the application.
	 */
	public static void main(String [] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public LoginWindow() throws ClassNotFoundException, SQLException 
	{	
		Application.getInstance();
		initialize();
	}
	
	
	public void run() {
		try {
			LoginWindow window = new LoginWindow();
			window.frameLogin.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frameLogin = new JFrame();
		frameLogin.setBounds(100, 100, 472, 720);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frameLogin.setUndecorated(true);
		
		/*The method setLocationRelativeTo(null) will center our window in the
		  middle of our screen*/
		frameLogin.setLocationRelativeTo(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		frameLogin.getContentPane().setLayout(gridBagLayout);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginWindow.class.getResource("/Resources/Images/login_background.png")));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		frameLogin.getContentPane().add(label, gbc_label);
		
		
		//panel.setBackground(MainWindow.class.getResource("/Resources/Images/login_background.png").toString());
		
		/*---------------------------------------------------------------------------------
			For furthermore comprehension of the program, every action listener have been
			grouped by the component attached to it. 
		---------------------------------------------------------------------------------*/
	}        
} 
 

