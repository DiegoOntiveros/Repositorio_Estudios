package IDSTV;

import java.awt.Dimension;

import javax.swing.JFrame;

public class window extends JFrame {

	public window() {
		
		
this.setVisible(true);
		
		this.setTitle("negros");
		this.setSize(500, 500);
		
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	 this.setResizable(true);
	 this.setMaximumSize(new Dimension (800,800));
	 this.setMinimumSize(new Dimension(800,800));
		 this.setLocationRelativeTo(null);

	}

}
