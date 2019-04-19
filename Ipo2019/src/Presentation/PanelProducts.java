package Presentation;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JSplitPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

@SuppressWarnings("serial")
public class PanelProducts extends JPanel {

	/**
	 * Create the panel.
	 */
	JPanel panel_1;
	
	public PanelProducts() {
		setBorder(null);
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerSize(1);
		splitPane.setDividerLocation(700);
		splitPane.setBorder(null);
		splitPane.setEnabled(false);
		add(splitPane);
		
		JPanel panel_2 = new JPanel();
		splitPane.setRightComponent(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_4, BorderLayout.NORTH);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{30, 0, 30, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblInformacionDelCliente = new JLabel("Informacion del Producto");
		lblInformacionDelCliente.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_lblInformacionDelCliente = new GridBagConstraints();
		gbc_lblInformacionDelCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacionDelCliente.gridx = 1;
		gbc_lblInformacionDelCliente.gridy = 1;
		panel_4.add(lblInformacionDelCliente, gbc_lblInformacionDelCliente);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_2.add(scrollPane_1, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		scrollPane_1.setViewportView(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		InfoProduct infoProduct = new InfoProduct();
		panel_7.add(infoProduct);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(null);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_3.add(scrollPane_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(null);
		scrollPane_2.setViewportView(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		scrollPane.setViewportView(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		for(int i = 0; i < 10; i++)
		{
			panel_5.add(new ReusableProduct());
		}
		for(int i = 1; i <= 5; i++)
		{
			panel_6.add(new ReusableSelection(i, this.getClass().getName()));
		}
	}
}