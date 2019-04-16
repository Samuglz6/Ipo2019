package Presentation;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ReusableSelection extends JPanel {

	/**
	 * Create the panel.
	 */
	private Color color;
	private JLabel lblNewLabel_1;
	
	public ReusableSelection(int i, String a)
	{
		setBorder(new LineBorder(new Color(0, 0, 0)));
		iniciar(i, a);
	}
	
	public void iniciar(int i, String a) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{20, 0, 0, 0, 20, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ReusableSelection.class.getResource("/Resources/Images/icon_picture.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Text");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		switch(a.split("Presentation.", 2)[1])
		{
			case "PanelClients":
				clientes(i);
			break;
			
			case "PanelProducts":
				productos(i);
			break;
			
			case "PanelOrders":
				pedidos(i);
			break;
		}
		
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
	
	private void productos(int i)
	{
		switch(i)
		{
			case 1:
				lblNewLabel_1.setText("Menus");
			break;
			
			case 2:
				lblNewLabel_1.setText("Platos Individuales");
			break;
			
			case 3:
				lblNewLabel_1.setText("Platos Combinados");
			break;
			
			case 4:
				lblNewLabel_1.setText("Bebidas");
			break;
		
			case 5:
				lblNewLabel_1.setText("Postres");
			break;
		}
	}
	
	private void clientes(int i)
	{
		switch(i)
		{
			case 1:
				lblNewLabel_1.setText("Clientes Normales");
			break;
			case 2:
				lblNewLabel_1.setText("Clientes VIP");
			break;
		}
	}
	
	private void pedidos(int i)
	{
		switch(i)
		{
			case 1:
				lblNewLabel_1.setText("Todos");
			break;
			
			case 2:
				lblNewLabel_1.setText("En Cocina");
			break;
			
			case 3:
				lblNewLabel_1.setText("En Reparto");
			break;
			
			case 4:
				lblNewLabel_1.setText("A la Espera");
			break;
		
			case 5:
				lblNewLabel_1.setText("Finalizado");
			break;
		}
	}
}
