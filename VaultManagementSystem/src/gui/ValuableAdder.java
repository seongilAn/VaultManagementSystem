package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ValuableAdder extends JFrame{
    public ValuableAdder() {
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

        JLabel labelPeriod = new JLabel("Name: ", JLabel.TRAILING);
        JTextField fieldPeriod = new JTextField(10);
        labelPeriod.setLabelFor(fieldPeriod);
        panel.add(labelPeriod);
        panel.add(fieldPeriod);

        panel.add(new JButton("Save"));
        panel.add(new JButton("Cancel"));

        SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.setVisible(true);
    }
}
