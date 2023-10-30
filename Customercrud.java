package hibernate_demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_demo.dto.Customer;

public class Customercrud {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("radha");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public void saveCustomer(Customer customer) {
		et.begin();
		em.persist(customer);
		et.commit();
	}
	
	public void fetchCustomerByIdentifier(int id) {
       Customer db = em.find(Customer.class,id);
       if(db!=null)
    	   System.out.println(db);
       else
    	   System.out.println("id is not found to fetch the object");
	}
	
	public void updateCustomerById(Customer customer) {
		Customer db = em.find(Customer.class, customer.getId());
		if(db!=null) {
			et.begin();
			em.merge(customer);
			et.commit();
		}
		else
			System.out.println("id is not found to update");
		
	}
	
	public void deleteCustomerById(int id) {
		Customer db = em.find(Customer.class,id);
	       if(db!=null) {
	    	   et.begin();
	    	   em.remove(db);
	    	   et.commit();
	       }
	       else
	    	   System.out.println("id is not found to delete the object");
		}
	}
