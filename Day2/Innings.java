
public class Innings {
	private String teamname;
	private String inningsname;
	private int runs;
	
	public void setTeamName(String name)
	{
		this.teamname=name;
	}
	public void setInningsName(String Inningsname)
	{
		this.inningsname=Inningsname;
	}
	public void setTeamRuns(int runs)
	{
		this.runs=runs;
		
	}
	public String getTeamName()
	{
		return this.teamname;
	}
	public String getInningsName()
	{
		return this.inningsname;
	}
	public int getRuns()
	{
		return this.runs;
	}
	public void displayInningsDetails()
	{
		System.out.println("Name:"+getTeamName());
		System.out.println("Scored:"+getRuns());
		if(getInningsName().equals("First"))
			System.out.println("Need "+(getRuns()+1)+" to win");
		else
			System.out.println("Match Ended");
	}
}
