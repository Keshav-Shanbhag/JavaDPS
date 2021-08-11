
public abstract class Match {
	private int currentscore;
	private float currentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public abstract float calculateRunRate(); 

	public abstract int calculateBalls();

	public abstract void display(double reqRunrate, int balls);
	
	public Match(int currentscore, float currentover, int target) {
		super();
		this.currentscore = currentscore;
		this.currentover = currentover;
		this.target = target;
	}
	
	
}
