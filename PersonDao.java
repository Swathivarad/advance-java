package one_one_person.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import one_one_uni.dto.Person;

public class PersonDao {

	EntityManager em=Persistence.createEntityManagerFactory("radha").createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void savePerson(Person person) {
		et.begin();
		em.persist(person);
		et.commit();
	}
	public void fetchPerson(int id) {
		Person db = em.find(Person.class, id);
		if(db!=null) {
			System.out.println(db);
		}else {
			System.out.println("not exist");
		}
	}
	public void deletePerson(int id) {
		Person db = em.find(Person.class, id);
		if(db!=null) {
		et.begin();
		em.remove(db);
		et.commit();
		}
		else {
			System.out.println("not exist");
		}
		
	}
	public void updatePerson(Person person) {
		Person db=em.find(Person.class,person.getId());
		if(db!=null) {
		   System.out.println(db);
 		   db.setName(person.getName());
 		   System.out.println(db);
 		   et.begin();
 		   em.merge(db);
 		   et.commit();
 	   }else
 		   System.out.println("id is not exist");
 	   }

		
	}


