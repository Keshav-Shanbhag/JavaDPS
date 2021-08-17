package Main;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import BO.EmployeeBO;
import Model.Employee;

public class EmployeeMain {

	public static void main(String[] args) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int ch;
		do{
		System.out.println("Enter Choice\n"
				+ "1.Insert\n2.Display\n3.Update\n4.Delete");
		ch=Integer.parseInt(scan.nextLine());
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter Employee Id");
			int e_id=Integer.parseInt(scan.nextLine());
			System.out.println("Enter Employee Name");
			String e_name=scan.nextLine();
			System.out.println("Enter Employee Designation");
			String e_designation=scan.nextLine();
			System.out.println("Enter Department id");
			int e_deptid=Integer.parseInt(scan.nextLine());
			System.out.println("Enter Joining Date");
			String date=scan.nextLine();
			
			Date join_date=Date.valueOf(date);
			
			Employee e=new Employee(e_id,e_name,e_designation,e_deptid,join_date);
			
			EmployeeBO eb=new EmployeeBO();
			boolean b=eb.insertEmployee(e);
			if(b==false)
			{
				System.out.println("Inserted Successfully");
			}
			else
			{
				System.out.println("Failed Insertion");
			}
			break;
			
		case 2:
			List<Employee> l1=new ArrayList<Employee>();
			EmployeeBO eb1=new EmployeeBO();
			l1=eb1.displayEmployee();
			for(Employee e1:l1)
			{
				System.out.println(e1);
			}
			break;
		case 3:
			System.out.println("Enter Employee Id to update");
			int e_id1=Integer.parseInt(scan.nextLine());
			System.out.println("Enter new Name:");
			String e_name1 =scan.nextLine();
			System.out.println("Enter new Designation");
			String designation1=scan.nextLine();
			System.out.println("Enter new Department ID");
			int dept_id1=Integer.parseInt(scan.nextLine());
			System.out.println("Enter new Joining Date");
			String date1=scan.nextLine();
			
			Date join_date1=Date.valueOf(date1);
			
			EmployeeBO eb2=new EmployeeBO();
			Employee e2=new Employee(e_id1,e_name1,designation1,dept_id1,join_date1);
			  boolean b1=eb2.updateEmployee(e2);
			  if(b1==false)
			  {
				  System.out.println("Updated Successfully");
			  }
			  break;
		case 4:
			System.out.println("Enter Employee Id to Delete");
			int e_id11=Integer.parseInt(scan.nextLine());
			EmployeeBO eb3=new EmployeeBO();
			boolean b11=eb3.deleteEmployee(e_id11);
			if(b11==false)
				{
					System.out.println("Deleted Successfully");
				}
			 break;
		default:
			System.out.println("Wrong Choice");
			
			
		}
	}while(ch!=0);
	}

}
