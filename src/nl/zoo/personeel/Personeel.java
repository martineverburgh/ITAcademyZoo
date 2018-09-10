package nl.zoo.personeel;

public class Personeel {
    private String name;
    private String functie;
    private int employeenumber;

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
    public void setEmployeenumber(int employeenumber) {
        this.employeenumber = employeenumber;
    }
    public int getEmployeenumber() {
        return this.employeenumber;
    }
}
