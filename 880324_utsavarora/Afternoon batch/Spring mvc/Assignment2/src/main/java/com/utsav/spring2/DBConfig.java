package com.utsav.spring2;

import org.springframework.stereotype.Repository;

@Repository
public class DBConfig {
	private String dbname;
	private String dbpassword;
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	public String getDbpassword() {
		return dbpassword;
	}
	public void setDbpassword(String dbpassword) {
		this.dbpassword = dbpassword;
	}
	@Override
	public String toString() {
		return "DBConfig [dbname=" + dbname + ", dbpassword=" + dbpassword + "]";
	}
	public void print() {
		System.out.println("hey, I am a method of dbconfigclass");
	}

}
