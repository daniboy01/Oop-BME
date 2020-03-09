package registry2;

public class Drummer {
    private String name; private String neptun;
    protected int yob; // Year Of Birth

    public Drummer(String name, String neptun, int yob) {
        this.name = name;
        this.neptun = neptun;
        this.yob = yob;
    }

    public String getName() {
        return name;
    }
    public String getNeptun() {
        return neptun;
    }
    public int getYob() {
        return yob;
    }

    public String greetings(){
        return "Üdvözletem";
    }

    public String toString(){
        return name + neptun + yob;
    }


}
