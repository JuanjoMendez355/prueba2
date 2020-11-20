package com.globalClasses;

import java.util.ArrayList;

import com.github.javafaker.Faker;

public class RandomTools{
	
	Faker faker = new Faker();
	
	public String generateNumberUniversity() {
		String numberUniversity;
		int random = (int)(Math.random()*(9999999-0000000+1)+0000000);
		numberUniversity = String.valueOf(random);
		
		return numberUniversity;
	}
	
	public String randomFirstName() {
		String firstName = faker.name().firstName();
		return firstName;
	}
	
	public String randomPokemon() {
		return faker.pokemon().name();
	}
	
	public String randomAlphanumeric() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("zero");		list.add("one");		list.add("two");		list.add("three");		list.add("four");
		list.add("five");		list.add("six");		list.add("seven");		list.add("eight");		list.add("nine");

		int random = (int) (Math.random()*(9-0+1)+0);
		return list.get(random)+ String.valueOf(random);
	}
	
	
	public String Tech() {
		String Tech ="";
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("PEGA");		
		list.add("JAVA");		
		list.add("JS");
		Tech = list.get((int) (Math.random()*(2-0+1)+0));

		
		return Tech ;
	}
	
	
	
	
}