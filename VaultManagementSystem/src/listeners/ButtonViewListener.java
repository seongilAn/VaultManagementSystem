package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.ValuableViewer;
import gui.WindowFrame;
import manager.ValuableManager;

public class ButtonViewListener implements ActionListener{

    WindowFrame frame;

    public ButtonViewListener(WindowFrame frame){
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	ValuableViewer valuableViewer = frame.getValuableViewer();
    	ValuableManager valuableManager = getObject("ValuableManager.ser");  	
    	valuableViewer.setValuableManager(valuableManager);
    	frame.getContentPane().removeAll();
    	frame.getContentPane().add(valuableViewer);
    	frame.revalidate();
    	frame.repaint(); 
    }
    public static ValuableManager getObject(String fileName) {	
		ValuableManager valuableManager = null;

		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			valuableManager = (ValuableManager)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return valuableManager;
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return valuableManager;
		
		
	}
    
}