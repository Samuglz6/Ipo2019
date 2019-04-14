package Presentation;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;

@SuppressWarnings("serial")
public class panelDefault extends JPanel {

	/**
	 * Create the panel.
	 */
	public panelDefault() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(panelDefault.class.getResource("/Resources/Images/cooker_icon.jpeg")));
		label.setBackground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.CENTER);

	}

}
