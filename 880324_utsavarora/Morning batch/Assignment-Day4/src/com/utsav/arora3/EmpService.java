package com.utsav.arora3;
import java.util.*;
public interface EmpService {
public void add(int id, String dob,String name,double salary);
	
	public List findEmployeeById(int id);
	
	public List getEmployees();
	
	public List getSortedEmployeesById();
	
	public List getSortedEmployeesBySalary();
	
	public List getSortedEmployeesByName();
}
