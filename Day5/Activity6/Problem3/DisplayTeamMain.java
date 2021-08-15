import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class DisplayTeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		HashMap<String,Team2> map=new HashMap<String,Team2>();
		int n=Integer.parseInt(scan.nextLine());
		for(int i=0;i<n;i++)
		{
			String s1=scan.nextLine();
			String s2[]=s1.split("\\|");
			String teamName=s2[0];
			String PlayerName=s2[1];
			
			if(map.containsKey(teamName)){
				Team2 obj=map.get(teamName);
				obj.addPlayer(PlayerName);
			}
			else
			{
				Team2 obj=new Team2(teamName);
				obj.addPlayer(PlayerName);
				map.put(teamName, obj);
			}
			
			
		}
		System.out.println("Team and Players in ascending order");
		for (Entry<String, Team2> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			
			for (Player2 playerName : entry.getValue().getPlayerList()) {
				System.out.println("--"+playerName.getName());
			}
			
		}
		
	}

}
