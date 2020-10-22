


// this class is going to be about food related data and food related behaviors 

public class Food {
	
	static int numberOfFoodCreated = 0; // we can assign a default value to a field when it gets created
	static Food [] allFoods = new Food[10];
	
	String name;
	double calories;
	String culture;
	String type;
	int spiciness;
	
	public Food() {
		super();
		numberOfFoodCreated++;
	}
	// most of the time we include a default constructor unless we have a good reason not to
	// a good reason not to have one is if our object requires another object for it to function
	public Food(String name, double calories, String culture, String type, int spiciness) {
		super(); // we get an object from an object
		this.name = name;
		this.calories = calories;
		this.culture = culture;
		this.type = type;
		this.spiciness = spiciness;
		numberOfFoodCreated++;
		allFoods[numberOfFoodCreated] = this;
		// customizing the object because this is the food constructor
	}
	
	public String describe() {
		// this keyword refers to the specific object we called the method on
		return "Food Name: " + this.name + "\nCalories: " + 
				this.calories + "\nCulture:" + this.culture + 
				"\nType: " + this.type + "\nSpiciness: " + this.spiciness;
	}
	
	// void return type means a method does not return anything
	public void rot() {
		this.name = "Rotten " + this.name; 
		this.calories = this.calories / 2 ; 
		
	}

}
