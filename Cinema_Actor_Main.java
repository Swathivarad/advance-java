package many_many_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Persistence;

import many_many_uni.dao.ActorDao;
import many_many_uni.dao.CinemaDao;
import many_many_uni.dto.Actor;
import many_many_uni.dto.Cinema;

public class Cinema_Actor_Main {

	public static void main(String[] args) {
      ActorDao dao=new ActorDao();
//      dao.saveActor(new Actor("tamananah", 33, "female", "heroine"));
     
      dao.fetchAllBasedonCinemaId(1);
      
      
      
      
      
      
      
      CinemaDao crud=new CinemaDao();
//      crud.deleteCinema(3);
      
      
//      List<Integer>list=new ArrayList<Integer>();
//      list.add(1);
//      list.add(2);
//      list.add(3);
//      
//      crud.saveCinema(new Cinema("mirchi", 297492, "panindia","xyzz"), list);
//      
      

	}

}
