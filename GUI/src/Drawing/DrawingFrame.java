package Drawing;

import javax.swing.*;
public class DrawingFrame extends JFrame
{
	public DrawingFrame()
	{
		DrawingTask Rectangle = new DrawingTask();
		add(Rectangle);
		setSize(300, 400);
	}
}
