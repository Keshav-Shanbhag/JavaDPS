import java.util.HashSet;
import java.util.Scanner;

public class PlayersSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		
		HashSet<String> h1=new HashSet<String>();
		for(int i=0;i<n;i++)
		{
			
			h1.add(scan.nextLine());
			
		}
		System.out.println(h1);
		System.out.println(h1.size());
		
		
	}

}
