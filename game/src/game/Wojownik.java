package game;

public class Wojownik extends Person implements HeroStatic {
	
	Wojownik() {
		this.setHealth(120);
		this.setAttackDamage(getRandomAttack(10, 15));
	}

}
