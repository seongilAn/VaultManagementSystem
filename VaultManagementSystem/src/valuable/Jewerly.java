package valuable;

import java.util.Scanner;

public class Jewerly extends Valuable{

    protected String jewerlyType;

    public Jewerly(ValuableKind kind){
        super(kind);
    }

    public String getJewerlyType(){
        return this.jewerlyType;
    }

    public void setJewerlyType(String jewerlyType){
        this.jewerlyType = jewerlyType;
    }

    public void getUserInput(Scanner input){
        System.out.print("Id: ");
        int id = input.nextInt();
        this.setId(id);

		System.out.print("Valuables name: ");
		String name = input.next();
        this.setName(name);

        System.out.print("Jewerly Type: ");
        String jewerlyType = input.next();
        this.setJewerlyType(jewerlyType);

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
        String skind = "none";
        switch(this.kind){
            case MONEY:
                skind = "Money";
                break;
            case DOCUMENT:
                skind = "Document";
                break;
            case JEWERLY:
                skind = "Jewerly";
                break;
            case GOLD:
                skind = "Gold";
                break;
            default:
        }
        System.out.println("Kind: " + skind + " Id: " + id + " Name: " + name + " Jewerly Type: " + jewerlyType + " Count: " + count + " Period: " + period);
    }

}
