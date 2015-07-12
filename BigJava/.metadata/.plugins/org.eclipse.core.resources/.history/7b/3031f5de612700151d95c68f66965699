import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class NewItemFrame extends JFrame {
	private JLabel ItemName, ItemLength, ItemColor;
	private JButton AddItemButton, CancelButton;
	private JTextField NameField, LengthField;
	private JPanel Panel;
	private JComboBox<String> ColorBox;
	
	public NewItemFrame()
	{
		setTitle("New Item");
		CreateLabel();
		CreateButton();
		CreateTextField();
		CreateComboBox();
		CreatePanel();
		
		pack();
	}
	
	public void CreateComboBox() {
		ColorBox = new JComboBox<String>();
		ColorBox.addItem("Red");
		ColorBox.addItem("Blue");
		ColorBox.addItem("Yellow");
		ColorBox.addItem("Cyan");
		ColorBox.addItem("Green");
		ColorBox.addItem("Pink");
		ColorBox.addItem("Orange");
		ColorBox.addItem("Margenta");
		
	}

	public void CreateLabel()
	{
		ItemName = new JLabel("Name: ");
		ItemLength = new JLabel("Values/Length :");
		ItemColor = new JLabel("Color: ");
		
	}
	
	public void CreateButton()
	{
		AddItemButton = new JButton("Add Item");
		CancelButton = new JButton("Cancel");
		
		class CancelFunction implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
			
		}
		CancelButton.addActionListener(new CancelFunction());
		
	}
	
	
	
	public void CreateTextField()
	{
		NameField = new JTextField(10);
		LengthField = new JTextField(10);
	}
	
	public void CreatePanel()
	{
		Panel = new JPanel();
		Panel.setLayout(new BorderLayout());
		JPanel MainPanel = new JPanel();
		JPanel ButtonPanel = new JPanel();
		
		ButtonPanel.add(AddItemButton);
		ButtonPanel.add(CancelButton);
		
		MainPanel.setLayout(new GridLayout(3,2));
		MainPanel.add(ItemName);
		MainPanel.add(NameField);
		MainPanel.add(ItemLength);
		MainPanel.add(LengthField);
		MainPanel.add(ItemColor);
		MainPanel.add(ColorBox);
		
		Panel.add(MainPanel, BorderLayout.CENTER);
		Panel.add(ButtonPanel, BorderLayout.SOUTH);
		
		add(Panel);
		
	}

}
