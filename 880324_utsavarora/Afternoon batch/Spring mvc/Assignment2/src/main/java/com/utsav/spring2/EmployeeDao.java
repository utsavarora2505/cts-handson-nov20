package com.utsav.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDao {
    @Autowired
	private DBConfig dbconfig;

	public DBConfig getDbconfig() {
		return dbconfig;
	}

	public void setDbconfig(DBConfig dbconfig) {
		this.dbconfig = dbconfig;
	}
    
    public void store() {
    	System.out.println("Inside store method of employeedao");
    	dbconfig.print();
    }
}
