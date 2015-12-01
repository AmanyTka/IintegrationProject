package com.esprit;

import java.util.Arrays;
import java.util.List;

import com.esprit.exception.CouldNotStartException;
/**
 * cette classe decrit une implementation d'une voiture
 * @author Ahmado
 *
 */
public class Car {
/**
 * injection d'un SMSModule
 */
	//ahmed test 2
	//ahmed test jinkines+nexus 
	// wafa modification 
	//test nexus
	SMSModule smsModule;
	
	private boolean started=false;
	/**
	 * 
	 * @param direction direction des cles
	 */
	public void turnKey(String direction) {
		
		
		List<String> directionValues=Arrays.asList("RIGHT","LEFT");
		
		
		if(!directionValues.contains(direction)){
			if(smsModule.isReady())
			{
				
			    try{	
				smsModule.send("00216555888", "ALARM");
			    }catch(IllegalArgumentException e){
			    	System.out.println("Num tel obligatoire..");
			    }
				
			}
			
			throw new CouldNotStartException();
			}
		
		if("RIGHT".equals(direction)){started=true;};
		if("LEFT".equals(direction)){started=false;};
		
		
		
	}

	public boolean isStarted() {
		// TODO Auto-generated method stub
		return started;
	}

}
