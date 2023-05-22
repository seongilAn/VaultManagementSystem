package manager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ValuableManager valuableManager = new ValuableManager(input);
		selectMenu(valuableManager, input);
	}

	public static void selectMenu(ValuableManager valuableManager, Scanner input){
		int num = 0;
		while (num != 5) { //Repeatedly print menu
			try{
				showMenu();
				num = input.nextInt();
				//Take number from user

				switch(num) {
					case 1: 
						valuableManager.addValuable();
						break;
					case 2:
						valuableManager.deleteValuable();
						break;
					case 3:
						valuableManager.editValuable();
						break;
					case 4:
						valuableManager.viewValuables();
						break;
					case 5:
						continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put and integer between 1~5 !");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;
			}
		}
	}

	public static void showMenu(){
		System.out.println("****Valuable Management System menu****");
		System.out.println("1. Add valuable");
		System.out.println("2. Delete valuable");
		System.out.println("3. Edit valuable");
		System.out.println("4. View valuables");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-5: ");
		//Printing Menu about management system
	}
	
}
