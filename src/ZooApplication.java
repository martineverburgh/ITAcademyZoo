import nl.zoo.animal.Animal;

public class ZooApplication {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("test");

        System.out.println(lion.getName());

    }

}
