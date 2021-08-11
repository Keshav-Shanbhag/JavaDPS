import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the match format\n1. ODI\n2. T20\n3. Test");
		int ch=scan.nextInt();
		System.out.println("Enter the Current score");
		int score=scan.nextInt();
		System.out.println("Enter the current Over");
		float over=scan.nextFloat();
		System.out.println("Enter the Target Score");
		int target=scan.nextInt();
		if(ch==1)
		{
			ODIMatch o1=new ODIMatch(score, over, target);
			float run_rate=o1.calculateRunRate();
			System.out.println(run_rate);
			int rem_balls=o1.calculateBalls();
			o1.display(run_rate, rem_balls);
		}
		else if(ch==2)
		{
			T20Match t1=new T20Match(score, over, target);
			float run_rate=t1.calculateRunRate();
			int rem_balls=t1.calculateBalls();
			t1.display(run_rate, rem_balls);
		}
		else if(ch==3)
		{
			TestMatch t1=new TestMatch(score, over, target);
			float run_rate=t1.calculateRunRate();
			int rem_balls=t1.calculateBalls();
			t1.display(run_rate, rem_balls);
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
