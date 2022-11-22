package com.curso.v5;

import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
		Animal animal = getAnimal();
		animal.animalSound();
	}
	
	public static Animal getAnimal() {
		
		Animal[] animals = new Animal[4];
		animals[0] = new Dog();
		animals[1] = new Pig();
		animals[2] = new Eagle();
		animals[3] = new Duck();
		
		int random = new Random()
				.nextInt(animals.length);

		//System.out.println(random);
		Animal animalResult = animals[random];
		
		return animalResult;
		
	}

}
