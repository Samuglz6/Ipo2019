package Presentation;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameLogin
{
	JFrame frameLogin;
	private JTextField textField;
	private JTextField textField_1;
	private Color color;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public FrameLogin() throws ClassNotFoundException, SQLException 
	{	
		initialize();
	}
	
	
	public void run() {
		try {
			FrameLogin window = new FrameLogin();
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
		frameLogin.setResizable(false);
		frameLogin.setBounds(100, 100, 472, 715);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frameLogin.setUndecorated(true);
		
		/*The method setLocationRelativeTo(null) will center our window in the
		  middle of our screen*/
		frameLogin.setLocationRelativeTo(null);
		frameLogin.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		frameLogin.getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 40, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Restaurante El Gato Negro");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(FrameLogin.class.getResource("/Resources/Images/logo_icon.png")));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 3;
		panel.add(label, gbc_label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.WHITE);
		frameLogin.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(null);
		panel_5.setBackground(Color.BLACK);
		panel_1.add(panel_5, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{50, 0};
		gbl_panel_5.rowHeights = new int[]{230, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(Color.WHITE);
		frameLogin.getContentPane().add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(null);
		panel_6.setBackground(Color.BLACK);
		panel_2.add(panel_6, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{50, 0};
		gbl_panel_6.rowHeights = new int[]{230, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBackground(Color.BLACK);
		frameLogin.getContentPane().add(panel_3, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{85, 0, 30, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{50, 0, 0, 0, 30, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		lblNewLabel_1 = new JLabel("Registrarse ahora");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				color = lblNewLabel_1.getForeground();
				lblNewLabel_1.setForeground(new Color(121, 212, 244));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setForeground(color);
			}
		});
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 1;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Recupere su contrase\u00F1a");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				color = lblNewLabel_2.getForeground();
				lblNewLabel_2.setForeground(new Color(121, 212, 244));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2.setForeground(color);
			}
		});
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 2;
		panel_3.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"ES", "EN"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		panel_3.add(comboBox, gbc_comboBox);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_4.setBackground(Color.WHITE);
		frameLogin.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_7.rowHeights = new int[]{0, 0, 10, 0};
		gbl_panel_7.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(FrameLogin.class.getResource("/Resources/Images/user-login-button.png")));
		btnNewButton.setBorder(BorderFactory.createEmptyBorder());
		btnNewButton.setBackground(null);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		panel_7.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8, BorderLayout.NORTH);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_8.rowHeights = new int[]{40, 0, 0, 0, 0, 0, 0, 30, 0};
		gbl_panel_8.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JLabel lblIniciarSesion = new JLabel("Iniciar Sesion");
		lblIniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblIniciarSesion = new GridBagConstraints();
		gbc_lblIniciarSesion.insets = new Insets(0, 0, 5, 5);
		gbc_lblIniciarSesion.gridx = 1;
		gbc_lblIniciarSesion.gridy = 4;
		panel_8.add(lblIniciarSesion, gbc_lblIniciarSesion);
		
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9, BorderLayout.WEST);
		
		JPanel panel_10 = new JPanel();
		panel_4.add(panel_10, BorderLayout.EAST);
		
		JPanel panel_11 = new JPanel();
		panel_4.add(panel_11, BorderLayout.CENTER);
		GridBagLayout gbl_panel_11 = new GridBagLayout();
		gbl_panel_11.columnWidths = new int[]{0, 200, 0, 0};
		gbl_panel_11.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_11.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_11.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_11.setLayout(gbl_panel_11);
		
		JSplitPane splitPane = new JSplitPane();
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		splitPane.setBorder(null);
		splitPane.setDividerSize(0);
		gbc_splitPane.insets = new Insets(0, 0, 5, 5);
		gbc_splitPane.fill = GridBagConstraints.HORIZONTAL;
		gbc_splitPane.gridx = 1;
		gbc_splitPane.gridy = 1;
		panel_11.add(splitPane, gbc_splitPane);
		
		JPanel panel_12 = new JPanel();
		splitPane.setLeftComponent(panel_12);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel_12.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(FrameLogin.class.getResource("/Resources/Images/user.png")));
		
		JPanel panel_14 = new JPanel();
		splitPane.setRightComponent(panel_14);
		GridBagLayout gbl_panel_14 = new GridBagLayout();
		gbl_panel_14.columnWidths = new int[]{0, 0};
		gbl_panel_14.rowHeights = new int[]{0, 5, 0, 5, 0};
		gbl_panel_14.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_14.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_14.setLayout(gbl_panel_14);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 2;
		panel_14.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JSplitPane splitPane_1 = new JSplitPane();
		GridBagConstraints gbc_splitPane_1 = new GridBagConstraints();
		splitPane_1.setBorder(null);
		splitPane_1.setDividerSize(0);
		gbc_splitPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_splitPane_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_splitPane_1.gridx = 1;
		gbc_splitPane_1.gridy = 2;
		panel_11.add(splitPane_1, gbc_splitPane_1);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(null);
		splitPane_1.setRightComponent(panel_15);
		GridBagLayout gbl_panel_15 = new GridBagLayout();
		gbl_panel_15.columnWidths = new int[]{0, 0};
		gbl_panel_15.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_15.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_15.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_15.setLayout(gbl_panel_15);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 2;
		panel_15.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		splitPane_1.setLeftComponent(panel_13);
		panel_13.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FrameLogin.class.getResource("/Resources/Images/key.png")));
		panel_13.add(lblNewLabel_3);
		
		
		//panel.setBackground(MainWindow.class.getResource("/Resources/Images/login_background.png").toString());
		
		/*---------------------------------------------------------------------------------
			For furthermore comprehension of the program, every action listener have been
			grouped by the component attached to it. 
		---------------------------------------------------------------------------------*/
	}        
} 
 

