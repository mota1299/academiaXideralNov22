package com.curso.demos;

import java.util.function.*;

public class Demos2 {
	
public static void main(String[] args) {
		
		BiPredicate<Empleado, Empleado> mayorEdad = (a, b) ->  a.getEdad() > b.getEdad();
		System.out.println(mayorEdad.test(new Empleado("Andronico",19,40.50), new Empleado("Rolas",17,60.03)));
		
		BiPredicate<Empleado, Integer> mayorEdadInt = (a, b) ->  a.getEdad() > b;
		System.out.println(mayorEdadInt.test(new Empleado("Andronico",19,40.50), 18));
		
		BiConsumer <String, Integer> concatStringInt = (s, i) -> System.out.println(s + " " + i);
		concatStringInt.accept("Mi edad:", 24);
		
		BiFunction <Empleado, String, Empleado> cambiarNombre = (e, s) -> {
			e.setNombre(s);
			return e;
		};
		
		Empleado emp = new Empleado("Andronico",19,40.50);
		Empleado emp2 = cambiarNombre.apply(emp, "Pedro");
		System.out.println(emp2);
		
		BinaryOperator<String> concat = (s1, s2) -> s1.concat(" ").concat(s2);
		System.out.println(concat.apply("Hello", "World"));

		BinaryOperator<Integer> suma = (i, j) -> i + j;
		System.out.println(suma.apply(1, 2));
		
		BooleanSupplier b = () -> true;
		Predicate<String> p = z -> true;
		
		BiFunction<Integer,Integer,Integer> lambda01 = (x,y) -> x + y;
		BiFunction<Double,Double,Double> lambda02 = (x,y) -> x + y;
		BiFunction<Long,Long,Long> lambda03 = (x,y) -> x + y;
		BiFunction<String,String,String> lambda04 = (x,y) -> x + y;

		BinaryOperator<Integer> lambda05 = (x,y) -> x + y;
		BinaryOperator<Double> lambda06 = (x,y) -> x + y;
		BinaryOperator<Long> lambda07 = (x,y) -> x + y;
		BinaryOperator<String> lambda08 = (x,y) -> x + y;
		
		IntBinaryOperator lambda09 = (x,y) -> x + y;
		LongBinaryOperator lambda10 = (x,y) -> x + y;
		DoubleBinaryOperator lambda11 = (x,y) -> x + y;
		
		ToIntBiFunction<Integer,Integer> lambda12 = (x,y) -> x + y;
		ToDoubleBiFunction<Double,Double> lambda13 = (x,y) -> x + y;
		ToLongBiFunction<Long,Long> lambda14 = (x,y) -> x + y;


		
	}


}
