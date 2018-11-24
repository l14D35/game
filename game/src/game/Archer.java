package game;

public class Archer extends Person implements HeroStatic {

	Archer() {
		this.setHealth(80);
		this.setAttackDamage(getRandomAttack(15, 30));
	}
}
