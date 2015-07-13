import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingTask extends JPanel {

	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.CYAN);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 20);
		g.setColor(Color.RED);
		g.drawString("Microsoft", 125, 40);
	}

}
