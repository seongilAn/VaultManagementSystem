package valuable;

import java.util.Scanner;

public interface ValuableInput {

    public int getId();

    public void setName(String name);

    public void setId(int id);

    public void setCount(int count);

    public void setPeriod(int period);

    public void printinfo();

    public void getUserInput(Scanner input);    

    public void setValuableName(Scanner input);

    public void setValuableId(Scanner input);

    public void setValuableCount(Scanner input);

    public void setValuablePeriod(Scanner input);

}
