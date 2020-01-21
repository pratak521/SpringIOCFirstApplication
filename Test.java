package com.jbk;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api")
public class Test {
@RequestMapping("msg")
	public String[] add()throws IOException
	{
		
		 String xx[] = {"Pravin", "Ganesh","Mayur"};
		 return xx;
	}
//	@RequestMapping(value="/msg2")
//	public int sub()
//	{
//		s2 = new Scanner(System.in);
//		
//		int a=s2.nextInt();
//		int b=s2.nextInt();
//		return a-b;
//	}
////	@RequestMapping(value="/msg")
////	public String msg()
////	{
////		Scanner s3 = new Scanner(System.in);
////		String mymsg=s3.nextLine();
////		return mymsg;
////	}
////	

}
