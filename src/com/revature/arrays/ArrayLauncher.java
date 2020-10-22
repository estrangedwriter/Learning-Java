package com.revature.arrays;
import java.util.Random;

public class ArrayLauncher {
	
	public static void main(String[] args) {
		String [][] gameboard = new String[3][3];
		Random r = new Random();
		
		System.out.println("beginning array");
		
		for (int i = 0; i < gameboard.length; i++ ) {
			for(int j = 0; j < gameboard[i].length; j++) {
				int choice = r.nextInt(2);
				if (choice == 0) {
					gameboard[i][j] = "X";
				}
				else {
					gameboard[i][j] = "O";
				}
			}
		}
		
		for (int i = 0; i < gameboard.length;i++ ) {
			for(int j = 0; j < gameboard[i].length; j++) {
				System.out.print(gameboard[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
	
}
