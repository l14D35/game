package game;

public class Mage extends Person implements HeroStatic {

	Mage() {
		this.setHealth(50);
		this.setAttackDamage(getRandomAttack(20,30));
		this.setName(getRandomName());
	}
}
