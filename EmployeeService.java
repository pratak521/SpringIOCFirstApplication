package com.jbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empdao;
String[] getNamesData() throws Exception
{
	return empdao.getData();
}
}
