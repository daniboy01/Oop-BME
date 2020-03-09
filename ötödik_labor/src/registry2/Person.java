package registry2;

public abstract class Person {
	private String name; private String neptun;
	protected int yob; // Year Of Birth

	public Person(String na, String ne, int y) {
		name = na; neptun = ne; yob = y; 
	}

	public String getName() { return name; }
	public String getNeptun() { return neptun; }
	public int getYob() { return yob; }
	public String toString() {
		return name+" ("+neptun+") "+yob;
	}

	private double weight; // tests�ly, priv�t
	public double getWeight() { return weight; }
	protected void setWeight(double w) { // setter
		weight = w;
	}
	abstract public String greetings();

	//3. példa meet()
	public void meet(Person p) {
		System.out.println(greetings() + " " + p.name + "!");
	}

}  
