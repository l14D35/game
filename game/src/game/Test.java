package game;

<<<<<<< HEAD
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
=======
import java.util.Scanner;

public class Test {
	public static final String beep = "beep.wav";
	public static String tmpName = "";

	public static void main(String[] args) throws InterruptedException {
		initTest();
	}
	
	
	/**
	 * Story
	 * @throws InterruptedException
	 */
	public static void initTest() throws InterruptedException {
		textSleep("Witaj...");
		textSleep("Dzisiaj wyruszymy w podroz...");
		textSleep("Ale najpierw...");
		textSleep("Podaj swoje imie...");
		getName();
		textSleep(tmpName + "...");
		textSleep("Dobrze...");
		textSleep("Bardzo dobrze...");

	}

	private static void getName() {
		Scanner in = new Scanner(System.in);
		tmpName = in.nextLine();
		in.close();
	}
	
	/**
	 * Wypisuje znaki co 200 milisekund
	 * @param text ciag znakow
	 * @throws InterruptedException
	 */
	public static void textSleep(String text) throws InterruptedException {
		char[] charArr = text.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i]);
			Thread.sleep(200);
		}
		System.out.println();
		Thread.sleep(1000);
>>>>>>> Daniel
	}

}
