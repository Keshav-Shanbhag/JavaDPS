import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		ArrayList<Team> a1=new ArrayList<Team>();
		
		System.out.println("Enter number of teams:");
		int n=Integer.parseInt(scan.nextLine());
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter team "+i+" detail");
			System.out.println("Enter Name");
			String name=scan.nextLine();
			System.out.println("Enter number of matches");
			long numofmatches=Long.parseLong(scan.nextLine());
			
			a1.add(new Team(name,numofmatches));
		}
		System.out.println("Team list Before sort"); 
		for(Team t1:a1)
		{
			System.out.println(t1.getName()+"-"+t1.getNumberOfMatches());
		}
		
		Collections.sort(a1, new TeamComparator());
		System.out.println("Team list after sort by number of matches");
		for(Team t1:a1)
		{
			System.out.println(t1.getName()+"-"+t1.getNumberOfMatches());
		}
		
		Collections.reverse(a1);
		System.out.println("Team list after sort desc by number of matches");
		for(Team t1:a1)
		{
			System.out.println(t1.getName()+"-"+t1.getNumberOfMatches());
		}
	}

}
