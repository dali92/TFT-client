package tn.esprit.tft.delegate;

import java.util.List;


import tn.esprit.tft.domain.Player;
import tn.esprit.tft.locator.ServiceLocator;
import tn.esprit.tft.services.player.ManagePlayerRemote;



public class playerManagementDelegate {
	
	private static final String jndi="tft/ManagePlayer!tn.esprit.tft.services.player.ManagePlayerLocal";
	
	private static ManagePlayerRemote getProxy(){
		return (ManagePlayerRemote) ServiceLocator.getInstance().getProxy(jndi);
	}
	
	public static Boolean doAddPlayer(Player player){
		return getProxy().addPlayer(player);
	}
	public static Boolean doUpdatePlayer(Player player){
		return getProxy().updatePlayer(player);
	}
	public static Boolean doDeletePlayer(Player player){
		return getProxy().deletePlayer(player);
	}
	public static List<Player> doFindAllPlayer(){
		return getProxy().findAllPlayers();
	}
}
