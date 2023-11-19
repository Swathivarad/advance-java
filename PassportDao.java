package one_one_person.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_one_uni.dto.Passport;
import one_one_uni.dto.Person;

public class PassportDao {
	
	  EntityManager em=Persistence.createEntityManagerFactory("radha").createEntityManager();
	  EntityTransaction et=em.getTransaction();
	
	public void savePassport(Passport pass,int per_Id) {   //we are using per_id for identifier 
		Passport db=em.find(Passport.class, per_Id);   // we use this find method to find weather the id is present or not in the datebase..if it is null then the condition will execute
		if(db!=null) {
//			et.begin();
//			System.out.println(db);
//			Passport dbpass=em.merge(pass);   // instead of persist method we are using merge becoz persist method returns void
//			//mapping passport with person
//			System.out.println(db);
//			et.commit();
//			et.begin();
//			db.setPassport(dbpass);
//			em.merge(db);        //updation of  person is happening in database
//			et.commit();
			
			//instead of this we can also use
			et.begin();
			Passport dbpass=em.merge(pass);
			et.commit();
			
		}else
			System.out.println(per_Id+ "Person id doesnt exsist");
	}
	public void fetchPassport(int id) {
		Passport db = em.find(Passport.class, id);
		if(db!=null) {
			System.out.println(db);
		}else
			System.out.println("not exist");
	}
	public void deletePassport(int id) {
		Passport db = em.find(Passport.class, id);
		if(db!=null) {
		et.begin();
		em.remove(db);
		et.commit();
		}
		else {
			System.out.println("not exist");
		}
	}
	public void updatePassport(int id) {
		Passport db = em.find(Passport.class, id);
		if(db!=null) {
			et.begin();
			em.merge(db);
			et.commit();
		}
		else {
			System.out.println("not exist");
		}
		
	}
		
	
	


}
