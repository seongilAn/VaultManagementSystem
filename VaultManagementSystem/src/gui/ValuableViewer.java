package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ValuableViewer extends JPanel{

    WindowFrame frame;

    public ValuableViewer(WindowFrame frame) {
        
        this.frame = frame;

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Count");
        model.addColumn("Period");

        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        this.add(sp);
    }
}
