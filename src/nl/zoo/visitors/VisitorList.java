package nl.zoo.visitors;

import java.util.ArrayList;

public class VisitorList {

    private ArrayList<Visitor> visitorList;

    public VisitorList() {
        visitorList = new ArrayList<>();
        addVisitors();
    }

    private void addVisitors() {

        Visitor Jan = new Visitor("Jan", "van Mulligen", 35);
        Visitor Erik = new Visitor("Erik", "Romunde", 36);
        Visitor Mindert = new Visitor("Mindert", "Aardema", 40);
        Visitor Martine = new Visitor("Martine", "Verburgh", 30);
        Visitor Renske = new Visitor("Renske", "Siebe", 25);
        Visitor Marnix = new Visitor("Marnix", "Blaauw", 23);

        visitorList.add(Jan);
        visitorList.add(Erik);
        visitorList.add(Mindert);
        visitorList.add(Martine);
        visitorList.add(Renske);
        visitorList.add(Marnix);
    }

    public void printVisitors() {
        System.out.println("The current visitors are:");
        for (Visitor visitor : visitorList) {
            System.out.println(visitor.getFirstName() + " " + visitor.getLastName() + ", " + visitor.getAge());
        }
    }

    public void addNewVisitor(String firstName, String lastName, int age) {
        Visitor visitor = new Visitor(firstName, lastName, age);
        visitorList.add(visitor);
        System.out.println("Visitor " + firstName + " " + lastName + ", " + age + " was added to the visitor list.");
    }

    public void deleteVisitor(String firstName, String lastName) {
        for (Visitor visitor : visitorList) {
            if(visitor.getFirstName() == firstName && visitor.getLastName() == lastName) {
                visitorList.remove(visitor);
                System.out.println("Visitor " + firstName + " " + lastName + "was removed from the visitor list");
            }
        }
    }
}
