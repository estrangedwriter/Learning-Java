package com.revature.scopes;

public class ScopeLauncher {

	// this is one scope
	// static scoped variable
	// class scoped variable
	// as close to global as we can get in java
	// there is no global scope in java
	// for field access modifiers do matter
	
	static int classBound = 0;
	
	// next scope is instance scoped
	// maybe object scoped
	// this variable belongs to a particular object
	// as long as you have access to the object you have access to the object scoped variables
	int objectBound = 0;
	
	// first kind of local variable 
	// sometimes called method scoped
	// parameters to a method are their own special scope
	// they get an identifier that cannot be reused in the method block
	
	public static void main (String[] localMethod) {
		
		// next scope
		// this is a block scoped variable
		// it belongs to a set of curly braces
		// block scoped is always inside some kind of method
		// block scoped to a particular block of code and dissapears when the block finished		
		int objectBound = 0;
		
		
		// this is an example of variable shadowing
		// when we declare a local var with the same ID as a field var
		// then in the block of code we assume to use the local instead of the field
		int classBound = 0;
		System.out.println(classBound);
		
		//we can still access a shadowed variable
		//we just need to explicitly name them
		
		System.out.println(ScopesLauncher.classBound);
		for(int i = 0;;) {
			for (int j = 0;;) {
				for(int k = 0;;) {
					break;
				} // k is gone
				break;
			} // j is gone
			break;
		} // i is gone
		
		int i = 0;  // i is reusable at this point
		
	}// our local objectBound is gone
	
	
}
