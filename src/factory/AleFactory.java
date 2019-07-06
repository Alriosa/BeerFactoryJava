package factory;

import entities.Ale;
import interfaces.IBeer;
import interfaces.IDrinkServer;

public class AleFactory implements IDrinkServer {

	@Override
	public IBeer serveDrink() {
		
		Ale ale = new Ale();
		ale.setName("Alerazor");
		ale.setType("Ale");
		ale.setAlcohol("5%");
		return ale;
		
		
	}
	
}
