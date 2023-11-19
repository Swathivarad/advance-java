package many_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_one_uni.dto.Employee;

public class Employecrud {

	EntityManager em=Persistence.createEntityManagerFactory("radha").createEntityManager();
	  EntityTransaction et=em.getTransaction();
	  
	  public void saveEmploye(Employee emp) {
		  et.begin();
		  em.persist(emp);
		  et.commit();
		  
	  }
	  public void fetchEmploye(int id) {
		  Employee db = em.find(Employee.class, id);
		  if(db!=null) {
			  System.out.println(db);
		  }
		  else {
			  System.out.println("id doesnt exist");
		  }
	  }
	  public void updateEmploye(int id) {
		  Employee db = em.find(Employee.class, id);
		  if(db!=null) {
			  et.begin();
			  System.out.println(db);
			  db.setDesignation("front end developer");
			  db.setName("shirisha");
			  em.merge(db);
			  System.out.println(db);
			  et.commit();
		  }else {
			  System.out.println("id doesnt exist");
		  }
	  }
	
}
