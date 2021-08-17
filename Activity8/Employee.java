package Model;

import java.sql.Date;
import java.time.LocalDate;

public class Employee {
	private int e_id;
	private String e_name;
	private String designation;
	private int dept_id;
	private Date join_date;
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public Employee(int e_id, String e_name, String designation, int dept_id, Date date) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.designation = designation;
		this.dept_id = dept_id;
		this.join_date = date;
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", designation=" + designation + ", dept_id=" + dept_id
				+ ", join_date=" + join_date + "]";
	}
	
	
	
}
