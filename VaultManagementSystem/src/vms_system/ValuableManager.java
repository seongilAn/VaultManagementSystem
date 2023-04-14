package vms_system;

import java.util.Scanner;
import java.util.ArrayList;

public class ValuableManager{
    ArrayList<Valuable> valuables = new ArrayList<Valuable>(); 
    Scanner input;
    ValuableManager(Scanner input){
        this.input = input;

    }

	public void addValuable() {
        Valuable valuable = new Valuable();
        System.out.print("Id: ");
        valuable.id = input.nextInt();
		System.out.print("Valuables name: ");
		valuable.name = input.next();
		System.out.print("Valuables type: ");
		valuable.type = input.next();
        System.out.print("Count of valuables: ");
        valuable.count = input.nextInt();
		System.out.print("Storage period: ");
		valuable.period = input.nextInt();
        valuables.add(valuable);
	} //Take data about valuable name, type and how long will be kept
	
	public void deleteValuable(){
        System.out.print("Valuable Id: ");
        int valuableid = input.nextInt();
        int index = -1;
        for(int i = 0; i < valuables.size(); i++){
            if(valuables.get(i).id == valuableid){
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
            if(valuable.id == valuableid){
                int num = 0;
                while (num != 6) { //Repeatedly print menu
                    System.out.println("****Valuable Editing menu****");
                    System.out.println("1. Edit Name");
                    System.out.println("2. Edit Type");
                    System.out.println("3. Edit Id");
                    System.out.println("4. Edit Count");
                    System.out.println("5. Edit Period");
                    System.out.println("6. Exit");

                    System.out.println("Select one number between 1-6: ");
                    num = input.nextInt();
                    switch(num){
                        case 1:
                            System.out.print("Valuable Name: ");
                            valuable.name = input.next();
                            break;
                        case 2:
                            System.out.print("Valuable Type: ");
                            valuable.name = input.next();
                            break;
                        case 3:
                            System.out.print("Valuable Id: ");
                            valuable.id = input.nextInt();
                            break;
                        case 4:
                            System.out.print("Valuable Count: ");
                            valuable.count = input.nextInt();
                            break;
                        case 5:
                            System.out.print("Valuable Period");
                            valuable.period = input.nextInt();
                            break;
                        case 6:
                            continue;
                    } // switch
                } // while
                break;
            } // if
        } // for

    }	
	
	public void viewValuables() {
        for(int i = 0; i < valuables.size(); i++){
            valuables.get(i).printinfo();
        }
	}
}