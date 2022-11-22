package com.curso.v1;

public class Principal {
	
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.animalSound();
		
		Animal pig = new Pig();
		pig.animalSound();
		
		Animal dog = new Dog();
		dog.animalSound();
	}

}
