package valuable;

import java.util.Scanner;

public class Jewerly extends Valuable{

    protected String typeName;

    public Jewerly(ValuableKind kind){
        super(kind);
    }

    public String gettypeName(){
        return this.typeName;
    }

    public void setTypeName(String typeName){
        this.typeName = typeName;
    }

    public void setJewerlyTypeName(ValuableInput vauable, Scanner input){
        System.out.print("Jewerly Type: ");
        String typeName = input.next();
        this.setTypeName(typeName);
    }

    public void getUserInput(Scanner input){

        setValuableId(input);
        
        setValuableName(input);

        setJewerlyTypeName(this, input);

        setValuablePeriod(input);
        
        setValuableCount(input);
    }

    public void printinfo(){
        String skind = getKindString();
        System.out.println("Kind: " + skind + " Id: " + id + " Name: " + name + " Jewerly Type: " + typeName + " Count: " + count + " Period: " + period);
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
