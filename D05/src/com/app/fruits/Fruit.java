package com.app.fruits;

// Base class
public class Fruit {
	private String name, color;
	private double weight;
	private boolean isFresh;

	public Fruit(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = true;
	}

	public String taste() { return "no specific taste"; }


	public String getName() { return name; }
	public boolean isFresh() { return isFresh; }
	public void setFresh(boolean isFresh) { this.isFresh = isFresh; }

	@Override
	public String toString() {
		return "Name of Fruit : " + name + "\nColor of Fruit : " + color + "\nWeight of Fruit : " + weight;
	}
}




