
public class SpentMagazine implements State {

    Weapon weapon;
    
    public SpentMagazine(Weapon weapon) {
        this.weapon = weapon;
    }
 
	public void insertRound() {
		System.out.println("Cannot insert round. Magazine is empty.");
	}
 
	public void ejectRound() {
		System.out.println("Cannot eject. No Round inserted into the chamber");
	}
 
	public void pullTrigger() {
		System.out.println("You pulled the trigger, but no round fired.");
	}
 
	public void fire() {
		System.out.println("No round fired.");
	}
	
	public void refillMagazine() { 
		weapon.setState(weapon.getNoRoundState());
	}
 
	public String toString() {
		return "Magazine Empty.";
	}
}
