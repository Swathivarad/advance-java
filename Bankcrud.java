package one_many_uni.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_many_uni.dto.BankAccount;
import one_many_uni.dto.Person;


public class Bankcrud {
	
	  EntityManager em=Persistence.createEntityManagerFactory("radha").createEntityManager();
	  EntityTransaction et=em.getTransaction();
	  
	public void saveBank(BankAccount bank,List<Integer>list) {
		for(Integer id:list) {
		Person db=em.find(Person.class,id);
		if(db!=null) {
			List<BankAccount>blist=new ArrayList<BankAccount>();
			blist.add(bank);
			blist.addAll(db.getAccounts());
			db.setAccounts(blist);

			et.begin();
			em.persist(bank);
			et.commit();
		}else {
			System.out.println("BankAccount not available");
		}}
	}
		
		public void fetchBank(int id) {
		BankAccount db = em.find(BankAccount.class,id );
		if(db!=null) {
			System.out.println(db);
		}else {
			System.out.println("id doesnt exist");
		}
		
	}
//	public void updateBank(int id) {
//		BankAccount db = em.find(BankAccount.class, id);
//		if(db!=null) {
//			System.out.println(db);
//			db.setIfsc("SBI3838");
//			
//			System.out.println(db);
//			et.begin();
//			em.merge(db);
//			et.commit();
//		}else {
//			System.out.println("id doesnt exist");
//		}
//	}
	public void deleteBank(int id) {
		BankAccount db=em.find(BankAccount.class, id);
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
