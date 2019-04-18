package Presentation;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class ReusableFoodAllergen extends JPanel {

	/**
	 * Create the panel.
	 */
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	public ReusableFoodAllergen(int i)
	{
		iniciar(i);
	}
	
	public void iniciar(int i) {
		setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 0, 20, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{5, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombre del tipo de alergenico");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		imagenes(i);
		
	}
	
	private void imagenes(int i)
	{
		switch(i)
		{
			case 1:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/gluten.png")));
				lblNewLabel_1.setText("Gluten.");
			break;
			case 2:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/crustacean.png")));
				lblNewLabel_1.setText("Crustaceos.");
			break;
			case 3:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/eggs.png")));
				lblNewLabel_1.setText("Huevos y derivados.");
			break;
			case 4:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/animal.png")));
				lblNewLabel_1.setText("Pescado.");
			break;
			case 5:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/peanut.png")));
				lblNewLabel_1.setText("Cacahuetes y derivados.");
			break;
			case 6:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/leaf.png")));
				lblNewLabel_1.setText("Soja.");
			break;
			case 7:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/milk.png")));
				lblNewLabel_1.setText("Lacteos y derivados.");
			break;
			case 8:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/almond.png")));
				lblNewLabel_1.setText("Frutos Secos.");
			break;
			case 9:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/leek.png")));
				lblNewLabel_1.setText("Apio.");
			break;
			case 10:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/mustard.png")));
				lblNewLabel_1.setText("Mostaza.");
			break;
			case 11:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/sesame.png")));
				lblNewLabel_1.setText("Granos de Sesamo.");
			break;
			case 12:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/molecular.png")));
				lblNewLabel_1.setText("Dioxido de Azufre y Sulfitos");
			break;
			case 13:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/mollusc.png")));
				lblNewLabel_1.setText("Moluscos.");
			break;
			case 14:
				lblNewLabel.setIcon(new ImageIcon(ReusableFoodAllergen.class.getResource("/Resources/Images/Alergenos/lupin.png")));
				lblNewLabel_1.setText("Altramuces.");
			break;
		}
	}
}
