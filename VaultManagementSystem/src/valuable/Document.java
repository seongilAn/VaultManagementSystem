package valuable;

import java.util.Scanner;

public class Document extends Valuable{

    protected String documentType;

    public String getDocumentType(){
        return this.documentType;
    }

    public void setDocumentType(String documentType){
        this.documentType = documentType;
    }

    public void getUserInput(Scanner input){
        System.out.print("Id: ");
        int id = input.nextInt();
        this.setId(id);

		System.out.print("Valuables name: ");
		String name = input.next();
        this.setName(name);

        System.out.print("Valuable Type: ");
        String documentType = input.next();
        this.setDocumentType(documentType);

        char answer = 'x';
        while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N'){
            System.out.print("Do you have a storage period? (Y/N)");
            answer = input.next().charAt(0);
            if(answer == 'y' || answer == 'Y'){
                System.out.print("Storage period: ");
                int period = input.nextInt();
                this.setPeriod(period);
            }
            else if(answer == 'n' || answer == 'N'){
                this.setPeriod(-1);
            }
            else {
                
            }
        }
        
        System.out.print("Valuable count: ");
        int count = input.nextInt();
        this.setCount(count);

    }

    public void printinfo(){
        System.out.println("Id: " + id + " Name: " + name + "Document Type: " + documentType +" Count: " + count + " Period: " + period);
    }
}
