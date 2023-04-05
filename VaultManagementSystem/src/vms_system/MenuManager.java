package vms_system;

import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while (num != 6) { //Repeatedly print menu
			System.out.println("1. Add valuables");
			System.out.println("2. Delete valuables");
			System.out.println("3. Edit valuables");
			System.out.println("4. View valuables");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			//Printing Menu about management system

			System.out.println("Select one number between 1-6: ");
			num = input.nextInt();
			//Take number from user

			switch(num) {
			case 1: 
				addValuable();
			case 2:
				deleteValuable();
			case 3:
				editValuable();
			case 4:
				viewValuable();
			case 5:
				continue;
			}
		}
		System.out.println(3);
	}
	
	public static void addValuable() {
		Scanner input = new Scanner(System.in);
		System.out.print("Valuables name: ");
		String valuablesName = input.next();
		System.out.print("Valuables type: ");
		String valuablesType = input.next();
		System.out.print("Storage period: ");
		int valuablesPeriod = input.nextInt();
	} //Take data about valuable name, type and how long will be kept
	
	public static void deleteValuable(){
		Scanner input = new Scanner(System.in);
	}
	
	public static void editValuable() {
		Scanner input = new Scanner(System.in);
	}
	
	public static void viewValuable() {
		Scanner input = new Scanner(System.in);
	}
	
}
