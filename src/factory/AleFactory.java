package factory;

import entities.Ale;
import interfaces.Beer;
import interfaces.DrinkServer;

public class AleFactory implements DrinkServer {
 
	@Override
	public Beer createBeer() {
		
		Ale ale = new Ale();
		ale.infoDrink();
		
		return ale;
	}
	
}
