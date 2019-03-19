package Presentation;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Domain.Application;
import Persistence.DBManager;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;

public class MainWindow {

	private JFrame frameMain;
	private JTextField mail_content;
	private JTextField phone_content;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					MainWindow window = new MainWindow();
					window.frameMain.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();	
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public MainWindow() throws ClassNotFoundException, SQLException {
		Application.getInstance();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ClassNotFoundException 
	 */
	private void initialize() throws ClassNotFoundException {
		frameMain = new JFrame();
		frameMain.setBounds(100, 100, 1300, 950);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.setResizable(false);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 450, 30, 200, 30, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{50, 0, 100, 30, 0, 30, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		frameMain.getContentPane().setLayout(gridBagLayout);
		
		JButton help_button = new JButton("");
		help_button.setOpaque(false);
		help_button.setFocusPainted(false);
		help_button.setBorderPainted(false);
		help_button.setContentAreaFilled(false);
		help_button.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		help_button.setIcon(new ImageIcon(MainWindow.class.getResource("/Resources/Images/icon_help.png")));
		help_button.setToolTipText("Click in the ? icon for more information.");
		GridBagConstraints gbc_help_button = new GridBagConstraints();
		gbc_help_button.anchor = GridBagConstraints.NORTH;
		gbc_help_button.insets = new Insets(0, 0, 5, 5);
		gbc_help_button.gridx = 5;
		gbc_help_button.gridy = 1;
		frameMain.getContentPane().add(help_button, gbc_help_button);
		
		help_button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "User Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		frameMain.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{30, 120, 50, 0, 10, 130, 0, 0, 0, 30, 0};
		gbl_panel.rowHeights = new int[]{30, 0, 0, 0, 0, 20, 30, 0, 10, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MainWindow.class.getResource("/Resources/Images/icon_error.png")));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridheight = 5;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		panel.add(label, gbc_label);
		
		JLabel name_label = new JLabel("Name:");
		GridBagConstraints gbc_name_label = new GridBagConstraints();
		gbc_name_label.anchor = GridBagConstraints.WEST;
		gbc_name_label.insets = new Insets(0, 0, 5, 5);
		gbc_name_label.gridx = 3;
		gbc_name_label.gridy = 1;
		panel.add(name_label, gbc_name_label);
		
		JTextField name_content = new JTextField();
		name_content.setText(Application.getUser().getName());
		name_content.setEditable(false);
		GridBagConstraints gbc_name_content = new GridBagConstraints();
		gbc_name_content.gridwidth = 4;
		gbc_name_content.fill = GridBagConstraints.HORIZONTAL;
		gbc_name_content.insets = new Insets(0, 0, 5, 5);
		gbc_name_content.gridx = 5;
		gbc_name_content.gridy = 1;
		panel.add(name_content, gbc_name_content);
		
		JLabel surname_label = new JLabel("Surname:");
		GridBagConstraints gbc_surname_label = new GridBagConstraints();
		gbc_surname_label.anchor = GridBagConstraints.WEST;
		gbc_surname_label.insets = new Insets(0, 0, 5, 5);
		gbc_surname_label.gridx = 3;
		gbc_surname_label.gridy = 2;
		panel.add(surname_label, gbc_surname_label);
		
		JTextField surname_content = new JTextField();
		surname_content.setText(Application.getUser().getSurname());
		surname_content.setEditable(false);
		GridBagConstraints gbc_surname_content = new GridBagConstraints();
		gbc_surname_content.gridwidth = 4;
		gbc_surname_content.fill = GridBagConstraints.HORIZONTAL;
		gbc_surname_content.insets = new Insets(0, 0, 5, 5);
		gbc_surname_content.gridx = 5;
		gbc_surname_content.gridy = 2;
		panel.add(surname_content, gbc_surname_content);
		
		JLabel lblMail = new JLabel("Mail:");
		GridBagConstraints gbc_lblMail = new GridBagConstraints();
		gbc_lblMail.anchor = GridBagConstraints.WEST;
		gbc_lblMail.insets = new Insets(0, 0, 5, 5);
		gbc_lblMail.gridx = 3;
		gbc_lblMail.gridy = 3;
		panel.add(lblMail, gbc_lblMail);
		
		mail_content = new JTextField();
		mail_content.setText(Application.getUser().getMail());
		mail_content.setEditable(false);
		GridBagConstraints gbc_mail_content = new GridBagConstraints();
		gbc_mail_content.gridwidth = 4;
		gbc_mail_content.insets = new Insets(0, 0, 5, 5);
		gbc_mail_content.fill = GridBagConstraints.HORIZONTAL;
		gbc_mail_content.gridx = 5;
		gbc_mail_content.gridy = 3;
		panel.add(mail_content, gbc_mail_content);
		
		JLabel lblPhone = new JLabel("Phone:");
		GridBagConstraints gbc_lblPhone = new GridBagConstraints();
		gbc_lblPhone.anchor = GridBagConstraints.WEST;
		gbc_lblPhone.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhone.gridx = 3;
		gbc_lblPhone.gridy = 4;
		panel.add(lblPhone, gbc_lblPhone);
		
		phone_content = new JTextField();
		phone_content.setText(Application.getUser().getPhone());
		phone_content.setEditable(false);
		GridBagConstraints gbc_phone_content = new GridBagConstraints();
		gbc_phone_content.gridwidth = 4;
		gbc_phone_content.insets = new Insets(0, 0, 5, 5);
		gbc_phone_content.fill = GridBagConstraints.HORIZONTAL;
		gbc_phone_content.gridx = 5;
		gbc_phone_content.gridy = 4;
		panel.add(phone_content, gbc_phone_content);
		
		JButton btnNewButton_1 = new JButton("Select image");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser file_chooser = new JFileChooser();
						
				if(file_chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
				{
					//item_label.setText(file_chooser.getSelectedFile().getName());
				}
			}
		});
		
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 6;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JLabel last_access_label = new JLabel("Last Access:");
		GridBagConstraints gbc_last_access_label = new GridBagConstraints();
		gbc_last_access_label.anchor = GridBagConstraints.WEST;
		gbc_last_access_label.insets = new Insets(0, 0, 5, 5);
		gbc_last_access_label.gridx = 3;
		gbc_last_access_label.gridy = 6;
		panel.add(last_access_label, gbc_last_access_label);
		
		JLabel last_access_content = new JLabel();
		last_access_content.setText(Application.getUser().getLastAccess());
		GridBagConstraints gbc_last_access_content = new GridBagConstraints();
		gbc_last_access_content.fill = GridBagConstraints.HORIZONTAL;
		gbc_last_access_content.insets = new Insets(0, 0, 5, 5);
		gbc_last_access_content.gridx = 5;
		gbc_last_access_content.gridy = 6;
		panel.add(last_access_content, gbc_last_access_content);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setEnabled(false);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 7;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Edit");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 8;
		gbc_btnNewButton_2.gridy = 7;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JTabbedPane panel_1 = new JTabbedPane(JTabbedPane.TOP);
		panel_1.setBorder(new TitledBorder(null, "Messages", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 1;
		frameMain.getContentPane().add(panel_1, gbc_panel_1);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBorder(new TitledBorder(null, "Messages", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.addTab("Read", null, tabbedPane_1, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		panel_1.addTab("Send", null, tabbedPane_2, null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBackground(UIManager.getColor("scrollbar"));
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridwidth = 3;
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 4;
		frameMain.getContentPane().add(tabbedPane, gbc_tabbedPane);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0};
		gbl_panel_4.rowHeights = new int[]{0};
		gbl_panel_4.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		tabbedPane.addTab("New tab", null, panel_2, null);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0};
		gbl_panel_2.rowHeights = new int[]{0};
		gbl_panel_2.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0};
		gbl_panel_3.rowHeights = new int[]{0};
		gbl_panel_3.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		//Takes the image icon from the Resources' local repository
		frameMain.setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/Resources/Images/icon_network.png")));

		frameMain.addWindowListener(new java.awt.event.WindowAdapter() 
		{
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) 
		    {
		        if (JOptionPane.showConfirmDialog(frameMain, 
		            "Are you sure you want to exit?", "Close?", 
		            JOptionPane.OK_CANCEL_OPTION,
		            JOptionPane.CANCEL_OPTION) == JOptionPane.CANCEL_OPTION)
		        {
		        	try 
		        	{
		        		DBManager.getInstance();
						DBManager.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        	Date mydate = new Date();
		        	Application.getUser().setLast_access(new SimpleDateFormat("dd-MM-yyyy").format(mydate));
		        	System.out.println(Application.getUser().getLast_access());
		        	
		            System.exit(0);
		        }
		    }
		});
		
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				btnNewButton.setEnabled(false);
				btnNewButton_2.setEnabled(true);
				name_content.setEditable(false);
				surname_content.setEditable(false);
				mail_content.setEditable(false);
				phone_content.setEditable(false);
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				btnNewButton.setEnabled(true);
				btnNewButton_2.setEnabled(false);
				name_content.setEditable(true);
				surname_content.setEditable(true);
				mail_content.setEditable(true);
				phone_content.setEditable(true);
			}
		});
	}
	public Window getFrame() {
		// TODO Auto-generated method stub
		return frameMain;
	}

	@SuppressWarnings("unused")
	private void msgbox(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
}
