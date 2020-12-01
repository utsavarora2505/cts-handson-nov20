package com.utsav.arora9;

public class EmployeeService {

	private EmployeeDao employeedao;

	public EmployeeDao getEmployeedao() {
		return employeedao;
	}

	public void setEmployeedao(EmployeeDao employeedao) {
		this.employeedao = employeedao;
	}
	
	public void store() {
		System.out.println("Calling store method of employeeservice");
		employeedao.store();
	}
}
