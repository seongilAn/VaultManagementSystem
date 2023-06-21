package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.ValuableAdderCancelListener;
import listeners.ValuableAdderListener;
import manager.ValuableManager;

public class ValuableAdder extends JPanel{

    WindowFrame frame;  
    ValuableManager valuableManager;

    public ValuableAdder(WindowFrame frame , ValuableManager valuableManager) {
        
        this.frame = frame;
        this.valuableManager = valuableManager;

        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());
        
        JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
        JTextField fieldID = new JTextField(10);
        labelID.setLabelFor(fieldID);
        panel.add(labelID);
        panel.add(fieldID);

        JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
        JTextField fieldName = new JTextField(10);
        labelName.setLabelFor(fieldName);
        
       
        panel.add(labelName);
        panel.add(fieldName);

        JLabel labelCount = new JLabel("Count: ", JLabel.TRAILING);
        JTextField fieldCount = new JTextField(10);
        labelCount.setLabelFor(fieldCount);
        panel.add(labelCount);
        panel.add(fieldCount);

        JLabel labelPeriod = new JLabel("Period: ", JLabel.TRAILING);
        JTextField fieldPeriod = new JTextField(10);
        labelPeriod.setLabelFor(fieldPeriod);
        panel.add(labelPeriod);
        panel.add(fieldPeriod); 
       
        JButton saveButton = new JButton("save");
        saveButton.addActionListener(new ValuableAdderListener(fieldID,fieldName,fieldCount,fieldPeriod,valuableManager));
        
        JButton cancelButton = new JButton("cancel");
        cancelButton.addActionListener(new ValuableAdderCancelListener(frame));
        panel.add(saveButton);
        panel.add(cancelButton);

        SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

        this.add(panel);
    }
}