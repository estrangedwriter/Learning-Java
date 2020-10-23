package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>(); 
		
		System.out.println(values.add(5));
		System.out.println(values.add(4));
		System.out.println(values.add(3));
		
		System.out.println(values);
		
	}

}
