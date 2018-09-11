package nl.zoo.materials;

public class Cage {

    private Integer width;
    private Integer length;
    private Integer height;

    public Cage(Integer width, Integer length, Integer height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Cage() {
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String toString() {
        return "Cage{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}

