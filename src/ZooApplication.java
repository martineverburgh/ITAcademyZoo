import nl.zoo.animal.Animal;
import nl.zoo.food.Food;

public class ZooApplication {
    public static void main(String[] args) {
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

        }


    }


