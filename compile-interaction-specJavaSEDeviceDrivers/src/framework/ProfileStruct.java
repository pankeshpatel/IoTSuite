package framework;

import java.io.Serializable;

public class ProfileStruct implements Serializable {    
	private static final long serialVersionUID = 1L;	
	

    	
    		private String badgeID; 		
    	
    	public String getbadgeID() {
            return badgeID;
        }    
     			

    	
    		private double tempValue; 		
    	
    	public double gettempValue() {
            return tempValue;
        }    
     			

    	
    		private String unitOfMeasurement; 		
    	
    	public String getunitOfMeasurement() {
            return unitOfMeasurement;
        }    
     			

  
	public ProfileStruct (String badgeID, double tempValue, String unitOfMeasurement) 
	{ 

		this.badgeID = badgeID;
		this.tempValue = tempValue;
		this.unitOfMeasurement = unitOfMeasurement;
    }
}