package factory;

import java.util.ArrayList;

import interfaces.Beer;
import interfaces.DrinkServer;

public class BeerFactory {

	 static ArrayList<Beer> beer = new ArrayList<Beer>();
	 
	 
	 
	 public static String serveDrink(DrinkServer factory) {
		 Beer objectBeer = factory.createBeer();
		 AddBeer(objectBeer);
		 
		 return objectBeer.infoDrink();
		 
	 }

	 public static void AddBeer(Beer pObjectBeer) {
		 beer.add(pObjectBeer);
	 }
	 
	 public static String getDrinkInfo() {
			String mData ="";
			
			for (int i=0;i<beer.size();i++)
				mData = mData + beer.get(i).infoDrink() + "\n";
				
			return mData;
		}
}
