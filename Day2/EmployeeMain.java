import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=scan.nextLine();
		System.out.println("Enter Address:");
		String address=scan.nextLine();
		System.out.println("Enter Mobile:");
		String mobile=scan.nextLine();
		e1.setName(name);
		e1.setAddress(address);
		e1.setMobile(mobile);
		
		System.out.println("Employee Details");
		System.out.println("Name:"+e1.getName());
		System.out.println("Address:"+e1.getAddress());
		System.out.println("Mobile:"+e1.getMobile());
		int ch=1;
		do
		{
		System.out.println("\nVerify and Update the details:\nMenu"
				+ "\n1. Update Employee name"
				+ "\n2. Update Employee Address"
				+ "\n3. Update Employee mobile"
				+ "\n4. All information correct/Exit");
		ch=scan.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Current Name:"+e1.getName());
			System.out.println("Enter Name:");
			name=scan.next();
			e1.setName(name);
			break;
		case 2:	
			System.out.println("Current Address"+e1.getAddress());
			System.out.println("Enter Address:");
			address=scan.next();
			e1.setAddress(address);
			break;
		case 3:	
			System.out.println("Current Mobile:"+e1.getMobile());
			System.out.println("Enter Mobile:");
			mobile=scan.next();
			e1.setMobile(mobile);
			break;
		case 4:
			break;
		

		}
		}while(ch!=4);

		System.out.println("Employee Details");
		System.out.println("Name:"+e1.getName());
		System.out.println("Address:"+e1.getAddress());
		System.out.println("Mobile:"+e1.getMobile());
		
	}

}
