import java.util.Scanner;

public class Problem1 {
	public static double calculateSal(int salary, int shifts)
	{
		double savings = 0;
		
		double food_expenses=0.2*salary;
		double travel_expenses=0.3*salary;
		double shift_savings=0.02*shifts*salary;
		savings=salary-food_expenses-travel_expenses+shift_savings;
		return savings;
		
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Salary of Ramya");
		Scanner scan=new Scanner(System.in);
		int salary=scan.nextInt();
		if(salary>8000)
		{
			System.out.println("Salary too large");
			return;
		}
		else
		{
			if(salary<0)
			{
				System.out.println("Salary too small");
				return;
			}
			else
			{
				int shifts=scan.nextInt();
				if(shifts<=0)
				{
					System.out.println("Shift too small");
					return;
				}
				else
				{
					double savings=calculateSal(salary,shifts);
					if(savings>0)
					{
						System.out.println((int)savings);
					}
				}
			}
		}
		scan.close();

	}

}
