package com.myserv.app.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Scientist {
	@Id
	String sid;
	String sname;
	Date DOB;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public Date getDOB() {
		return DOB;
	}
	public Scientist(String sname, String sid, Date dOB) {
		super();
		this.sname = sname;
		this.sid = sid;
		DOB = dOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Scientist [sname=" + sname + ", sid=" + sid + ", DOB=" + DOB + "]";
	}
	public Scientist() {
		
	}

}
