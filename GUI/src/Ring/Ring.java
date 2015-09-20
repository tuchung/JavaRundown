package Ring;
import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Ring extends JComponent
{

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double FirstRing = new Ellipse2D.Double(10,10,50,50);
		Ellipse2D.Double SecondRing = new Ellipse2D.Double(35,40,50,50);
		Ellipse2D.Double ThirdRing = new Ellipse2D.Double(60,10,50,50);
		Ellipse2D.Double FourthRing = new Ellipse2D.Double(85,40,50,50);
		Ellipse2D.Double FifthRing = new Ellipse2D.Double(110,10,50,50);
		g2.setStroke(new BasicStroke(4));
		g2.setColor(Color.BLUE);
		g2.draw(FirstRing);
		g2.setColor(Color.YELLOW);
		g2.draw(SecondRing);
		g2.setColor(Color.BLACK);
		g2.draw(ThirdRing);
		g2.setColor(Color.GREEN);
		g2.draw(FourthRing);
		g2.setColor(Color.RED);
		g2.draw(FifthRing);
	}

}



