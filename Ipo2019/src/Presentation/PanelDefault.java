package Presentation;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class PanelDefault extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelDefault() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PanelDefault.class.getResource("/Resources/Images/black-cat.png")));
		label.setBackground(SystemColor.scrollbar);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.CENTER);

	}

}
