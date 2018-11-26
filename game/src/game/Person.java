package game;

public abstract class Person implements HeroStatic {

	private int health = 0;
	private int attackDamage = 0;
	private String name = "";
	private String[] namesOfHeroes = { "The Gentle Vindicator", "The Electron Moth", "The Defiant Guard",
			"The Fantastic Fighter", "Fearless Angel", "Electron Lynx", "Old Shield", "Doctor Impossible Knuckles",
			"Crazy Eight", "Hopewing" };

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

<<<<<<< HEAD
=======
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRandomAttack(int min, int max) {
		return rand.nextInt(max - min + 1) + min;
	}

	public String[] getNamesOfHeroes() {
		return namesOfHeroes;
	}

	public String getRandomName() {
		return namesOfHeroes[getRandomAttack(0, 9)];
	}

>>>>>>> Daniel
}

