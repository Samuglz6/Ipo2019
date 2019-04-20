package Presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class FrameHelp extends JFrame {

	/**
	 * Create the frame.
	 */
	public FrameHelp() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 625);
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrameLogin.class.getResource("/Resources/Images/icon_help.png")));
		setTitle("User help");
		getContentPane().setLayout(new BorderLayout(0, 0));
		/*The method setLocationRelativeTo(null) will center our window in the
		  middle of our screen*/
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrameHelp.class.getResource("/Resources/Images/icon_help.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Manual de Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		getContentPane().add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		getContentPane().add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(tabbedPane, BorderLayout.CENTER);
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		tabbedPane.add("Aplicacion", panel_5);
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		tabbedPane.add("Productos", panel_6);
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		tabbedPane.add("Clientes", panel_7);
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		tabbedPane.add("Pedidos", panel_8);
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		tabbedPane.add("Ofertas", panel_9);
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		tabbedPane.add("Sobre Nosotros", panel_10);
	}

}
