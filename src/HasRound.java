
public class HasRound implements State {

	Weapon weapon;
	 
	public HasRound(Weapon weapon) {
		this.weapon = weapon;
	}
  
	public void insertRound() {
		System.out.println("Cannot insert another round.");
	}
 
	public void ejectRound() {
		System.out.println("Round ejected.");
		weapon.setState(weapon.getNoRoundState());
	}
 
	public void pullTrigger() {
		System.out.println("Trigger pulled.");
		weapon.setState(weapon.getFireState());
	}

    public void fire() {
        System.out.println("No round fired.");
    }
    
    public void refillMagazine() { }
 
	public String toString() {
		return "Waiting for trigger to be pulled.";
	}
}
