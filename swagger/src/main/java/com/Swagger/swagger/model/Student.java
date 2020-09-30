package com.Swagger.swagger.model;

public class Student {
	String name;
	int rollNo;
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getRollNo() {
	return rollNo;
	}
	public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
	}
	public Student(String name, int rollNo) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	}

	public Student() {
	// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
	return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

}
