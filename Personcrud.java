package one_many_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_many_uni.dto.Person;

public class Personcrud {
	

	  EntityManager em=Persistence.createEntityManagerFactory("radha").createEntityManager();
	  EntityTransaction et=em.getTransaction();
  
	public void savePerson(Person person) {
		et.begin();
		em.persist(person);
		et.commit();
	}
	public void fetchPerson(int id) {
		Person db = em.find(Person.class,id );
		if(db!=null) {
			System.out.println(db);
		}else {
			System.out.println("id doesnt exist");
		}
		
	}
	public void updatePerson(int id) {
		Person db = em.find(Person.class, id);
		if(db!=null) {
			System.out.println(db);
			db.setName("hema");
			System.out.println(db);
			et.begin();
			em.merge(db);
			et.commit();
		}else {
			System.out.println("id doesnt exist");
		}
	}
	public void deletePerson(int id) {
		Person db=em.find(Person.class, id);
		if(db!=null) {
			System.out.println(db);
			et.begin();
			em.remove(db);
			et.commit();
		}else {
			System.out.println("id doesnt exist");
		}
	}
	
}
