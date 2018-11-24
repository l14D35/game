package game;

public abstract class Person implements HeroStatic {

	private int health = 0;
	private int attackDamage = 0;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	public int getRandomAttack(int max, int min) {
		return rand.nextInt(max - min + 1) + min;
	}

}
