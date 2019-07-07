package factory;
import entities.Lager;
import interfaces.*;

public class LagerFactory implements DrinkServer {

	@Override
	public Beer createBeer() {
		Lager lager = new Lager();
		lager.infoDrink();
		
		return lager;
	}



}
