package com.mongoRest.MongoApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongoRest.MongoApi.dao.RestuarantDao;
import com.mongoRest.MongoApi.model.Restuarant;
@CrossOrigin
@RestController
public class Resturantcontroller {
	@Autowired
	RestuarantDao dao;
	
	@PostMapping("saverest")
	public Restuarant saveRestuarant(@RequestBody Restuarant restuarant)
	{
	return dao.saveRestuarant(restuarant);
	}
	 @GetMapping("rest")
	 public List<Restuarant> getRestuarants(){
		return dao.getAll();	 
	 }
	 
	 @GetMapping("rest/{restId}")
	 public Restuarant getRestuarant(@PathVariable String restId)
	 {

	 return dao.getRest(restId);

	 }



}
