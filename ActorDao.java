
package many_many_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import many_many_uni.dto.Actor;




public class ActorDao {
	
	EntityManager em=Persistence.createEntityManagerFactory("radha").createEntityManager();
    EntityTransaction et=em.getTransaction();
    
    public void saveActor(Actor actor) {
    	et.begin();
    	em.persist(actor);
    	et.commit();
    }
    public List<Actor>fetchAllBasedonCinemaId(int id){
    	Query query = em.createQuery("select b from Actor b join b.cinemas a where a.id=:id");
    	query.setParameter("id", id);
    	return query.getResultList();
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<Actor> fetchAll() {
    	Actor db = em.find(Actor.class, em);
		return null;
    	
    }
    public void fetchActor(int id) {
    	Actor db = em.find(Actor.class, id);
		  if(db!=null) {
			  System.out.println(db);
		  }
		  else {
			  System.out.println("id doesnt exist");
		  }
    }
    public void updateActor(int id) {
    	Actor db=em.find(Actor.class, id);
		  if(db!=null) {
			  et.begin();
			  System.out.println(db);
			  db.setRole("main actor");
			  db.setName("shirisha");
			  em.merge(db);
			  System.out.println(db);
			  et.commit();
		  }else {
			  System.out.println("id doesnt exist");
		  }
    }
    public void deleteActor(int id) {
    	Actor db=em.find(Actor.class, id);
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





