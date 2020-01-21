package com.jbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmplyeeController {
	@Autowired
	EmployeeService empservice;
	@RequestMapping("getNameData") 
	String[] getNames() throws Exception
	{
//		System.out.println(1234);
//		System.out.println(empservice);
//		String xx[]= {"Pravin","Ganesh"};
		return empservice.getNamesData();
	}

}
