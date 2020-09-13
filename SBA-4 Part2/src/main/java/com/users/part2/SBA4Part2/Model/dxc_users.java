package com.users.part2.SBA4Part2.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class dxc_users {
	
	@Id
   String user_id;
   String user_name;
   String password;
   String security_question;
   String security_answer;
public String getUser_id() {
	return user_id;
}
public void setUser_id(String user_id) {
	this.user_id = user_id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getSecurity_question() {
	return security_question;
}
public void setSecurity_question(String security_question) {
	this.security_question = security_question;
}
public String getSecurity_answer() {
	return security_answer;
}
public void setSecurity_answer(String security_answer) {
	this.security_answer = security_answer;
}
public dxc_users(String user_id, String user_name, String password, String security_question, String security_answer) {
	super();
	this.user_id = user_id;
	this.user_name = user_name;
	this.password = password;
	this.security_question = security_question;
	this.security_answer = security_answer;
}
@Override
public String toString() {
	return "dxc_users [user_id=" + user_id + ", user_name=" + user_name + ", password=" + password
			+ ", security_question=" + security_question + ", security_answer=" + security_answer + "]";
}
   
public dxc_users() {
	
}
}
