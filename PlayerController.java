package hibernate_2.controller;

import hibernate_2.dao.PlayerDao;
import hibernate_2.dto.Player;

public class PlayerController {

	public static void main(String[] args) {
		
	       PlayerDao player=new PlayerDao();
//	       player.savePlayer(new Player("kholi", 90.9, "india", "batsman"));
//	       player.fetchAllPlayer();
//	       player.fetchByName("kholi","india");
//	       player.fetchByName("dhoni");
	       
	       
	       Player dao=new Player();
	       dao.setId(1);
	       dao.setName("david");
	       
	       player.updatePlayer(dao);
	       
	       
	       
		   

	}
}
