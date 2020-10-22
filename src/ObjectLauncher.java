import java.util.Objects;

public class ObjectLauncher {
	public static void main (String[] args) {
		
		System.out.println("We are going to build some objects and do some stuff with them");
		
		Food iceCream = new Food();
		
		iceCream.name = "Ice Cream";
		iceCream.calories = 450;
		iceCream.culture = "China";
		iceCream.type = "Dairy";
		iceCream.spiciness = -10;
		
		Food Curry = new Food("Curry", 750, "India", "Meal", 7);
		
		System.out.println("How much food has been made (IC)?" + iceCream.numberOfFoodCreated);
		System.out.println("How much food has been made (C)?" + Food.numberOfFoodCreated);
		
		Eater GordonRamsey = new Eater();
		GordonRamsey.name = "Gordon Ramsey";
		GordonRamsey.eat(iceCream);
			
		for (int i = 0; i < Food.allFoods.length; i++) {
			if (Objects.isNull(Food.allFoods[i])) {
				break;
			}
			
		}
		
		//System.out.println(iceCream.describe());
	}
	
}
