package Presentation;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

import Domain.Client;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.SoftBevelBorder;

public class ReusableClient extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	*/
	
	private Color color;
	private GridBagLayout gridBagLayout;
	private GridBagConstraints gbc_label;
	private GridBagConstraints gbc_lblNewLabel; 
	private GridBagConstraints gbc_lblNewLabel_1; 
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel label_1;
	
	public ReusableClient(Client c) {
		iniciar(c);
	}
	
	private void iniciar(Client c)
	{
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 0, 40, 0, 90, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{20, 0, 10, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		label = new JLabel("");
		try {
			label.setIcon((c.getImage()));
		}catch(Exception e){
			label.setIcon(new ImageIcon(ReusableClient.class.getResource("/Resources/Images/icon_error.png")));
		}
		
		gbc_label = new GridBagConstraints();
		gbc_label.gridheight = 3;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		lblNewLabel = new JLabel("Nombre del usuario");
		gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Descripcion del Usuario");
		gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ReusableClient.class.getResource("/Resources/Images/Clients/vip.png")));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 5;
		gbc_label_1.gridy = 3;
		add(label_1, gbc_label_1);

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				color = getBackground();
				setBackground(new Color(250,250,190));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(color);
			}
		});
	}

}
