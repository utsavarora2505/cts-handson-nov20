package com.utsav.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx = new ClassPathXmlApplicationContext("com/utsav/spring2/Newfile2.xml");
EmployeeService service = (EmployeeService) ctx.getBean("employeeService");
service.store();
	}

}
