import java.util.Scanner;

public class Problem3 {
	static int productDigits(int num)
	{
		int product=1;
		while(num!=0)
		{
			int rem=num%10;
			product=product*rem;
			num=num/10;
		}
		return product;
		
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num<0||num>32767)
		{
			System.out.println("Invalid Input");return;
		}
		else
		{
			int prod=productDigits(num);
			System.out.println(prod);
		}
		scan.close();
	}
	

}
