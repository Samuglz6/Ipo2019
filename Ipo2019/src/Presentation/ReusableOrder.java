package Presentation;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

@SuppressWarnings("serial")
public class ReusableOrder extends JPanel {

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
	private JLabel lblPrecio;
	private JLabel lblTipo;
	private JLabel lblEstado;
	
	public ReusableOrder() {
		iniciar();
	}
	
	private void iniciar()
	{
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 0, 40, 0, 40, 0, 40, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{20, 0, 10, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(ReusableOrder.class.getResource("/Resources/Images/Orders/cooking.png")));
		gbc_label = new GridBagConstraints();
		gbc_label.gridheight = 3;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		lblNewLabel = new JLabel("N\u00BA del pedido");
		gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		lblTipo = new JLabel("Tipo");
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 5;
		gbc_lblTipo.gridy = 1;
		add(lblTipo, gbc_lblTipo);
		
		lblNewLabel_1 = new JLabel("Nombre del Cliente");
		gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblPrecio = new JLabel("Coste");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 5;
		gbc_lblPrecio.gridy = 3;
		add(lblPrecio, gbc_lblPrecio);
		
		lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 7;
		gbc_lblEstado.gridy = 3;
		add(lblEstado, gbc_lblEstado);

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
