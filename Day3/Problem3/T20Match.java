
public class T20Match extends Match{

	
	public T20Match(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		float rem_score=this.getTarget()-this.getCurrentscore();
		float run_rate=(rem_score/this.calculateBalls())*6;
		return run_rate;
		
	}

	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		int rem_over=(int) (20-this.getCurrentover());
		return rem_over*6;
		
	}

	@Override
	public void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		int rem_score=this.getTarget()-this.getCurrentscore();
		System.out.println("Requirements:");
		System.out.println("Need "+rem_score+" runs in "+balls+" balls");
		System.out.println("Required Runrate:"+reqRunrate);
	}

}
