package Presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;

@SuppressWarnings("serial")
public class FrameEditProducts extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FrameEditProducts() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 415, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		/*The method setLocationRelativeTo(null) will center our window in the
		  middle of our screen*/
		setLocationRelativeTo(null);
	}

}
