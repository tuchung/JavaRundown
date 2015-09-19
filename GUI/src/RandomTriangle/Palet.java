package RandomTriangle;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;


public class Palet extends JPanel {
	Random rand = new Random();
	int count;
	public Palet(int count)
	{
		this.count = count;
	}

	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		int i = count;
		while(i > 0){
			int randompointA = rand.nextInt(251);
			int randompointB = rand.nextInt(251);
			int randompointC = rand.nextInt(251);
			int randompointD = rand.nextInt(251);
			int randompointE = rand.nextInt(251);
			
			int[] xcor = {randompointA, randompointB, randompointC};
			int[] ycor = {randompointD, randompointE, randompointD};
			float red = rand.nextFloat();
			float green = rand.nextFloat();
			float blue = rand.nextFloat();
			Color randomColor = new Color(red, green, blue);
			g.setColor(randomColor);
			g.fillPolygon(xcor, ycor, 3);
			i--;
		}
	}


}
