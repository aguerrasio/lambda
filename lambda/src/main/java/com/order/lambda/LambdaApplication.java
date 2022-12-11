package com.order.lambda;

import com.order.lambda.controller.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class LambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaApplication.class, args);
		Persona a = new Persona("Fino", "Marcela",80);
		Persona b = new Persona("Lauria","Brenda",11);
		Persona c = new Persona("Guerrasio","Adriana",40);
		Persona d = new Persona("Guerrero","Pablo",30);

		List<Persona> list = Arrays.asList(a,b,c,d);

		System.out.println("Order by name: ");
		System.out.println("");
		list.stream().sorted().forEach(System.out::println);

		System.out.println("------------");

		System.out.println("Order by last name: ");
		System.out.println("");
		list.stream().sorted(Comparator.comparing(Persona::getLastName)).forEach(System.out::println);

		System.out.println("------------");

		System.out.println("Order by last name using lambda");
		System.out.println("");
		list.sort((x, y) -> x.getLastName().compareToIgnoreCase(y.getLastName()));
		list.forEach(x -> System.out.println(x.toString()));


		System.out.println("------------");

		System.out.println("Order by age");
		System.out.println("");
		list.stream().sorted(Comparator.comparing(Persona::getAge)).forEach(System.out::println);
	}


}
