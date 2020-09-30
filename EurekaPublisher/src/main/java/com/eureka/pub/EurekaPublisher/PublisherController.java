package com.eureka.pub.EurekaPublisher;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.pub.EurekaPublisher.Model.Employee;

@RestController
public class PublisherController {

	@RequestMapping(value="/getemployee")
	public Employee getEmployee() {
		
		return new Employee("vengalrao",80000);
	}
}
