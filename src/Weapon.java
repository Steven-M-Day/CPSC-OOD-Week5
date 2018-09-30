
public class Weapon {

	State spentMagazine;
	State noRound;
	State hasRound;
	State fire;
	State state;
	
	int count = 0;
 
	public Weapon(int numberRounds) {
		spentMagazine = new SpentMagazine(this);
		noRound = new NoRound(this);
		hasRound = new HasRound(this);
		fire = new Fire(this);

		this.count = numberRounds;
 		if (numberRounds > 0) {
			state = noRound;
		} else {
			state = spentMagazine;
		}
	}
 
	public void insertRound() {
		state.insertRound();
	}
 
	public void ejectRound() {
		state.ejectRound();
	}
 
	public void pullTrigger() {
		state.pullTrigger();
		state.fire();
	}
 
	void fireRound() {
		System.out.println("A round was fired!");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refillMagazine(int count) {
		this.count += count;
		System.out.println("Magazine refilled. Magazine capacity: " + this.count);
		state.refillMagazine();
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getSpentMagazineState() {
        return spentMagazine;
    }

    public State getNoRoundState() {
        return noRound;
    }

    public State getHasRoundState() {
        return hasRound;
    }

    public State getFireState() {
        return fire;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- Weapon Testing ----");
		result.append("\n");
		result.append("Weapon Model #4444");
		result.append("\n");
		result.append("Magazine capacity: " + count + " round");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Weapon " + state + "\n");
		return result.toString();
	}
}
