package Presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class FrameEditProducts extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblTipo;
	private JLabel lblAlergenicos;
	private JLabel lblIngredientes;
	private JLabel lblPrecio;
	private JTextPane textPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public FrameEditProducts() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 415, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 15, 130, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 80, 20, 0, 15, 0, 15, 0, 20, 0, 150, 40, 0, 50, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrameEditProducts.class.getResource("/Resources/Images/Products/steak.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 3;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblTipo = new JLabel("Tipo:");
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.anchor = GridBagConstraints.WEST;
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 1;
		gbc_lblTipo.gridy = 5;
		contentPane.add(lblTipo, gbc_lblTipo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 5;
		contentPane.add(textField_1, gbc_textField_1);
		
		lblAlergenicos = new JLabel("Alergenicos:");
		GridBagConstraints gbc_lblAlergenicos = new GridBagConstraints();
		gbc_lblAlergenicos.anchor = GridBagConstraints.WEST;
		gbc_lblAlergenicos.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlergenicos.gridx = 1;
		gbc_lblAlergenicos.gridy = 7;
		contentPane.add(lblAlergenicos, gbc_lblAlergenicos);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 7;
		contentPane.add(textField_2, gbc_textField_2);
		
		lblIngredientes = new JLabel("Ingredientes:");
		GridBagConstraints gbc_lblIngredientes = new GridBagConstraints();
		gbc_lblIngredientes.anchor = GridBagConstraints.WEST;
		gbc_lblIngredientes.insets = new Insets(0, 0, 5, 5);
		gbc_lblIngredientes.gridx = 1;
		gbc_lblIngredientes.gridy = 9;
		contentPane.add(lblIngredientes, gbc_lblIngredientes);
		
		textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		textPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		gbc_textPane.gridwidth = 3;
		gbc_textPane.insets = new Insets(0, 0, 5, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 1;
		gbc_textPane.gridy = 10;
		contentPane.add(textPane, gbc_textPane);
		
		lblPrecio = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 12;
		contentPane.add(lblPrecio, gbc_lblPrecio);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 12;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.setForeground(Color.BLACK);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 14;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setForeground(Color.BLACK);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 14;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		/*The method setLocationRelativeTo(null) will center our window in the
		  middle of our screen*/
		setLocationRelativeTo(null);
	}

}
