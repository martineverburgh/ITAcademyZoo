package nl.zoo.food;

public class Food {
    private String brand;
    private String supplier;
    private String animal;
    private int amount;

    private static int amountFoodsCreated;

    //
//    static {
//        amountFoodsCreated = 0;
//    }
//
//    {
//        amountFoodsCreated++;
//    }

    public Food() {
        amountFoodsCreated++;
    }

    public static int getAmountFoodsCreated() {
        return amountFoodsCreated;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
