

// anything that can eat a food

public class Eater {

	double hunger;
	String name;
	
	// method can take in any number of parameters of any types
	public void eat(Food f) {
		this.hunger -= f.calories;
		System.out.println("My name is " + this.name + " and I think that that "+ f.name + " was tasty!");
	}
}
