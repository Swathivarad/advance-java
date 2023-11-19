package many_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_one_uni.dto.Company;

public class Companycrud {
	EntityManager em=Persistence.createEntityManagerFactory("radha").createEntityManager();
	  EntityTransaction et=em.getTransaction();
	  
	  public void saveCompany(Company company) {
		  et.begin();
		  em.persist(company);
		  et.commit();
		  
	  }
	  
	  
}
