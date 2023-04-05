package vms_system;

import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add items");
			System.out.println("2. Delete items");
			System.out.println("3. Edit items");
			System.out.println("4. View items");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			//Printing Menu about management system
			
			System.out.println("Select one number between 1-6: ");
			num = input.nextInt();
			//Take number from user
			
			switch(num) {
			case 1: 
				System.out.print("Item name:");
				String itemName = input.next();
			case 2:
				
			case 3:
				
			case 4:
				
			case 5:
				continue;
			}
		}
		System.out.println(3);
	}
}
