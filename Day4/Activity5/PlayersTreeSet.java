import java.util.Scanner;
import java.util.TreeSet;

public class PlayersTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		
		TreeSet<String> t1=new TreeSet<String>();
		for(int i=0;i<n;i++)
		{
			
			t1.add(scan.nextLine());
			
		}
		for(String s1:t1){
			System.out.println(s1);
		}
		
	}

}
