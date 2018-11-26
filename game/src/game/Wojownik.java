package game;

<<<<<<< HEAD
public class Wojownik extends Person {
	Wojownik() {
		this.setHealth(120);
		this.setAttackDamage(20);
	}

=======
public class Wojownik extends Person implements HeroStatic {
	
	Wojownik() {
		this.setHealth(120);
		this.setAttackDamage(getRandomAttack(10, 15));
	}
>>>>>>> Daniel
}
