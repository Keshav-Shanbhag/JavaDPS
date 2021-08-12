import java.util.ArrayList;
import java.util.Scanner;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		ArrayList<String> s1=new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		for(int i=1;i<=5;i++)
		{
			String s2=scan.nextLine();
			s1.add(s2);
		}
		//System.out.println(s1);
		ArrayList<String> s3=new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=1;i<=5;i++)
		{
			String s2=scan.nextLine();
			s3.add(s2);
		}
		//System.out.println(s3);
		s1.retainAll(s3);
		
		System.out.println("Consistent run scorers");
		//System.out.println(s1);
		for(String s:s1){
		System.out.println(s);
		}
		
	}

}
