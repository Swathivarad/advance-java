package hibernate_2.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_2.dto.Player;

public class PlayerDao {
           EntityManagerFactory emf=Persistence.createEntityManagerFactory("radha");
           EntityManager em=emf.createEntityManager();
           EntityTransaction et=em.getTransaction();
           
           public void savePlayer(Player player) {
        	   et.begin();
        	   em.persist(player);
        	   et.commit();
           }
//           public void fetchAllPlayer() {
//        	  Query query = em.createQuery("select p from Player p");
//        	  List<Player> list = query.getResultList();
//        	  System.out.println(list);   
//           }
           //name based
//           public void fetchByName(String name,String country) {
//        	  Query query = em.createQuery("select a from Player a where name=?1 and country=?2");
//        	  query.setParameter(1,name);
//        	  query.setParameter(2, country);
//        	  Player db=(Player) query.getSingleResult();
//        	  System.out.println(db);
//           }
           //based on position
//           public void fetchByName(String Name) {
//        	   Query query = em.createQuery("select a from Player a where name=:key");
//        	   query.setParameter("key", Name);
//        	   Player db = (Player) query.getSingleResult();
//        	   System.out.println(db);
//           }
//	
	//updating using particular value
           public void updatePlayer(Player player) {
        	   Player db=em.find(Player.class, player.getId());
        	   if(db!=null) {
        		   System.out.println(db);
        		   db.setName(player.getName());
        		   System.out.println(db);
        		   et.begin();
        		   em.merge(db);
        		   et.commit();
        	   }else
        		   System.out.println("id is not exist");
        	   }
	
}
