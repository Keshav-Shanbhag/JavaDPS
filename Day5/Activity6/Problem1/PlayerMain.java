import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please provide the number of players to be registered");
		int n=Integer.parseInt(scan.nextLine());
		String s1[]={"All Rounder","Batsman","Bowler"};
		ArrayList<Player> a1=new ArrayList<Player>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Please enter player name");
			String name=scan.nextLine();
			System.out.println("Please select the skill of the player\n"+
								"1.All Rounder\n"+
								"2.Batsman\n"+
								"3.Bowler\n");
			int ch=Integer.parseInt(scan.nextLine());
			String skill=s1[ch-1];
			a1.add(new Player(name,skill));
			
		}
		System.out.println("Before Sorting");
		for(Player p1:a1){
			System.out.println("Player : "+p1.getName()+" : "+p1.getSkill());
		}
		
		Collections.sort(a1,new PlayerComparator()); 
		
		System.out.println("Player Details");
		for(Player p1:a1){
			System.out.println("Player : "+p1.getName()+" : "+p1.getSkill());
		}
	}

}
