import java.util.Scanner;

public class Problem4 {
	
	static void highestFeedBack(int medical[],int healthcare[],int size)
	{
		for(int i=0;i<size;i++)
		{
			feedback[i]=max(medical[i],healthcare[i]);
		}
		
	}
	public static int max(int i, int j) {
		// TODO Auto-generated method stub
		if(i>j)
			return i;
		else
			return j;
		
	}
	static int feedback[]=new int[20];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int health[]=new int[20];
		int medical[]=new int[20];
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		N=scan.nextInt();
		if(N<0)
		{
			System.out.println("Invalid array size");return;
			
		}
		else
		{
			for(int i=0;i<N;i++)
			{
				medical[i]=scan.nextInt();
				if(medical[i]<0)
				{ System.out.println("Invalid input");
				return;
				}
		    }
			for(int i=0;i<N;i++)
			{
				health[i]=scan.nextInt();
				if(health[i]<0)
				{ System.out.println("Invalid input");
				return;
				}
		    }
			highestFeedBack(medical,health,N);
			for(int i=0;i<N;i++)
			{
				System.out.println(feedback[i]);
			}
		}
		scan.close();
		
	}
}
