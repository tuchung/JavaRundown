package Calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class CalculatorFrame extends JFrame {
	
	//initialize
	private String ResultString = "";
	private int FirstOperationNum = 0;
	private int SecondOperationNum = 0;
	private boolean PlusCounter = false;
	private boolean MinusCounter = false;
	private boolean MultiplyCounter = false;
	private boolean DivideCounter = false;
	
	private JTextField ResultField;
	private JButton One, Two, Three, Four, Five, Six, Seven, 
	Eight, Nine, Zero, Plus, Minus, Multiply, Divide, CEButton, Equal;
	private JPanel Panel;
	private JPanel ButtonPanel;
	
	// create the Constructor
	public CalculatorFrame()
	{
		CreateTextfield();
		CreateButton();
		DrawPanel();
		pack();
	}
	
	//Create the textfield component
	public void CreateTextfield()
	{
		ResultField = new JTextField("0", 20);
		ResultField.setEditable(false);
	}
	
	//Create the Button Components and it action listener
	public void CreateButton()
	{
		One = new JButton("1");
		Two = new JButton("2");
		Three = new JButton("3");
		Four = new JButton("4");
		Five = new JButton("5");
		Six = new JButton("6");
		Seven = new JButton("7");
		Eight = new JButton("8");
		Nine = new JButton("9");
		Zero = new JButton("0");
		Plus = new JButton("+");
		Minus = new JButton("-");
		Multiply = new JButton("*");
		Divide = new JButton("/");
		CEButton = new JButton("CE");
		Equal = new JButton("=");
		
		//Create new ActionListener for all buttons function with each case
		class buttonFunction implements ActionListener
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int action = Integer.parseInt(e.getActionCommand());
				switch (action) 
				{
				case 1:
					ResultString = ResultString + "1";
					ResultField.setText(ResultString);
					break;
				case 2:
					ResultString = ResultString + "2";
					ResultField.setText(ResultString);
					break;
				case 3:
					ResultString = ResultString + "3";
					ResultField.setText(ResultString);
					break;
				case 4:
					ResultString = ResultString + "4";
					ResultField.setText(ResultString);
					break;
				case 5:
					ResultString = ResultString + "5";
					ResultField.setText(ResultString);
					break;
				case 6:
					ResultString = ResultString + "6";
					ResultField.setText(ResultString);
					break;
				case 7:
					ResultString = ResultString + "7";
					ResultField.setText(ResultString);
					break;
				case 8:
					ResultString = ResultString + "8";
					ResultField.setText(ResultString);
					break;
				case 9:
					ResultString = ResultString + "9";
					ResultField.setText(ResultString);
					break;
				case 0:
					ResultString = ResultString + "0";
					ResultField.setText(ResultString);
					break;
				case 10:
					FirstOperationNum = Integer.parseInt(ResultString);
					ResultString = "";
					ResultField.setText(ResultString);
					PlusCounter = true;
					break;
				case 11:
					FirstOperationNum = Integer.parseInt(ResultString);
					ResultString = "";
					ResultField.setText(ResultString);
					MinusCounter = true;
					break;
				case 12:
					FirstOperationNum = Integer.parseInt(ResultString);
					ResultString = "";
					ResultField.setText(ResultString);
					MultiplyCounter = true;
					break;
				case 13:
					FirstOperationNum = Integer.parseInt(ResultString);
					ResultString = "";
					ResultField.setText(ResultString);
					DivideCounter = true;
					break;
				case 14:
					resetCounter();
					ResultField.setText("0");
					break;
				case 15:
					if(PlusCounter)
					{
						SecondOperationNum = Integer.parseInt(ResultString);
						ResultString = PlusFunction(FirstOperationNum, SecondOperationNum);
						ResultField.setText(ResultString);
						resetCounter();
					}
					if(MinusCounter)
					{
						SecondOperationNum = Integer.parseInt(ResultString);
						ResultString = MinusFunction(FirstOperationNum, SecondOperationNum);
						ResultField.setText(ResultString);
						resetCounter();
					}
					if(MultiplyCounter)
					{
						SecondOperationNum = Integer.parseInt(ResultString);
						ResultString = MulitplyFunction(FirstOperationNum, SecondOperationNum);
						ResultField.setText(ResultString);
						resetCounter();
					}
					if(DivideCounter)
					{
						SecondOperationNum = Integer.parseInt(ResultString);
						ResultString = DivideFunction(FirstOperationNum, SecondOperationNum);
						ResultField.setText(ResultString);
						resetCounter();
					}
					break;
				default:
					break;
				}
				
			}
			
		}
		
		//set actionlistener for each button
		buttonFunction Function = new buttonFunction();
		One.addActionListener(Function);
		Two.addActionListener(Function);
		Three.addActionListener(Function);
		Four.addActionListener(Function);
		Five.addActionListener(Function);
		Six.addActionListener(Function);
		Seven.addActionListener(Function);
		Eight.addActionListener(Function);
		Nine.addActionListener(Function);
		Zero.addActionListener(Function);
		Plus.addActionListener(Function);
		Minus.addActionListener(Function);
		Multiply.addActionListener(Function);
		Divide.addActionListener(Function);
		CEButton.addActionListener(Function);
		Equal.addActionListener(Function);
		
		//set specific case number for each function
		One.setActionCommand("1");
		Two.setActionCommand("2");
		Three.setActionCommand("3");
		Four.setActionCommand("4");
		Five.setActionCommand("5");
		Six.setActionCommand("6");
		Seven.setActionCommand("7");
		Eight.setActionCommand("8");
		Nine.setActionCommand("9");
		Zero.setActionCommand("0");
		Plus.setActionCommand("10");
		Minus.setActionCommand("11");
		Multiply.setActionCommand("12");
		Divide.setActionCommand("13");
		CEButton.setActionCommand("14");
		Equal.setActionCommand("15");
		
	}
	
	//basic operation method
	public String MulitplyFunction(int firstOperationNum2,
			int secondOperationNum2) {
		String total = firstOperationNum2 * secondOperationNum2 + "";
		return total;
	}

	public String DivideFunction(int firstOperationNum2, int secondOperationNum2) {
		String total = firstOperationNum2 / secondOperationNum2 + "";
		return total;
	}

	public String MinusFunction(int firstOperationNum2, int secondOperationNum2) {
		String total = firstOperationNum2 - secondOperationNum2 + "";
		return total;
	}

	public String PlusFunction(int firstOperationNum2, int secondOperationNum2) {
		String total = firstOperationNum2 + secondOperationNum2 + "";
		return total;
		
	}
	
	//refresh the result and counter
	public void resetCounter() {
		PlusCounter = false;
		MinusCounter = false;
		MultiplyCounter = false;
		DivideCounter = false;
		ResultString = "";
		
	}

	

	public void DrawPanel()
	{
		//Customize the overall panel
		Panel = new JPanel();
		Panel.setLayout(new BorderLayout());
		
		ButtonPanel = new JPanel();
		ButtonPanel.setLayout(new GridLayout(4,4));
		//First Row
		ButtonPanel.add(Seven);
		ButtonPanel.add(Eight);
		ButtonPanel.add(Nine);
		ButtonPanel.add(Plus);
		//Second
		ButtonPanel.add(Four);
		ButtonPanel.add(Five);
		ButtonPanel.add(Six);
		ButtonPanel.add(Minus);
		//Third
		ButtonPanel.add(One);
		ButtonPanel.add(Two);
		ButtonPanel.add(Three);
		ButtonPanel.add(Multiply);
		//Fourth
		ButtonPanel.add(Zero);
		ButtonPanel.add(CEButton);
		ButtonPanel.add(Equal);
		ButtonPanel.add(Divide);
		
		//Wrap up the overall panel
		Panel.add(ResultField, BorderLayout.NORTH);
		Panel.add(ButtonPanel, BorderLayout.CENTER);
		
		add(Panel);
	}
	
	

}
