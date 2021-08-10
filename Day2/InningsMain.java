import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Innings i1=new Innings();
		
		String team_name,Innings_name;
		int runs;
		
		System.out.println("Enter the team name:");
		team_name=scan.nextLine();
		
		System.out.println("Enter session:");
		Innings_name=scan.nextLine();
		
		System.out.println("Enter runs");
		runs=scan.nextInt();
		
		i1.setTeamName(team_name);
		i1.setInningsName(Innings_name);
		i1.setTeamRuns(runs);
		i1.displayInningsDetails();
		
		
	}

}
