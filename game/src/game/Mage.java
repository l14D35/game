package game;

import java.util.Random;

public class Mage extends Person {
	Random rand = new Random();
	
	Mage() {
		this.setHealth(50);
		this.setAttackDamage(rand.nextInt(16) + 15);
	}
}
