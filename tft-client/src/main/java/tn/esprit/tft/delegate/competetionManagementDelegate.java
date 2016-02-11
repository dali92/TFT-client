package tn.esprit.tft.delegate;

import java.util.List;

import tn.esprit.tft.domain.Competition;
import tn.esprit.tft.locator.ServiceLocator;
import tn.esprit.tft.services.competetion.ManageCompetetionRemote;



public class competetionManagementDelegate {
	private static final String jndi="tft/ManageCompetetion!tn.esprit.tft.services.competetion.ManageCompetetionRemote";
    
	private static ManageCompetetionRemote getProxy(){
		return (ManageCompetetionRemote) ServiceLocator.getInstance().getProxy(jndi);
	}
	public static Boolean doAddCompetetion(Competition competition){
		return getProxy().addCompetetion(competition);
	}
	public static Boolean doupdateCompetetion(Competition competition){
		return getProxy().updateCompetetion(competition);
	}
	public static Boolean doDeleteCompetetion(Competition competition){
		return getProxy().deleteCompetetion(competition);
	}
	public static List<Competition> doFindAllCompetetion(){
		return getProxy().findAllCompetetions();
	}
}
