package one_one_uni.controller;

import java.sql.Date;

import javax.persistence.Persistence;
import one_one_person.dao.PassportDao;
import one_one_person.dao.PersonDao;
import one_one_uni.dto.Passport;
import one_one_uni.dto.Person;

public class Person_passport_Main{

	public static void main(String[] args) {
		
		PersonDao dao=new PersonDao();
//		
//	    dao.savePerson(new Person("pooja", "poo@gmail.com",8738710,"hyd"));
//		dao.fetchPerson(3);  //we get person and passport at a time
//		dao.deletePerson(1);//to delete person object from person as well as passport object 
//		 Person pp=new Person();
//	       pp.setId(3);
//	       pp.setName("swathivarad");
//	       dao.updatePerson(pp);
		
//		
//		PassportDao pass=new PassportDao();
////		pass.fetchPassport(1);//to delete only passport 
////		pass.deletePassport(3);
//		Passport ps=new Passport();
//		ps.setId(3);
//		ps.setName("swathivarad");
//		ps.setPass_Num(78647278);
		
//	
//		PersonDao dao=new PersonDao();
//		Person person=new Person("swathi","s@gmail.com", 292947,"gutta");
//		Date date=Date.valueOf("2001-08-11");
		
//		person.setPassport(new Passport("swathi", 24836, "INDIA", date));
//		System.out.println(person);
//		dao.savePerson(person);
		
		
//		Date date=Date.valueOf("2001-08-11");
//		dao.savePassport(new Passport("pooja",82378,"INDIA", date),1);

	}

}

