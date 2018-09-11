package nl.zoo.visitors;

import java.util.ArrayList;
import java.util.Scanner;

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
        int i = 1;
        for (Visitor visitor : visitorList) {
            System.out.println(i + ". " + visitor.getFirstName() + " " + visitor.getLastName() + ", " + visitor.getAge());
            i++;
        }
    }

    public void addNewVisitor() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Fill in the first name of the new visitor.");
        String firstName = reader.next();
        System.out.println("Fill in the last name of the new visitor.");
        String lastName = reader.next();
        System.out.println("Fill in the age of the new visitor.");
        int age = reader.nextInt();
        Visitor visitor = new Visitor(firstName, lastName, age);
        visitorList.add(visitor);
        System.out.println("Visitor " + firstName + " " + lastName + ", " + age + " was added to the visitor list.");
    }

    public void deleteVisitor() {

        Scanner reader = new Scanner(System.in);
        System.out.println("Choose the corresponding number of the visitor you want to delete.");
        int number = reader.nextInt();
        Visitor visitor = visitorList.get(number - 1);
        visitorList.remove(visitor);
        System.out.println("Visitor " + visitor.getFirstName() + " " + visitor.getLastName() + " was removed from the visitor list");
    }

    public void showOptions() {
        System.out.println("Choose your action:");
        System.out.println("1.  Add a new visitor");
        System.out.println("2.  Delete a visitor");
        System.out.println("3.  Show the current visitors");
    }
}
