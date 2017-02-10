package br.com.blank.decorator;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}