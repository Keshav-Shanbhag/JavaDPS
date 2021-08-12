import java.util.ArrayList;
import java.util.Scanner;

public class GayleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		ArrayList<Integer> i1=new ArrayList<Integer>();
		int count_50=0;
		int count_100=0;
		for(int i=1;i<=n;i++)
		{
			int a=scan.nextInt();
			i1.add(a);
			if(a>=50 && a<100)
			{
				count_50++;
			}
			if(a>=100)
			{
				count_100++;
			}
		}
		System.out.println(count_50);
		
		System.out.println(count_100);
	}
}
