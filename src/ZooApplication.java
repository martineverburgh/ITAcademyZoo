import nl.zoo.animal.Animal;
import nl.zoo.food.Food;
import nl.zoo.materials.*;

import nl.zoo.visitors.Visitor;
import nl.zoo.visitors.VisitorList;

public class ZooApplication {


    public static void main(String[] args) {
        System.out.println(Visitor.getAmountOfVisitorsInstantiated());
        System.out.println("Welome to our Zoo!");
        VisitorList visitorList = new VisitorList();
        visitorList.printVisitors();
        System.out.println(Visitor.getAmountOfVisitorsInstantiated());

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
    }
}
