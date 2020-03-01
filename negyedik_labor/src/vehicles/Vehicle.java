package vehicles;

public class Vehicle {
    private int constructionYear;
    private String plateNumb;
    private String type;
    private Person owner;

    public Vehicle(int constructionYear, String plateNumb, String type) {
        this.constructionYear = constructionYear;
        this.plateNumb = plateNumb;
        this.type = type;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public String getPlateNumb() {
        return plateNumb;
    }

    public String getType() {
        return type;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return constructionYear + " | " + plateNumb + " | " + type;
    }
}
