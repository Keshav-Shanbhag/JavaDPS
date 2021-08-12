import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		try{
		System.out.println("Enter the number of overs");
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the number of runs for each over");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the over number");
		int over=scan.nextInt();
		//Runs scored in this over : 15
		System.out.println("Runs scored in this over : "+arr[over-1]);
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
		}
	}

}
