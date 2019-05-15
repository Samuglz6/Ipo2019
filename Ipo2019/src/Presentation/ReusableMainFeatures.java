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
	}
	
	private void selection(int i)
	{
		switch(i)
		{
			case 1:
				lblNewLabel.setText("Ofertas");
				acoplar(this);
			break;
			case 2:
				lblNewLabel.setText("Productos");
				acoplar(this);
			break;
			case 3:
				lblNewLabel.setText("Clientes");
				acoplar(this);
			break;
			case 4:
				lblNewLabel.setText("Pedidos");
				acoplar(this);
			break;
			default:
				lblNewLabel.setText("");
				setBorder(null);
			break;
		}
	}
	
	private void acoplar(JPanel p)
	{
		p.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				comprobarSeleccionado(p);
				setBackground(new Color(0,0,0));
				lblNewLabel.setForeground(new Color(255,255,255));
			}
		});
	}
	private void comprobarSeleccionado(JPanel p)
	{
		for(int i = 0; i < p.getParent().getComponentCount(); i++)
		{
			if(p.getParent().getComponent(i).getBackground().getRGB() == -16777216)
			{
				p.getParent().getComponent(i).setBackground(new Color(255,255,255));
				p.getParent().getComponent(i).setForeground(new Color(0,0,0));
			}
		}
	}
}
