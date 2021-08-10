import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the details:");
		String input=scan.nextLine();
		String[] s1=input.split(",");
		String name=s1[0];
		String address=s1[1];
		String mobile=s1[2];
		
		
		
		c1.setName(name);
		c1.setAddress(address);
		c1.setMobile(mobile);
		
		
		System.out.println("Name:"+c1.getName());
		System.out.println("Address:"+c1.getAddress());
		System.out.println("Mobile:"+c1.getMobile());
	}

}
