package factory;
import entities.Lager;
import interfaces.*;

public class LagerFactory implements IDrinkServer {

	@Override
	public IBeer serveDrink() {
		Lager lager = new Lager();
		lager.setName("Lagerazor");
		lager.setType("Lager");
		lager.setAlcohol("4%");
		return lager;
	}

}
