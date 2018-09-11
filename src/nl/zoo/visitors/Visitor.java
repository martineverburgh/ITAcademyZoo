package nl.zoo.visitors;

public class Visitor {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMember;

    private static int amountOfVisitorsInstantiated;

    static {
        amountOfVisitorsInstantiated = 0;
    }

    {
        amountOfVisitorsInstantiated++;
    }

    public Visitor(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMember = false;
    }

    public static int getAmountOfVisitorsInstantiated(){
        return amountOfVisitorsInstantiated;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }
}
