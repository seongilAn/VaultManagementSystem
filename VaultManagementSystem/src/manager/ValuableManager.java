package manager;

import java.util.Scanner; 

import valuable.Money;
import valuable.Valuable;
import valuable.Gold;
import valuable.Document;
import valuable.Jewerly;
import valuable.ValuableKind;
import valuable.ValuableInput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ValuableManager implements Serializable{

	
	private static final long serialVersionUID = -5789911926628135201L;
	ArrayList<ValuableInput> valuables = new ArrayList<ValuableInput>(); 
    transient Scanner input;
    ValuableManager(Scanner input){
        this.input = input;

    }
    public void setScanner(Scanner input) {
    	this.input = input;
    }

	public void addValuable() {
        int kind =	 0;
        ValuableInput valuableInput;
        while (kind<1 || kind>4){
        	try {
            System.out.println("1 for Money");
            System.out.println("2 for Document");
            System.out.println("3 for Jewerly");
            System.out.println("4 for Gold");
            System.out.print("Select num for Valuable Kind between 1 and 4: ");
            kind = input.nextInt();
            if(kind == 1) {
                valuableInput = new Money(ValuableKind.MONEY);
                valuableInput.getUserInput(input);
                valuables.add(valuableInput);
                break;
            }
            else if(kind == 2) {
                valuableInput = new Document(ValuableKind.DOCUMENT);
                valuableInput.getUserInput(input);
                valuables.add(valuableInput);
                break;
            }
            else if(kind == 3) {
                valuableInput = new Jewerly(ValuableKind.JEWERLY);
                valuableInput.getUserInput(input);
                valuables.add(valuableInput);
                break;
            }
            else if(kind == 4) {
                valuableInput = new Gold(ValuableKind.GOLD);
                valuableInput.getUserInput(input);
                valuables.add(valuableInput);
                break;
            }
            else {
                System.out.print("Select num for Valuable Kind between 1 and 4: ");
            }
        	} catch(InputMismatchException e) {
				System.out.println("Please put and integer between 1~4 !");
				if(input.hasNext()) {
					input.next();
				}
				kind =0;
			}
        }
	} //Take data about valuable name, type and how long will be kept
	
	public void deleteValuable(){
        System.out.print("Valuable Id: ");
        int valuableid = input.nextInt();
        int index = findIndex(valuableid);
        removeFromValuables(index, valuableid);
	}

    public int findIndex(int valuableid){
        int index = -1;
        for(int i = 0; i < valuables.size(); i++){
            if(valuables.get(i).getId() == valuableid){
                index = i;
                break;
            }
        }
        return index;
    }

    public void removeFromValuables(int index, int valuableid){
        if(index >= 0){
            valuables.remove(index);
            System.out.println("The valuable" + valuableid + "is deleted");
        }
        else{
            System.out.println("Valuable has not been registered");
            return;
        }
    }
	
	public void editValuable() {
        System.out.print("Valuable Id: ");
        int valuableid = input.nextInt();
        for(int i = 0; i < valuables.size(); i++){
            ValuableInput valuable = valuables.get(i);
            if(valuable.getId() == valuableid){
                int num = 0;
                while (num != 5) { //Repeatedly print menu
                    showEditMenu();
                    num = input.nextInt();
                    switch(num){
                        case 1:
                            valuable.setValuableName(input);
                            break;
                        case 2:
                            valuable.setValuableId(input);
                            break;
                        case 3:
                            valuable.setValuableCount(input);
                            break;
                        case 4:
                            valuable.setValuablePeriod(input);
                            break;
                        case 5:
                            continue;
                    } // switch
                } // while
                break;
            } // if
        } // for

    }	


	
	public void viewValuables() {
        System.out.println("# of saved valuables: " + valuables.size());
        for(int i = 0; i < valuables.size(); i++){
            valuables.get(i).printinfo();
        }
	}

    public void showEditMenu(){
        System.out.println("****Valuable Editing menu****");
        System.out.println("1. Edit Name");
        System.out.println("2. Edit Id");
        System.out.println("3. Edit Count");
        System.out.println("4. Edit Period");
        System.out.println("5. Exit");
        System.out.println("Select one number between 1-6: ");
    }
    
    public int size() {
    	return valuables.size();
    }
    public ValuableInput get(int index) {
    	return (Valuable) valuables.get(index);
    }
   
    
} 


	