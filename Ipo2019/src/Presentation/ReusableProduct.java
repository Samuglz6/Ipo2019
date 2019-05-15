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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.SoftBevelBorder;

import Domain.Product;

@SuppressWarnings("serial")
public class ReusableProduct extends JPanel {

	/**
	 * Create the panel.
	*/
	
	private Color color;
	private GridBagLayout gridBagLayout;
	private GridBagConstraints gbc_label;
	private GridBagConstraints gbc_lblNewLabel; 
	private GridBagConstraints gbc_lblNewLabel_1; 
	private GridBagConstraints gbc_btnNewButton;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel lblPrecio;
	
	public ReusableProduct(Product p) {
		iniciar(p);
	}
	
	private void iniciar(Product p)
	{
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 0, 40, 0, 20, 0, 20, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{20, 0, 0, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		label = new JLabel("");
		if(p != null)
			switch(p.getType())
			{
				case "Menu":
					label.setIcon(new ImageIcon(ReusableProduct.class.getResource("/Resources/Images/Products/menu.png")));
				break;
				case "Dessert":
					label.setIcon(new ImageIcon(ReusableProduct.class.getResource("/Resources/Images/Products/dessert.png")));
				break;
				case "Meal":
					label.setIcon(new ImageIcon(ReusableProduct.class.getResource("/Resources/Images/Products/meal.png")));
				break;
				case "Beberage":
					label.setIcon(new ImageIcon(ReusableProduct.class.getResource("/Resources/Images/Products/drink.png")));
				break;	
			}
		else label.setIcon(new ImageIcon(ReusableProduct.class.getResource("/Resources/Images/Products/steak.png")));
		
		gbc_label = new GridBagConstraints();
		gbc_label.gridheight = 3;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		if(p != null) lblNewLabel = new JLabel(p.getName());
		else lblNewLabel = new JLabel("Nombre del producto");
		gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		if(p != null) lblNewLabel_1 = new JLabel(p.getType());
		else lblNewLabel_1 = new JLabel("Descripcion del producto");
		gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		if(p != null) lblPrecio = new JLabel("Precio: "+p.getPrice());
		else lblPrecio = new JLabel("Precio");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 5;
		gbc_lblPrecio.gridy = 3;
		add(lblPrecio, gbc_lblPrecio);
		
		btnNewButton = new JButton("A\u00F1adir al carrito");
		gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 7;
		gbc_btnNewButton.gridy = 3;
		add(btnNewButton, gbc_btnNewButton);

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