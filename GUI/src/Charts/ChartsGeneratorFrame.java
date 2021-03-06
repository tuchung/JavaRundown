package Charts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//notes: coordinate within each bar(30, 40) 
//coordinate after a bar(30+barlength, 40)
@SuppressWarnings("serial")
public class ChartsGeneratorFrame extends JFrame {
	private JLabel Image;
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	public ChartsGeneratorFrame() {
		JMenuBar MenuBar = new JMenuBar();
		setJMenuBar(MenuBar);
		MenuBar.add(createFileMenu());
		MenuBar.add(createAddItemMenu());
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public JMenu createFileMenu()
	{
		JMenu menu = new JMenu("File");
		JMenuItem Exit = new JMenuItem("Exit");
		Exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		menu.add(Exit);
		return menu;
		
	}
	
	public JMenu createAddItemMenu()
	{
		JMenu ItemMenu = new JMenu("Add Item");
		
		//Will add functionality later*********************************
		JMenuItem NewItem = new JMenuItem("New");
		JMenu EditItem = new JMenu("Edit");
		JMenu RemoveItem = new JMenu("Remove");
		
		class NewItemFunction implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				NewItemFrame SubFrame = new NewItemFrame();
				SubFrame.dispose();
				dispose();
				SubFrame.setVisible(true);
				
			}
			
		}
		NewItem.addActionListener(new NewItemFunction());
		
		ItemMenu.add(NewItem);
		ItemMenu.add(EditItem);
		ItemMenu.add(RemoveItem);
		
		
		return ItemMenu;
	}

}
