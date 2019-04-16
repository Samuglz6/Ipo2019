package Presentation;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import Persistence.DBManager;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import java.awt.CardLayout;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Font;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;

public class FrameMain {

	private JFrame frameMain;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					FrameMain window = new FrameMain();
					window.frameMain.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();	
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public FrameMain() throws ClassNotFoundException, SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ClassNotFoundException 
	 */
	@SuppressWarnings("serial")
	private void initialize() throws ClassNotFoundException {
		frameMain = new JFrame();
		frameMain.setResizable(false);
		frameMain.setBounds(100, 100, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()-100, (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()-100);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*The method setLocationRelativeTo(null) will center our window in the
		  middle of our screen*/
		frameMain.setLocationRelativeTo(null);
		
		//Takes the image icon from the Resources' local repository
		frameMain.setIconImage(Toolkit.getDefaultToolkit().getImage(FrameMain.class.getResource("/Resources/Images/icon_network.png")));
		frameMain.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frameMain.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setEnabled(false);
		panel.add(splitPane_1, BorderLayout.CENTER);
		
		JPanel panel_1 = new panelUser();
		splitPane_1.setLeftComponent(panel_1);
		
		JPanel panel_3 = new panelTools();
		splitPane_1.setRightComponent(panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		frameMain.getContentPane().add(panel_2, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{50, 0, 0, 50, 40, 50, 50, 0, 80, 0};
		gbl_panel_2.rowHeights = new int[]{30, 0, 0, 0, 0, 40, 20, 30, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Pedido actual:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);;
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(100,100));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 3;
		panel_2.add(scrollPane, gbc_scrollPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setViewportView(panel_4);
		panel_4.setLayout(new GridLayout(0, 7, 2, 2));
		
		JButton btnNewButton_1 = new JButton("Vaciar");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 7;
		gbc_btnNewButton_1.gridy = 4;
		panel_2.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel(panel_4.getComponentCount()+" productos");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 5;
		gbc_lblNewLabel_1.gridy = 5;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JButton btnNewButton = new JButton("FINALIZAR");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton.gridheight = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 7;
		gbc_btnNewButton.gridy = 5;
		panel_2.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Total:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 6;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("100 \u20AC");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 6;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		JSplitPane splitPane = new JSplitPane();
		frameMain.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		
		JPanel information_panel = new JPanel();
		splitPane.setRightComponent(information_panel);
		information_panel.setLayout(new CardLayout(0, 0));
		
		JPanel default_panel = new panelDefault();
		information_panel.add(default_panel, "Default");
		
		JPanel productos_panel = new panelProducts();
		information_panel.add(productos_panel, "Productos");
		
		JPanel clientes_panel = new panelClients();
		information_panel.add(clientes_panel, "Clientes");
		
		JPanel pedidos_panel = new panelOrders();
		information_panel.add(pedidos_panel, "Pedidos");
		
		JPanel ofertas_panel = new panelOffers();
		information_panel.add(ofertas_panel, "Ofertas");
		
		JTree selection_tree = new JTree();
		selection_tree.setRootVisible(false);
		selection_tree.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		selection_tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent arg0) {
				String nodo = (arg0.getPath().getLastPathComponent()).toString();
				switch (nodo)
				{
					case "Productos":
					case "Clientes":
					case "Pedidos":
					case "Ofertas":
						((CardLayout) information_panel.getLayout()).show(information_panel, nodo);
				}

			}
		});
		selection_tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		selection_tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Inicio") {
				{
					add(new DefaultMutableTreeNode("Ofertas"));
					add(new DefaultMutableTreeNode("Productos"));
					add(new DefaultMutableTreeNode("Clientes"));
					add(new DefaultMutableTreeNode("Pedidos"));
				}
			}
		));
		selection_tree.setFont(new Font("Sitka Subheading", Font.PLAIN, 33));
		splitPane.setLeftComponent(selection_tree);

		/*frameMain.addWindowListener(new java.awt.event.WindowAdapter() 
		{
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) 
		    {
		        if (JOptionPane.showConfirmDialog(frameMain, 
		            "Are you sure you want to exit?", "Close?", 
		            JOptionPane.OK_CANCEL_OPTION,
		            JOptionPane.CANCEL_OPTION) == JOptionPane.CANCEL_OPTION)
		        {
		        	try 
		        	{
		        		DBManager.getInstance();
						DBManager.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        	//Date mydate = new Date();
		        	//Application.getUser().setLast_access(new SimpleDateFormat("dd-MM-yyyy").format(mydate));
		        	//System.out.println(Application.getUser().getLast_access());
		        	
		            System.exit(0);
		        }
		    }
		});*/
		for(int i = 0; i < 50; i++)
		{
			panel_4.add(new ReusableCart());
		}
	}
	public Window getFrame() {
		// TODO Auto-generated method stub
		return frameMain;
	}

	@SuppressWarnings("unused")
	private void msgbox(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
}
