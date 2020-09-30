package com.eureka.SubScriber.ESubscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.eureka.SubScriber.ESubscriber.Model.Employee;

@RestController
public class SubscriberController {
	@Autowired
	RestTemplate rest;
	@RequestMapping(value="/getemp")
	public Employee getemp() {
		Employee emp=rest.getForObject("http://pub/getemployee",Employee.class);
		return emp;
	}

}
