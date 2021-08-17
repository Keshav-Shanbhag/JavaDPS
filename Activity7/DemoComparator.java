import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public abstract class DemoComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		//Team o1,o2=new Team();
		//Comparator c1=(Team o1,Team o2)->o1.getName().compareTo(o2.getName());
		
		ArrayList<Team> a1=new ArrayList<Team>();
		a1.add(new Team("RCB"));
		a1.add(new Team("MI"));
		a1.add(new Team("KKR"));
		a1.add(new Team("RR"));
		a1.add(new Team("KIXP"));
		
		System.out.println("Team list Before sort"); 
		for(Team t1:a1)
		{
			System.out.println(t1.getName());
		}
		
		Collections.sort(a1, (p1,p2)->{return p1.getName().compareTo(p2.getName());});
		
		
		
		System.out.println("Team list after sort by number of matches");
		for(Team t1:a1)
		{
			System.out.println(t1.getName());
		}
		
		
		
	}

	

}
