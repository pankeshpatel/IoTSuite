package deviceImpl;

import framework.*;

public class AndroidProfileDB implements IProfileDB {

     public AndroidProfileDB() {
  
      }

     
    
    @Override
    public void setprofile 
        (String newIndex, TempStruct  newProfileValue ) {
      // Use this function, when storage is considered  
    //  as an actuator - It stores data from various sources. 
      } 
   
    @Override
    public TempStruct getprofile(String index){
      // Use this function, when  storage is considered as 
      // sensor - It allows to reterive stored data.
       return null;
    } 


}