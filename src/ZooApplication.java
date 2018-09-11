import nl.zoo.animal.Animal;
import nl.zoo.food.Food;
import nl.zoo.materials.*;
import nl.zoo.visitors.Visitor;
import nl.zoo.visitors.VisitorList;

import java.util.Scanner;

public class ZooApplication {

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("Welome to our Zoo!");
        VisitorList visitorList = new VisitorList();
        visitorList.printVisitors();

        Animal lion = new Animal();
        lion.setName("test");

        System.out.println(lion.getName());


        Food brok = new Food();
        brok.setBrand("Kittekat");
        brok.setAmount(5);
        brok.setAnimal("Kat");
        brok.setSupplier("De diervoederspeciaist");

        System.out.println(brok.getBrand());
        System.out.println(brok.getAmount());
        System.out.println(brok.getAnimal());
        System.out.println(brok.getSupplier());

        Cage cage = new Cage(12, 23, 43);
        System.out.println(cage.toString());

        Scanner reader = new Scanner(System.in);
        while (running) {
            visitorList.showOptions();
            String input = reader.next();

            switch (input) {
                case "1":
                    visitorList.addNewVisitor();
                    break;
                case "2":
                    visitorList.deleteVisitor();
                    break;
                case "3":
                    visitorList.printVisitors();
                    break;
                case "bye":
                    System.out.println("");
                    running = false;
                    break;
                default:
                    System.out.println("Choose option 1, 2 or 3 please...");
            }
        }
        reader.close();
    }
}