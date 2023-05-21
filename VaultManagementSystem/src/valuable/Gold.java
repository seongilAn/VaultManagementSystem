package valuable;

import java.util.Scanner;

public class Gold extends Valuable{

    protected int karat;

    public Gold(ValuableKind kind){
        super(kind);
    }

    public int getKarat(){
        return this.karat;
    }

    public void setKarat(int karat){
        this.karat = karat;
    }

    public void setGoldKarat(ValuableInput valuable, Scanner input){
        System.out.print("Karat: ");
        int karat = input.nextInt();
        this.setKarat(karat);
    }

    public void getUserInput(Scanner input){

        setValuableId(input);

        setValuableName(input);

        setGoldKarat(this, input);

        setValuablePeriod(input);

        setValuableCount(input);

    }

    public void printinfo(){
        String skind = getKindString();
        System.out.println("Kind: " + skind + " Id: " + id + " Name: " + name + " Karat: " + karat + "K " + " Count: " + count + " Period: " + period);
    }

    public String getKindString(){
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

        return skind;
    }
}
