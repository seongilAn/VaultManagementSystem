package valuable;

import java.util.Scanner;

public class Document extends Valuable{

    protected String usage;

    public Document(ValuableKind kind){
        super(kind);
    }

    public String getusage(){
        return this.usage;
    }

    public void setUsage(String usage){
        this.usage = usage;
    }

    public void setDocumentUsage(ValuableInput valuable, Scanner input){
        System.out.print("Document usage: ");
        String usage = input.next();
        this.setUsage(usage);
    }

    public void getUserInput(Scanner input){
        
        setValuableId(input);

        setValuableName(input);

        setDocumentUsage(this, input);
        
        setValuablePeriod(input);

        setValuableCount(input);

    }

    public void printinfo(){
        String skind = getKindString();
        System.out.println("Kind: " + skind + " Id: " + id + " Name: " + name + " Document Type: " + usage + " Count: " + count + " Period: " + period);
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
