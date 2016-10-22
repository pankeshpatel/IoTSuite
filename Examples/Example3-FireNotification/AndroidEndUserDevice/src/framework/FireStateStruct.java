package framework;

import java.io.Serializable;

public class FireStateStruct implements Serializable {    
	private static final long serialVersionUID = 1L;	
	

    	
    		private String fireValue; 		
    	
    	public String getfireValue() {
            return fireValue;
        }    
     			

    	
    		private String timeStamp; 		
    	
    	public String gettimeStamp() {
            return timeStamp;
        }    
     			

  
	public FireStateStruct (String fireValue, String timeStamp) 
	{ 

		this.fireValue = fireValue;
		this.timeStamp = timeStamp;
    }
}