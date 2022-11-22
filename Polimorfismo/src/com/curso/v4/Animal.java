package com.curso.v4;

public abstract class Animal {
	public abstract void animalSound();
}

class Cat extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The Cat says: miau");
	}
}

class Eagle extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The Eagle says: puras fallas!!");
	}
}

class Pig extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Duck extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The duck says: quak quak");
	}
}

class Dog extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}