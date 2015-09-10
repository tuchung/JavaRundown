import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;


public class Palet extends JPanel {
	Random rand = new Random();
	private int count = 0;

	
	public Palet(int count)
	{
		this.setCount(count);
	}
	
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		while(count > 0)
		{
			int randompointA = rand.nextInt(1001);
			int randompointB = rand.nextInt(1001);
			int randompointC = rand.nextInt(1001);
			float red = rand.nextFloat();
			float green = rand.nextFloat();
			float blue = rand.nextFloat();
			Color randomColor = new Color(red, green, blue);
			g.setColor(randomColor);
			g.fillPolygon(randompointA, randompointB, randompointC);
			
		}
		
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


}
