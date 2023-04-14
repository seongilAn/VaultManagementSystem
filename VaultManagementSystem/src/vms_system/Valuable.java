package vms_system;

public class Valuable {
    String name;
    String type;
    int id;
    int count;
    int period;

    public Valuable(){
    }

    public Valuable(String name, String type){
        this.name = name;
        this.type = type;
    }

    public Valuable(String name, String type, int count, int period, int id){
        this.name = name;
        this.type = type;
        this.count = count;
        this.period = period;
        this.id = id;
    }

    public void printinfo(){
        System.out.println("Name: " + name + " Type: " + type + " Count: " + count + " Period: " + period);
    }

}