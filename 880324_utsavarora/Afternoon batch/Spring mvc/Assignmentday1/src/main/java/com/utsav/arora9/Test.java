package com.utsav.arora9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile.xml");
EmployeeService emp = (EmployeeService) ctx.getBean("employeeserve");

emp.store();
	}

}
