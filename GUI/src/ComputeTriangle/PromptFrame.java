package ComputeTriangle;

import javax.swing.*;

public class PromptFrame extends JFrame
{
	JLabel Intro, FirstPoint, SecondPoint, ThirdPoint;
	JTextField X1Field, X2Field, X3Field, Y1Field, Y2Field, Y3Field;
	JButton CreateButton;
	public PromptFrame()
	{
		CreateButton();
		CreateLabel();
		CreateTextfield();
	}
	
	private void CreateTextfield()
	{
		
		
	}
	
	private void CreateLabel() 
	{
		Intro.setText("Please insert the three point coordinate for your new Triangle.");
		FirstPoint.setText("First Point: ");
		SecondPoint.setText("Second Point: ");
		ThirdPoint.setText("Third Point: ");
		
	}
	
	private void CreateButton()
	{
		
		
	}
}
