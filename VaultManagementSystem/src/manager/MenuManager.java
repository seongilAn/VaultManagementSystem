package manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager { 
	static EventLogger logger = new EventLogger("log.txt");
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ValuableManager valuableManager = getObject("ValuableManager.ser"); 
		if(valuableManager == null) {
			valuableManager = new ValuableManager(input);
		}
		selectMenu(input, valuableManager);
		putObject(valuableManager, "ValuableManager.ser");
	}
	public static void selectMenu(Scanner input, ValuableManager valuableManager ) {
		int num=-1;
		while (num != 5) { //Repeatedly print menu
			try {
				showMenu();
				num = input.nextInt();
				//Take number from user
		
				switch(num) {
					case 1: 
						valuableManager.addValuable();
						logger.log("add a Valuable");
						break;
					case 2:
						valuableManager.deleteValuable();
						logger.log("delete a Valuable");
						break;
					case 3:
						valuableManager.editValuable();
						logger.log("edit a Valuable");
						break;
					case 4:
						valuableManager.viewValuables();
						logger.log("view the list of Valuables");
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
	
	
	public static ValuableManager getObject(String fileName) {
		ValuableManager valuableManager = null;

		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			valuableManager = (ValuableManager)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return valuableManager;
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return valuableManager;
		
		
	}
	public static void putObject(ValuableManager valuableManager, String fileName) {
	
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(valuableManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	
		
		
	}
	
}