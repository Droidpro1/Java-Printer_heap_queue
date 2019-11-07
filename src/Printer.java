import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
    public static void main( String [ ] args ) throws FileNotFoundException {
        File file = new File("input.txt");
        BinaryHeap<PrintJob> priorityQ = new BinaryHeap<>();

        if(!file.exists())
            throw new FileNotFoundException("File not found!");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String name = sc.next();
            int priority = sc.nextInt();
            int numPages = sc.nextInt();
            if(sc.next().equals("I")){
                PrintJob newJob = new PrintJob(name,priority,numPages);
                priorityQ.insert(newJob);
            }
            else{
                PrintJob newJob = new OutsidePrintJob(name,priority,numPages);
                priorityQ.insert(newJob);
            }
        }
        sc.close();

        while(!priorityQ.isEmpty()){
            System.out.println(priorityQ.deleteMin());
        }

    }
}
