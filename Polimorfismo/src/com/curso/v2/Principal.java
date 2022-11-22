package com.curso.v2;

public class Principal {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalSound();
		
		animal = new Pig();
		animal.animalSound();
		
		animal = new Dog();
		animal.animalSound();
	}

}
