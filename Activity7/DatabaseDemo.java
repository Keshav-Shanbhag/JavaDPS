package jdbcExample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseDemo {
  public static void main(String[] args) throws SQLException
  {
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root", "Suviksha1997@");
	  Statement s=con.createStatement();
	  Scanner scan=new Scanner(System.in);
	  int ch;
	  do{
	  System.out.println("Enter Choice\n1.Insert\n2.Display\n3.Update\n4.Delete\n");
	  ch=Integer.parseInt(scan.nextLine());
	  switch(ch)
	  {
	  
	  case 1://Insert
		  
		  System.out.println("Enter Employee Id");
		  int e_id=Integer.parseInt(scan.nextLine());
		  System.out.println("Enter Employee Name");
		  String e_name=scan.nextLine();
		  System.out.println("Enter Employee Designation");
		  String e_designation=scan.nextLine();
		  System.out.println("Enter Department id");
		  int e_deptid=Integer.parseInt(scan.nextLine());
	  
		  boolean b=s.execute("insert into employee values("+e_id+",'"+e_name+"','"+e_designation+"',"+e_deptid+")");
		  if(b==false)
		  {
			  System.out.println("Inserted Successfully");
		  }
		  break;
	  case 2://Display
		  PreparedStatement s1=con.prepareStatement("select * from employee");
		  ResultSet rs=s1.executeQuery();
		  System.out.println("Employee ID||Employee Name||Designation||Department ID||");
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1)+"  ||  "+rs.getString(2)+"  ||  "+rs.getString(3)+"  ||  "+rs.getInt(4)+"  ||");
		  }
		  break;
		  
	  case 3://Update
		  System.out.println("Enter Employee Id to update");
		  int e_id1=Integer.parseInt(scan.nextLine());
		  System.out.println("Enter new Name:");
		  String e_name1 =scan.nextLine();
		  System.out.println("Enter new Designation");
		  String designation1=scan.nextLine();
		  System.out.println("Enter new Department ID");
		  int dept_id1=Integer.parseInt(scan.nextLine());
		  String s11="UPDATE employee SET Name='"+e_name1+"',Designation='"+designation1+"',Dept_ID="+dept_id1+" where ID="+e_id1+";";
				  //"UPDATE employee SET Name='"+e_name1+"',Designation='"+designation1+"',Dept_ID="+dept_id1+"where ID="+e_id1+";");
		  
		  boolean b1=s.execute(s11);
		  if(b1==false)
		  {
			  System.out.println("Updated Successfully");
		  }
		  break;
		  
		  
		   
	  case 4://Delete
		  System.out.println("Enter Employee Id to Delete");
		  int e_id11=Integer.parseInt(scan.nextLine());
		  boolean b11=s.execute("DELETE FROM employee where ID="+e_id11);
		  if(b11==false)
		  {
			  System.out.println("Deleted Successfully");
		  }
		  break;
	default:
		System.out.println("Sorry Wrong Choice");break;
		  
		  
		  
	  }
	  
	  }while(ch>0);
}
}
