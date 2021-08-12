import java.util.Scanner;

public class TeamMain {
	
	public static boolean searchString(String sample)
	{
		String s1[]={"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals",
				"Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians",
				"Rajasthan Royals","Royal Challengers Bangalore"};
		int k=0;
		//System.out.println(sample);
		for(int i=0;i<s1.length;i++)
		{
			//System.out.println(s1[i]);
			if(sample.equals(s1[i]))
			{
				//System.out.println(sample);
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
		try{
		System.out.println("Enter the expected winner team of IPL Season 13");
		String winner=scan.nextLine();
		
		if(searchString(winner)){
			throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
		}
		
		System.out.println("Enter the expected runner Team of IPL Season 13");
		String runner=scan.nextLine();
		if(searchString(runner)){
			throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
		}
		else{
			System.out.println("Expected IPL Season 13 winner: "+winner);

			System.out.println("Expected IPL Season 13 runner: "+runner);
		}
		
		}
		catch(TeamNameNotFoundException e)
		{
			System.out.println(e);
		}
			
		
		
		
	}

}
