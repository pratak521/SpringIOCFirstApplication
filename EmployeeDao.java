package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class EmployeeDao {
	String xx[]= {"Ganesh","Pravin"};
	//xx=new String[2];

	String[] getData() // db caller
	{
		
//		try {
//			System.out.println(1);
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println(1);
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("Select * from student");
//			System.out.println(2);
//			while (rs.next()) {
//				int no = rs.getInt(0);
//				String name = rs.getString(1);
//				String city = rs.getString(2);
//				System.out.println(3);
//				String xx[] = { name, city };
//
//			}
//			System.out.println(4);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		 
		return xx;  
	}
}
