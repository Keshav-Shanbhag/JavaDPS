import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Company c=new Company();
		String name,employees,teamlead;
		System.out.println("Enter the company name:");
		name=scan.nextLine();
		System.out.println("Enter the employees:");
		employees=scan.nextLine();
		System.out.println("Enter TeamLead");
		teamlead=scan.nextLine();
		
		c.setName(name);
		c.setEmployees(employees);
		c.setTeamlead(teamlead);
		
		String[] e1=c.getEmployees().split(",");
		int flag=0;
		for(String s1:e1)
		{
			if(s1.equals(c.getTeamlead()))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Name:"+c.getName());
			System.out.println("Employees:"+c.getEmployees());
			System.out.println("Lead:"+c.getTeamlead());
		}
		else
		{
			System.out.println("Invalid input.");
		}
	}

}
