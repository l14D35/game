package game;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Person> heroes = new ArrayList<>();
		heroes.add(new Archer());
		heroes.add(new Mage());
		heroes.add(new Wojownik());
		
		pvp(heroes.get(0), heroes.get(1), heroes.get(2));
		
		
		
	}
	
	public static void pvp(Person first, Person second, Person third) {
		System.out.println(first.getClass().getSimpleName() + " " + first.getHealth());
		System.out.println(second.getClass().getSimpleName() + " " + second.getHealth());
		System.out.println(third.getClass().getSimpleName() + " " + third.getHealth());
	}

}
