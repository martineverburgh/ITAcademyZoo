package nl.zoo.personeel;

public class Personeel {
    private String name;
    private String functie;
    private int employeeNumber;

    //default constructor zinvol of niet? verplichtingsregels afdwingen?

    public void setFunctie(String functie) {
        this.functie=functie;
    }
    public String getFunctie() {
        return this.functie;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public int getEmployeeNumber() {
        return this.employeeNumber;
    }
}
