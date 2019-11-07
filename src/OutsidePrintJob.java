import java.text.DecimalFormat;

public class OutsidePrintJob extends PrintJob {
    private double cost = 0.0;

    OutsidePrintJob(String n, int p, int np){
        super(n, p, np);
        cost = .10*np;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString(){
        return name + ": priority " + priority + " with " + numPages + " pages and costs $" + cost + ".";
    }
}
