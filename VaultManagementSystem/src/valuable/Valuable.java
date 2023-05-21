package valuable;

import java.util.Scanner;

public abstract class Valuable implements ValuableInput{
    protected ValuableKind kind = ValuableKind.MONEY;
    protected String name;
    protected int id;
    protected int count;
    protected int period;

    public Valuable(){
    }

    public Valuable(ValuableKind kind){
        this.kind = kind;
    }

    public Valuable(String name, int count, int period, int id){
        this.name = name;
        this.count = count;
        this.period = period;
        this.id = id;
    }

    public Valuable(ValuableKind kind, String name, int count, int period, int id){
        this.kind = kind;
        this.name = name;
        this.count = count;
        this.period = period;
        this.id = id;
    }

    public ValuableKind getKind() {
        return kind;
    }

    public void setKind(ValuableKind kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    
    public abstract void printinfo();

    public void setValuableName(Scanner input){
        System.out.print("Valuable Name: ");
        String name = input.next();
        this.setName(name);
    }
    
    public void setValuableId(Scanner input){
        System.out.print("Valuable Id: ");
        int id = input.nextInt();
        this.setId(id);
    }
    
    public void setValuableCount(Scanner input){
        System.out.print("Valuable Count: ");
        int count = input.nextInt();
        this.setCount(count);
    }

    public void setValuablePeriod(Scanner input){
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
    }

}