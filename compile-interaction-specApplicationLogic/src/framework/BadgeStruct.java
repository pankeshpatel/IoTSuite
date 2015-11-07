package framework;

import java.io.Serializable;

public class BadgeStruct implements Serializable {    
	private static final long serialVersionUID = 1L;	
	

    	
    		private String badgeID; 		
    	
    	public String getbadgeID() {
            return badgeID;
        }    
     			

    	
    		private String badgeEvent; 		
    	
    	public String getbadgeEvent() {
            return badgeEvent;
        }    
     			

  
	public BadgeStruct (String badgeID, String badgeEvent) 
	{ 

		this.badgeID = badgeID;
		this.badgeEvent = badgeEvent;
    }
}