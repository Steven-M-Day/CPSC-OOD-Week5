
public class NoRound implements State {

    Weapon weapon;
    
    public NoRound(Weapon weapon) {
        this.weapon = weapon;
    }
 
	public void insertRound() {
		System.out.println("Round inserted.");
		weapon.setState(weapon.getHasRoundState());
	}
 
	public void ejectRound() {
		System.out.println("No round inserted.");
	}
 
	public void pullTrigger() {
		System.out.println("Trigger pulled. No Round in Chamber.");
	 }
 
	public void fire() {
		System.out.println("No round inserted.");
	} 
	
	public void refillMagazine() { }
 
	public String toString() {
		return "Waiting for round to be inserted.";
	}
}
