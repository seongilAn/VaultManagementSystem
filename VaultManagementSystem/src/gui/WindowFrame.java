package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.ValuableManager;

public class WindowFrame extends JFrame {
	
	ValuableManager valuableManager;
	MenuSelection menuSelection;
    ValuableAdder valuableAdder;
    ValuableViewer valuableViewer;
 
    public WindowFrame(ValuableManager valuableManager) {
        this.menuSelection = new MenuSelection(this);
        this.valuableManager = valuableManager;
        this.valuableAdder = new ValuableAdder(this, this.valuableManager );
        this.valuableViewer = new ValuableViewer(this, this.valuableManager) ;
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setupPanel(menuSelection);

        this.setVisible(true);
    }

    public void setupPanel(JPanel panel) {
        this.getContentPane().removeAll();
        this.getContentPane().add(panel);
        this.revalidate();
        this.repaint();
    }

    public MenuSelection getMenuSelection() {
        return this.menuSelection;
    }

    public void setMenuSelection(MenuSelection menuSelection) {
        this.menuSelection = menuSelection;
    }

    public ValuableAdder getValuableAdder() {
        return this.valuableAdder;
    }

    public void setValuableAdder(ValuableAdder valuableAdder) {
        this.valuableAdder = valuableAdder;
    }

    public ValuableViewer getValuableViewer() {
        return this.valuableViewer;
    }

    public void setValuableViewer(ValuableViewer valuableViewer) {
        this.valuableViewer = valuableViewer;
    }
}