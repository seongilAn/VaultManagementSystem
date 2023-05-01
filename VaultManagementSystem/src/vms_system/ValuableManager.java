package vms_system;

import java.util.Scanner;

import valuable.Document;

import valuable.Valuable;

import java.util.ArrayList;

public class ValuableManager{
    ArrayList<Valuable> valuables = new ArrayList<Valuable>(); 
    Scanner input;
    ValuableManager(Scanner input){
        this.input = input;

    }

	public void addValuable() {
        int kind = 0;
        Valuable valuable;
        while (kind != 1 && kind != 2){
            System.out.println("1 for Money");
            System.out.println("2 for Document");
            System.out.print("Select num for Valuable Kind between 1 and 2: ");
            kind = input.nextInt();
            if(kind == 1) {
                valuable = new Valuable();
                valuable.getUserInput(input);
                valuables.add(valuable);
                break;
            }
            else if(kind == 2) {
                valuable = new Document();
                valuable.getUserInput(input);
                valuables.add(valuable);
                break;
            }
            else {
                System.out.print("Select num for Valuable Kind between 1 and 2: ");
            }
        }
	} //Take data about valuable name, type and how long will be kept
	
	public void deleteValuable(){
        System.out.print("Valuable Id: ");
        int valuableid = input.nextInt();
        int index = -1;
        for(int i = 0; i < valuables.size(); i++){
            if(valuables.get(i).getId() == valuableid){
                index = i;
                break;
            }
        }

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
            Valuable valuable = valuables.get(i);
            if(valuable.getId() == valuableid){
                int num = 0;
                while (num != 5) { //Repeatedly print menu
                    System.out.println("****Valuable Editing menu****");
                    System.out.println("1. Edit Name");
                    System.out.println("2. Edit Id");
                    System.out.println("3. Edit Count");
                    System.out.println("4. Edit Period");
                    System.out.println("5. Exit");

                    System.out.println("Select one number between 1-6: ");
                    num = input.nextInt();
                    switch(num){
                        case 1:
                            System.out.print("Valuable Name: ");
                            String name = input.next();
                            valuable.setName(name);
                            break;
                        case 2:
                            System.out.print("Valuable Id: ");
                            int id = input.nextInt();
                            valuable.setId(id);
                            break;
                        case 3:
                            System.out.print("Valuable Count: ");
                            int count = input.nextInt();
                            valuable.setCount(count);
                            break;
                        case 4:
                            System.out.print("Valuable Period");
                            int period = input.nextInt();
                            valuable.setPeriod(period);
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
}