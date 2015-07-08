import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.*;


public class BankAccountFrame extends JFrame {
	private static final int FRAME_WIDTH = 450;
	private static final int FRAME_HEIGHT = 450;
	
	private static double Balance = 1000;
	
	private JButton Deposit, Withdraw;
	private JLabel BalanceLabel;
	private JTextField DepositField, WithdrawField;
	private JPanel Panel;
	private String StringBalance;
	
	private NumberFormat USFormat;
	
	public BankAccountFrame(){
		USFormat = NumberFormat.getCurrencyInstance();
		StringBalance = USFormat.format(Balance);
		BalanceLabel = new JLabel("Balance: " + StringBalance);	
		
		CreateTextField();
		CreateButton();
		CreatePanel();
		
		pack();
		
	}
	
	private void CreateTextField(){
		DepositField = new JTextField("Type the Deposit Amount", 15);
		WithdrawField = new JTextField("Type the Withdraw Amount", 15);
		
	}
	
	private void CreateButton()
	{
		Deposit = new JButton("Deposit");
		Withdraw = new JButton("Withdraw");
		
		class DepositAction implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				double DepositAmount = Double.parseDouble(DepositField.getText());
				Balance = Balance + DepositAmount;
				StringBalance = USFormat.format(Balance);
				BalanceLabel.setText("Balance: " + StringBalance);
			}
			
		}
		
		class WithdrawAction implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				double WithdrawAmount = Double.parseDouble(WithdrawField.getText());
				double excessBalance  = Balance;
				Balance = Balance - WithdrawAmount;
				if(Balance <= 0)
				{
					Balance = 0;
					StringBalance = USFormat.format(excessBalance);
					JOptionPane.showMessageDialog(BankAccountFrame.this, "You do not have enough money to Withdraw the Full Amount!" + "\n" +
					"You Withdrawed: " + StringBalance);
				}
				StringBalance = USFormat.format(Balance);
				BalanceLabel.setText("Balance: " + StringBalance);
			}
			
		}
		
		Deposit.addActionListener(new DepositAction());
		Withdraw.addActionListener(new WithdrawAction());
		
	}
	
	private void CreatePanel()
	{
		Panel = new JPanel();
	Panel.add(BalanceLabel);
	Panel.add(DepositField);
	Panel.add(Deposit);
	Panel.add(WithdrawField);
	Panel.add(Withdraw);
	add(Panel);
	}

}
