package Presentation;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

@SuppressWarnings("serial")
public class panelProductos extends JPanel {

	/**
	 * Create the panel.
	 */
	public panelProductos() {
		
		JSplitPane splitPane = new JSplitPane();
		add(splitPane);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		
		JPanel panel_1 = new JPanel();
		splitPane.setLeftComponent(panel_1);

	}

}
