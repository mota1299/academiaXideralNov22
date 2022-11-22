package com.curso.v5;

public interface Animal {
	void animalSound();
}

class Cat implements Animal {
	@Override
	public void animalSound() {
		System.out.println("The Cat says: miau");
	}
}

class Eagle implements Animal {
	@Override
	public void animalSound() {
		System.out.println("The Eagle says: puras fallas!!");
	}
}

class Pig implements Animal {
	@Override
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Duck implements Animal {
	@Override
	public void animalSound() {
		System.out.println("The duck says: quak quak");
	}
}

class Dog implements Animal {
	@Override
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}