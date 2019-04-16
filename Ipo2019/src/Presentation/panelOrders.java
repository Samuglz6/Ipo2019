package Presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class panelOrders extends JPanel {

	/**
	 * Create the panel.
	 */
	JPanel panel_1;
	
	public panelOrders() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		add(splitPane);
		splitPane.setResizeWeight(0.15f);
		splitPane.setDividerLocation(.2f);
		
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
		panel_2.add(scrollPane_1, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_3.add(scrollPane_2, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
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
			panel_5.add(new ReusableOrder());
		}
		
		for(int i = 1; i <= 5; i++)
		{
			panel_6.add(new ReusableSelection(i, this.getClass().getName()));
		}
	}

}
