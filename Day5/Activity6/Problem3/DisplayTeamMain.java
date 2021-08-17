import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

public class DisplayTeamMain {
	public static int ListContainsObject(ArrayList<Team2> hs1,String s1)
	{
		for(Team2 obj1:hs1)
		{
			if(obj1.getName().equals(s1))
			{
				return 1;
			}
		}
		return 0;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		ArrayList<Team2> ts1=new ArrayList<Team2>();
		//HashMap<String,Team2> map=new HashMap<String,Team2>();
		//HashSet<Team2> ts1=new HashSet<Team2>();
		int n=Integer.parseInt(scan.nextLine());
		for(int i=0;i<n;i++)
		{
			String s1=scan.nextLine();
			String s2[]=s1.split("\\|");
			String teamName=s2[0];
			String PlayerName=s2[1];
			
			Team2 t1=new Team2(teamName);
			
			if(ListContainsObject(ts1,teamName)==1)
			{	
				for(Team2 obj1:ts1)
				{
					if(obj1.getName().equals(teamName))
					{
					
						obj1.addPlayer(PlayerName);
						break;
					}
				}
			}
			else
			{		
					t1.addPlayer(PlayerName);
					ts1.add(t1);
			}
			
		}
		Collections.sort(ts1);
		System.out.println("Team and Players in ascending order");
		for (Team2 obj1:ts1) {
			System.out.println(obj1.getName());
			
			for (Player2 playerName : obj1.getPlayerList()) {
				System.out.println("--"+playerName.getName());
			}
			
		}
		
	}

}
