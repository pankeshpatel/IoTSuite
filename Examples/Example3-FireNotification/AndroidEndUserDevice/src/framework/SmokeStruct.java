package framework;

import java.io.Serializable;

public class SmokeStruct implements Serializable {    
	private static final long serialVersionUID = 1L;	
	

    	
    		private double smokeValue; 		
    	
    	public double getsmokeValue() {
            return smokeValue;
        }    
     			

    	
    		private String unitOfMeasurement; 		
    	
    	public String getunitOfMeasurement() {
            return unitOfMeasurement;
        }    
     			

  
	public SmokeStruct (double smokeValue, String unitOfMeasurement) 
	{ 

		this.smokeValue = smokeValue;
		this.unitOfMeasurement = unitOfMeasurement;
    }
}