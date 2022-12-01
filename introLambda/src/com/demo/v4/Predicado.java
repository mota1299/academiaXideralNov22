package com.demo.v4;

@FunctionalInterface
public interface Predicado<T> {

	abstract boolean probar(T t);
		
}
