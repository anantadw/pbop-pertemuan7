package com.mycompany.polimorfisme.kasus2;

public abstract class Shape {
	private String shapeName;

	public Shape(String name) {
		shapeName = name;
	}

	public abstract double area();

	public String toString() {
		String result = "Shape: " + shapeName;

		return result;
	}
}
