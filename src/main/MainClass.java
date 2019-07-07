package main;

import java.util.Scanner;
import factory.*;

import interfaces.DrinkServer;

public class MainClass {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int option=0;
		String drink = "";
		
		System.out.println("Welcome to the bar!");
		System.out.println("Pick your poison");
		System.out.println("1- Ale");
		System.out.println("2- Lager");
		System.out.println("3- Pilsener");
		
		AleFactory alefac = new AleFactory();
		LagerFactory lagfac = new LagerFactory();
		PiselnerFactory pilfac = new PiselnerFactory();
		
		switch (option) {
		case 1:
			drink = BeerFactory.prepareDrink(alefac);
			System.out.println(drink);
			break;
		case 2:
			drink = BeerFactory.prepareDrink(lagfac);
			System.out.println(drink);
			break;
		case 3:
			drink = BeerFactory.prepareDrink(pilfac);
			System.out.println(drink);
			break;
			default:
				System.out.println("Error");
				break;
		}

	}

}
