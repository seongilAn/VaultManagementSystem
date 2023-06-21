package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class ValuableAdderCancelListener implements ActionListener{

    WindowFrame frame;

    public ValuableAdderCancelListener(WindowFrame frame){
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	frame.getContentPane().removeAll();
    	frame.getContentPane().add(frame.getMenuSelection());
    	frame.revalidate();
    	frame.repaint();
    }	

}
