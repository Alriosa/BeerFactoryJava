package entities;

import interfaces.Beer;

public class Pilsener implements Beer {
	private String name;
	private String type;
	private String alcohol;
	
	public Pilsener() {
		super();
	}

	public Pilsener(String name, String type, String alcohol) {
		super();
		this.name = name;
		this.type = type;
		this.alcohol = alcohol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public String toString() {
		return "Pilsener [name=" + name + ", type=" + type + ", alcohol=" + alcohol + "]";
	}

	@Override
	public String infoDrink() {
		this.name = "Pilsen";
		this.type = "Pilsener";
		this.alcohol = "6%";
		return "Pilsener [name=" + name + ", type=" + type + ", alcohol=" + alcohol + "]";
	}
	
	
}
