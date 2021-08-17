package BO;

import java.sql.*;
import java.util.*;

import Configure.MyConfigure;
import Model.Employee;

public class EmployeeBO {
	public boolean insertEmployee(Employee e) throws SQLException
	{
		boolean b;
		Connection con=MyConfigure.getConnection();
		Statement s=con.createStatement();
		try{
			b=s.execute("insert into employee values("+e.getE_id()+",'"+e.getE_name()+"','"+e.getDesignation()+"',"+e.getDept_id()+",'"+e.getJoin_date()+"');");
			
		}
		catch(Exception e1)
		{
			b=true;
			System.out.println("Insertion Failed "+e1);
		}
		
		return b;
		
	}
	public List<Employee> displayEmployee() throws SQLException
	{
		List<Employee> l1=new ArrayList<Employee>();
		Connection con=MyConfigure.getConnection();
		PreparedStatement s1=con.prepareStatement("Select * from Employee");
		ResultSet rs=s1.executeQuery();
		
		while(rs.next())
		{
			l1.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4), rs.getDate(5)));
			
		}
		return l1;
		
	}
	public boolean deleteEmployee(int ID) throws SQLException
	{
		boolean b = false;
		Connection con=MyConfigure.getConnection();
		Statement s1=con.createStatement();
		try{
			b=s1.execute("Delete from Employee where ID="+ID+";");
		}
		catch(Exception e)
		{
			b=true;
			System.out.println("Deletion Failed"+e);
		}
		return b;
		
	}
	public boolean updateEmployee(Employee e) throws SQLException
	{
		Connection con=MyConfigure.getConnection();
		Statement s1=con.createStatement();
		boolean b;
		try{
			b=s1.execute("Update Employee SET Name='"+e.getE_name()+"',Designation='"+e.getDesignation()+"',Dept_id="+e.getDept_id()+",Join_Date='"+e.getJoin_date()+"' WHERE ID="+e.getE_id()+";");
		}
		catch(Exception e1){
			
			b=true;
			System.out.println("Update Failed"+e1);
		}
		
		
		return b;
		
	}
}

