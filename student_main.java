package student.controller;

import java.util.Scanner;


import student.dao.studentcrud;
import student.dto.studentdetails;

public class student_main {

	public static void main(String[] args) throws Exception {
		student.dao.studentcrud studentcrud=new studentcrud();
		studentcrud.createTable();
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the email");
		String email=sc.next();
		System.out.println("enter the password");
		String password=sc.next();
		System.out.println("enter the phoneno");
		long phoneno=sc.nextLong();
//	    studentdetails student=new studentdetails(id,name,email,password,phoneno);
//	    studentcrud.insert(student);
//		studentdetails student=new studentdetails(id, name, email, password, phoneno);
//		studentcrud.update(student);
		studentdetails student=new studentdetails(id, name, email, password, phoneno);
		studentcrud.delete(student);
	    
		System.out.println("Doneee...");
		
		
		
		
		
		
		
		}

}
