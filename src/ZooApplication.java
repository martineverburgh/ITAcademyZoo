import nl.zoo.visitors.Visitor;
import nl.zoo.visitors.VisitorList;

public class ZooApplication {

    public static void main(String[] args) {
        System.out.println("Welome to our Zoo!");
        VisitorList visitorList = new VisitorList();
        visitorList.printVisitors();
    }
}
