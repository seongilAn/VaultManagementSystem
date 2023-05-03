package valuable;

import java.util.Scanner;

public class Valuable {
    protected ValuableKind kind = ValuableKind.MONEY;
    protected String name;
    protected int id;
    protected int count;
    protected int period;

    public Valuable(){
    }

    public Valuable(String name, int count, int period, int id){
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

    public void printinfo(){
        System.out.println("Id: " + id + " Name: " + name + " Count: " + count + " Period: " + period);
    }

    public void getUserInput(Scanner input){
        System.out.print("Id: ");
        int id = input.nextInt();
        this.setId(id);

		System.out.print("Valuables name: ");
		String name = input.next();
        this.setName(name);
        
        System.out.print("Valuable count: ");
        int count = input.nextInt();
        this.setCount(count);

		System.out.print("Storage period: ");
		int period = input.nextInt();
        this.setPeriod(period);
    }

}