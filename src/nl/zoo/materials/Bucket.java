package nl.zoo.materials;

public class Bucket {

    private String content;
    private Integer contentLimit;


    public Bucket(String content, Integer contentLimit) {
        this.content = content;
        this.contentLimit = contentLimit;
    }

    public Bucket() {
        //Empty constructor
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getContentLimit() {
        return contentLimit;
    }

    public void setContentLimit(Integer contentLimit) {
        this.contentLimit = contentLimit;
    }

    public String toString() {
        return "Bucket{" +
                "content='" + content + '\'' +
                ", contentLimit=" + contentLimit +
                '}';
    }
}
