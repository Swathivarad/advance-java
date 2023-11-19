package many_many_uni.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_many_uni.dto.Actor;
import many_many_uni.dto.Cinema;

public class CinemaDao {
	EntityManager em = Persistence.createEntityManagerFactory("radha").createEntityManager();
	EntityTransaction et=em.getTransaction();

	public void saveCinema(Cinema cinema,List<Integer>list) {
		//to check whether actor is present or not
    
//    	for(Integer id:list) { 
//    		Actor db=em.find(Actor.class, id);//list of id we are checking
//    		if(db!=null) {
//    			//mapping cinema with actor
//    			List<Cinema>clist=new ArrayList<Cinema>();
//    			clist.add(cinema);
//    			clist.addAll(db.getCinemas());
//    			db.setCinemas(clist);
//    			//adding cinema
//    	       et.begin();
//    	       em.persist(cinema);
//              	et.commit();
//    		}else
//    			System.out.println("actor not available");
//    }
	}
    	
//    	public void deleteCinema(Cinema cinema) {
//    		ActorDao dao=new ActorDao();
//    		List<Actor>list=dao.fetchAll();
//    		if(list!=null) {
//    			for(Actor actor :list) {
//    				List<Cinema>cinemas=actor.getCinemas();
//    				for(Cinema cin :cinemas) {
//    					if(cin.getId()==id) {
//    						Cinema db=em.find(Cinema.class,id);
//    						actor.setCinemas(null);
//    						et.begin();
//    						em.merge(actor);
//    						em.remove(db);
//    						et.commit();
//    					}
//    					return;
//    				}
//    			}
//    		}else {
//    			System.out.println("not exist");
//    		}
//    		
//    		
//    	}
	
	
	public void deleteCinema(int id) {
		
		Cinema db = em.find(Cinema.class, id);
		if(db!=null) {
			et.begin();
			em.remove(db);
			et.commit();
		}
		else {
			System.out.println("id not found");
		}
	}
	


}
