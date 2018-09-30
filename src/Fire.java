
public class Fire implements State {

    Weapon weapon;
    
    public Fire(Weapon weapon) {
        this.weapon = weapon;
    }
       
	public void insertRound() {
		System.out.println("Weapon has already been fired.");
	}
 
	public void ejectRound() {
		System.out.println("Trigger already pulled.");
	}
 
	public void pullTrigger() {
		System.out.println("Not an automatic. Can only pull the trigger once at a time.");
	}
 
	public void fire() {
		weapon.fireRound();
		if (weapon.getCount() > 0) {
			weapon.setState(weapon.getNoRoundState());
		} else {
			System.out.println("Out of rounds. Magazine empty!");
			weapon.setState(weapon.getSpentMagazineState());
		}
	}
	
	public void refillMagazine() { }
 
	public String toString() {
		return "Firing round.";
	}
}
