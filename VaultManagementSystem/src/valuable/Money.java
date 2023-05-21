package valuable;

import java.util.Scanner;

public class Money extends Valuable{

    protected String currency;

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    };

    public Money(ValuableKind kind){
        super(kind);
    }

    public void setMoneyCurrency(ValuableInput valuable, Scanner input){
        System.out.print("Money currency: ");
        String currency = input.next();
        this.setCurrency(currency);
    }

    public void getUserInput(Scanner input){

        setValuableId(input);

        setValuableName(input);

        setMoneyCurrency(this, input);
        
        setValuablePeriod(input);

        setValuableCount(input);
        
    }

    public void printinfo(){
        String skind = getKindString();
        System.out.println("Kind: " + skind + " Id: " + id + " Name: " + name + " Currency: " + currency + " Count: " + count + " Period: " + period);
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
