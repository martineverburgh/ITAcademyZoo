package nl.zoo.materials;

public class Spade {

    private String material;
    private Integer durability;

    public Spade(String material, Integer durability) {
        this.material = material;
        this.durability = durability;
    }

    public Spade() {
        //Empty constructor
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getDurability() {
        return durability;
    }

    public void setDurability(Integer durability) {
        this.durability = durability;
    }

    public String toString() {
        return "Spade{" +
                "material='" + material + '\'' +
                ", durability=" + durability +
                '}';
    }
}
