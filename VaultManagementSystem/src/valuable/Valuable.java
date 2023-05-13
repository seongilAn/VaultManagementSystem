package valuable;

public abstract class Valuable {
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

}