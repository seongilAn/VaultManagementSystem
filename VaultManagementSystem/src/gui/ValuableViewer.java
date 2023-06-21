package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.ValuableManager;
import valuable.ValuableInput;

public class ValuableViewer extends JPanel{

    WindowFrame frame;
    
    ValuableManager valuableManager;
   
    public ValuableManager getValuableManager() {
		return valuableManager;
	}
	
    public void setValuableManager(ValuableManager valuableManager) {
		this.valuableManager = valuableManager;
		this.removeAll();
		DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Count");
        model.addColumn("Period");
        
        for(int i = 0 ; i < valuableManager.size(); i++) {
        	Vector row = new Vector(); 
        	ValuableInput si = valuableManager.get(i);
        	row.add(si.getId());
        	row.add(si.getName());
        	row.add(si.getCount());
        	row.add(si.getPeriod());
        	
        	model.addRow(row);
        }
        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        this.add(sp);
	}
	public ValuableViewer(WindowFrame frame,ValuableManager valuableManager) {
        
        this.frame = frame;
        this.valuableManager = valuableManager;
       
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Count");
        model.addColumn("Period");
        
        for(int i = 0 ; i < valuableManager.size(); i++) {
        	Vector row = new Vector(); 
        	ValuableInput si = valuableManager.get(i);
        	row.add(si.getId());
        	row.add(si.getName());
        	row.add(si.getCount());
        	row.add(si.getPeriod());
        	
        	model.addRow(row);
        }
        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        this.add(sp);
        
    }
}