package main;

import java.util.Scanner;
import factory.*;

import interfaces.DrinkServer;

public class MainClass {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int option=0;
		String drink = "";
		
		AleFactory alefac = new AleFactory();
		LagerFactory lagfac = new LagerFactory();
		PiselnerFactory pilfac = new PiselnerFactory();
		
		switch (option) {
		case 1:
			drink = DrinkServer.createBeer(alefac);
			//salida = FabricaDeVehiculos.crearFabricaDeVehiculo(taxi);
			break;
		case 2:
			break;
		case 3:
			break;
			default:
				System.out.println("Error");
				break;
		}

	}

}
