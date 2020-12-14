package com.utsav.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
private EmployeeDao employeedao;

	public EmployeeDao getEmployeedao() {
		return employeedao;
	}

	public void setEmployeedao(EmployeeDao employeedao) {
		this.employeedao = employeedao;
	}
	public void store() {
		System.out.println("Hi, I am a metho of the service class");
		employeedao.store();
	}
}
