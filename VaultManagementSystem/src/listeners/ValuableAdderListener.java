package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.CountFormatException;
import manager.ValuableManager;
import valuable.Money;
import valuable.ValuableInput;
import valuable.ValuableKind;

public class ValuableAdderListener implements ActionListener {
	
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldCount;
	JTextField fieldPeriod;
	ValuableManager valuableManager; 
	public ValuableAdderListener(JTextField fieldID, JTextField fieldName, JTextField fieldCount,
			JTextField fieldPeriod, ValuableManager valuableManager) {
		
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldCount = fieldCount;
		this.fieldPeriod = fieldPeriod;
		this.valuableManager = valuableManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ValuableInput valuable = new Money(ValuableKind.MONEY);
		try {
			valuable.setId(Integer.parseInt(fieldID.getText()));
			valuable.setName(fieldName.getText());
			valuable.setCount(Integer.parseInt(fieldCount.getText()));
			valuable.setPeriod(Integer.parseInt(fieldPeriod.getText()));
			valuableManager.addValuable(valuable);	
			putObject(valuableManager, "ValuableManager.ser");
			valuable.printinfo();		
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch(CountFormatException e1) {
			e1.printStackTrace();
		}
		
	}
	public static void putObject(ValuableManager valuableManager, String fileName) {
		
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(valuableManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	
		
		
	}

} 
 