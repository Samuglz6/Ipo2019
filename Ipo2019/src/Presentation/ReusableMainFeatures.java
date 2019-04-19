package Presentation;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

@SuppressWarnings("serial")
public class ReusableMainFeatures extends JPanel {
	/**
	 * Create the panel.
	 */
	private JLabel lblNewLabel;
	private Color color;
	
	public ReusableMainFeatures(int i)
	{
		iniciar(i);
	}
	
	public void iniciar(int i) {
		setBackground(Color.WHITE);
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{30, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		selection(i);
		
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
		
			@Override
			public void mousePressed(MouseEvent e) {
				setBackground(new Color(0,0,0));
				lblNewLabel.setForeground(new Color(255,255,255));
			}
		});
	}
	
	private void selection(int i)
	{
		switch(i)
		{
			case 1:
				lblNewLabel.setText("Ofertas");
			break;
			case 2:
				lblNewLabel.setText("Productos");
			break;
			case 3:
				lblNewLabel.setText("Clientes");
			break;
			case 4:
				lblNewLabel.setText("Pedidos");
			break;
			default:
				lblNewLabel.setText("");
				setBorder(null);
			break;
		}
	}
	
	private void cambiar()
	{
		
	}

}
