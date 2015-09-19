package Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingTask extends JPanel {

	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 20);
		g.setColor(Color.RED);
		g.drawString("Microsoft", 30, 40);
		g.setColor(Color.GREEN);
		g.fillRect(25, 55, 200, 20);
		g.setColor(Color.BLACK);
		g.drawString("Sony", 30, 70);
	}

}
