
public class WeaponSimulation {

	public static void main(String[] args) {
		Weapon weapon = new Weapon(4);
		System.out.println(weapon);
		weapon.insertRound();
		weapon.pullTrigger();
		System.out.println("");
		System.out.println(weapon);
		weapon.insertRound();
		weapon.pullTrigger();
		weapon.insertRound();
		weapon.pullTrigger();
		weapon.insertRound();
		weapon.pullTrigger();
		weapon.refillMagazine(4);
		weapon.insertRound();
		weapon.pullTrigger();
		weapon.insertRound();
		weapon.pullTrigger();
		System.out.println("");
		System.out.println(weapon);
	}
}
