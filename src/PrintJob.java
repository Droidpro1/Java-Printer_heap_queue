public class PrintJob implements Comparable<PrintJob>{
    String name="";
    int priority = 0;
    int numPages = 0;

    public PrintJob(String n, int p, int np){
        name = n;
        priority = p;
        numPages = np;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public int compareTo(PrintJob p){
        return (priority*numPages) - (p.priority*p.numPages);
    }

    @Override
    public String toString(){
        return name + ": priority " + priority + " and " + numPages + " pages.";
    }
}
