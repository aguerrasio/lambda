package com.order.lambda;

import com.order.lambda.controller.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class LambdaApplication {

	public static void main(String[] args) {
		long t1, t2, dif;
		SpringApplication.run(LambdaApplication.class, args);
		Persona a = new Persona("Fino", "Marcela",80);
		Persona b = new Persona("Lauria","Brenda",11);
		Persona c = new Persona("Guerrasio","Adriana",40);
		Persona d = new Persona("Guerrero","Pablo",30);

		List<Persona> list = Arrays.asList(a,b,c,d);

		System.out.println("Order by name: ");
		System.out.println("");
		Calendar ahora1 = Calendar.getInstance();
		t1 = ahora1.getTimeInMillis();
		list.stream().sorted().forEach(System.out::println);
		Calendar ahora2 = Calendar.getInstance();
		t2 = ahora2.getTimeInMillis();
		dif = t2 - t1;
		System.out.println("Tiempo: " + (double)dif/1000);
		System.out.println("------------");

		System.out.println("Order by last name: ");
		System.out.println("");
		Calendar ahora3 = Calendar.getInstance();
		t1 = ahora3.getTimeInMillis();
		list.stream().sorted(Comparator.comparing(Persona::getLastName)).forEach(System.out::println);
		Calendar ahora4 = Calendar.getInstance();
		t2 = ahora4.getTimeInMillis();
		dif = t2 - t1;
		System.out.println("Tiempo: " + (double)dif/1000);
		System.out.println("------------");

		System.out.println("Order by last name using lambda");
		System.out.println("");
		Calendar ahora5 = Calendar.getInstance();
		t1 = ahora5.getTimeInMillis();
		list.sort((x, y) -> x.getLastName().compareToIgnoreCase(y.getLastName()));
		list.forEach(x -> System.out.println(x.toString()));
		Calendar ahora6 = Calendar.getInstance();
		t2 = ahora6.getTimeInMillis();
		dif = t2 - t1;
		System.out.println("Tiempo: " + (double)dif/1000);


		System.out.println("------------");

		System.out.println("Order by age");
		System.out.println("");
		Calendar ahora7 = Calendar.getInstance();
		t1 = ahora7.getTimeInMillis();
		list.stream().sorted(Comparator.comparing(Persona::getAge)).forEach(System.out::println);
		Calendar ahora8 = Calendar.getInstance();
		t2 = ahora8.getTimeInMillis();
		dif = t2 - t1;
		System.out.println("Tiempo: " + (double)dif/1000);

	}


}
