package com.mongoRest.MongoApi.model;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Restuarant {
	@Id
	String restid;
	String name;
	Map<String, String>Foods;
	Date dateCreated;
	public Map<String, String> getFoods() {
		return Foods;
	}
	public void setFoods(Map<String, String> foods) {
		Foods = foods;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	@Override
	public String toString() {
		return "Restuarant [restid=" + restid + ", name=" + name + ", Foods=" + Foods + ", dateCreated=" + dateCreated
				+ "]";
	}
	public Restuarant(String restid, String name, Map<String, String> foods, Date dateCreated) {
		super();
		this.restid = restid;
		this.name = name;
		Foods = foods;
		this.dateCreated = dateCreated;
	}
	public Restuarant(String restid, String name) {
		super();
		this.restid = restid;
		this.name = name;
	}
	public String getRestid() {
		return restid;
	}
	public void setRestid(String restid) {
		this.restid = restid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Restuarant() {
		
	}

}
