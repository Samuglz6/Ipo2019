package Presentation;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class PanelTools extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelTools() {
		setBorder(null);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setBorder(null);
		panel_1.setBackground(Color.BLACK);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 30, 10, 30, 40, 0};
		gbl_panel_1.rowHeights = new int[]{25, 0, 10, 40, 15, 40, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameOptions fop = new FrameOptions();
				fop.setVisible(true);
			}
		});
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameHelp fhel = new FrameHelp();
				fhel.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(PanelTools.class.getResource("/Resources/Images/icon_help.png")));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 1;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		btnNewButton_1.setIcon(new ImageIcon(PanelTools.class.getResource("/Resources/Images/icon_options.png")));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 4;
		gbc_btnNewButton_1.gridy = 1;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Editar Usuarios");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrameEditClients fec = new FrameEditClients();
				fec.setVisible(true);
			}
		});
		btnNewButton_3.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.gridwidth = 3;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 3;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnEditarProductos = new JButton("Editar Productos");
		btnEditarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameEditProducts fep = new FrameEditProducts();
				fep.setVisible(true);
			}
		});
		btnEditarProductos.setBackground(Color.WHITE);
		GridBagConstraints gbc_btnEditarProductos = new GridBagConstraints();
		gbc_btnEditarProductos.fill = GridBagConstraints.BOTH;
		gbc_btnEditarProductos.gridwidth = 3;
		gbc_btnEditarProductos.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditarProductos.gridx = 2;
		gbc_btnEditarProductos.gridy = 5;
		panel_1.add(btnEditarProductos, gbc_btnEditarProductos);
	}

}
