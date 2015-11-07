package deviceImpl;

import iotsuite.semanticmodel.Device;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

import framework.*;

public class JavaSEProfileDB implements IProfileDB {

	
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	static PreparedStatement ps ;

		private TempStruct tempPreference;
			
	
	 String USERNAME = "";
	 String PASSWORD = "";	
	 private String DBMS;
	
	static final String DBNAME = "ProfileDB";
		
  public JavaSEProfileDB(Device deviceInfo) {
	  DBMS=deviceInfo.getDatabase();
	  
	 if(DBMS.equalsIgnoreCase("mysql"))
	 {
	  try {
	    
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost/", 
							 USERNAME , PASSWORD );
			
			statement = (Statement) connect.createStatement();
			ps = connect.prepareStatement("CREATE DATABASE IF NOT EXISTS iotsuiteuser ");
			ps.execute();
			
			connect = DriverManager.getConnection("jdbc:mysql://localhost/iotsuiteuser", 
					 USERNAME , PASSWORD );
			
			if(checkTableExists()){ // If table exists				
				 
				 System.out.println("Table exists in the database im MySQL");	

				 						
				}
				else{				
				System.out.println("Table does not exist in the database in MySQL");	
				
				
				ps = connect.prepareStatement("CREATE TABLE iotsuiteuser.ProfileDB " +
				
              "(badgeID VARCHAR(255),tempValue DOUBLE,unitOfMeasurement VARCHAR(255),badgeID VARCHAR(255),tempValue DOUBLE,unitOfMeasurement VARCHAR(255),tempValue DOUBLE,unitOfMeasurement VARCHAR(255),tempValue DOUBLE,badgeID VARCHAR(255),tempValue DOUBLE,unitOfMeasurement VARCHAR(255),tempValue DOUBLE,unitOfMeasurement VARCHAR(255),tempValue DOUBLE,tempValue DOUBLE,unitOfMeasurement VARCHAR(255),tempValue DOUBLE)");
              ps.execute();
				
				}
		} 
		catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
  }
  
  if (DBMS.equalsIgnoreCase("azuresql")) {

      try {
             
           String connectionString = "jdbc:sqlserver://xlkgkzy7y9.database.windows.net:1433;" +
          "database=iotsuiteuser;user="+USERNAME+";password={"+PASSWORD+"};" +
          "encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;;"
            + "loginTimeout=30;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
         // setup the connection with the Azure DB.
        connect = DriverManager.getConnection(connectionString);
        statement = (Statement) connect.createStatement();
        System.out.println("....Connection Established to Azure SQL....");

      } catch (Exception e) {
        System.out.println("Exception " + e.getMessage());
        e.printStackTrace();
      }
    }
    
    if(DBMS.equalsIgnoreCase("mongodb")) {
     try{   
          MongoClient mongoClient = new MongoClient("localhost",27017);
          DB db = mongoClient.getDB( "iotsuiteuser" );
          @SuppressWarnings("unused")
          DBCollection table =db.getCollection("ProfileDB");
          System.out.println("Established connection to MongoDB.....");
            
      }catch(Exception e){
       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    }    
    }    
    }
  
  
    
      
      @Override
       public void InsertProfileData(ProfileStruct newprofileValue ) {
  	  
  	  if(DBMS.equalsIgnoreCase("mysql")){
  		    
  		  /*
  		  try {  
  				ps = 
  					connect.prepareStatement("INSERT INTO ProfileDB " +
  							"(badgeID,tempValue,unitOfMeasurement,badgeID,tempValue,unitOfMeasurement,tempValue,unitOfMeasurement,tempValue,badgeID,tempValue,unitOfMeasurement,tempValue,unitOfMeasurement,tempValue,tempValue,unitOfMeasurement,tempValue) VALUES" +
  							" ("""newprofileValue.getbadgeID()+""newprofileValue.gettempValue()+""newprofileValue.getunitOfMeasurement()+""newprofileValue.getbadgeID()+""newprofileValue.gettempValue()+""newprofileValue.getunitOfMeasurement()+""newprofileValue.getbadgeID()+""newprofileValue.gettempValue()+""newprofileValue.getunitOfMeasurement()+")");
  				
  				ps.executeUpdate(); 
  				
  				
  			} catch (SQLException e) {
  				e.printStackTrace();
  			} */
  			}
  			
  			
  		if(DBMS.equalsIgnoreCase("azuresql")){
  	    
  		/*	
  	    try {  
  	      
  	    	String sqlString="INSERT INTO ProfileDB " +
  	            "(badgeID,tempValue,unitOfMeasurement,badgeID,tempValue,unitOfMeasurement,tempValue,unitOfMeasurement,tempValue,badgeID,tempValue,unitOfMeasurement,tempValue,unitOfMeasurement,tempValue,tempValue,unitOfMeasurement,tempValue) VALUES" +
  	            " ("+newIndex+","+newprofileValue.getbadgeID()+","+newprofileValue.gettempValue()+","+newprofileValue.getunitOfMeasurement()+","+newprofileValue.getbadgeID()+","+newprofileValue.gettempValue()+","+newprofileValue.getunitOfMeasurement()+","+newprofileValue.getbadgeID()+","+newprofileValue.gettempValue()+","+newprofileValue.getunitOfMeasurement()+")";
  	      
  	              statement = connect.createStatement();
  	              statement.executeUpdate(sqlString);
  	              connect.close(); 
  	             
  	      
  	      
  	    } catch (SQLException e) {
  	      e.printStackTrace();
  	    }
  	    */ 
  	    }
  	    
  	    
  	   if(DBMS.equalsIgnoreCase("mongodb")){	
  		 /* try{   

  	          MongoClient mongoClient = new MongoClient();
  	          DB db = mongoClient.getDB( "iotsuiteuser" );
  	          DBCollection table =db.getCollection("ProfileDB");
  	          BasicDBObject document = new BasicDBObject();           
  	          document.put("badgeID", newIndex);

  	          	          document.put("tempValue",newprofileValue.gettempValue());
  	          	          
  	          	          document.put("unitOfMeasurement",newprofileValue.getunitOfMeasurement());
  	          	          
  	          	          document.put("tempValue",newprofileValue.gettempValue());
  	          	          
  	          	          document.put("unitOfMeasurement",newprofileValue.getunitOfMeasurement());
  	          	          
  	          	          document.put("tempValue",newprofileValue.gettempValue());
  	          	          
  	          	          document.put("tempValue",newprofileValue.gettempValue());
  	          	          
  	          	          document.put("unitOfMeasurement",newprofileValue.getunitOfMeasurement());
  	          	          
  	          	          document.put("tempValue",newprofileValue.gettempValue());
  	          	          
  	          table.insert(document);
  	          
  	        
  	      }catch(Exception e){
  	       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
  	    }  */
  		  
  	    }
      	   
        } 
      	    
       
 
  
  


   
    @Override
    public TempStruct getprofile(String index){
   	  if(DBMS.equalsIgnoreCase("mysql")) {
  	  try {
  			String query  = "SELECT * FROM  iotsuiteuser.ProfileDB WHERE badgeID=" + index;
  			resultSet = statement.executeQuery(query);
  			resultSet.next();
  			tempPreference = new TempStruct(resultSet.getDouble("tempValue"),resultSet.getString("unitOfMeasurement"),resultSet.getDouble("tempValue"),resultSet.getString("unitOfMeasurement"),resultSet.getDouble("tempValue"),resultSet.getDouble("tempValue"),resultSet.getString("unitOfMeasurement"),resultSet.getDouble("tempValue")   );
  		} catch (Exception e) {
  			System.err.println("Got an exception! ");
  			System.err.println(e.getMessage());
  		}	
  		}
  		
  		if (DBMS.equalsIgnoreCase("azuresql")) {

        try {

          resultSet = statement
              .executeQuery("SELECT * FROM ProfileDB WHERE badgeID = "
                  + index);
          resultSet.next();
          tempPreference = new TempStruct(resultSet.getDouble("tempValue"),resultSet.getString("unitOfMeasurement"),resultSet.getDouble("tempValue"),resultSet.getString("unitOfMeasurement"),resultSet.getDouble("tempValue"),resultSet.getDouble("tempValue"),resultSet.getString("unitOfMeasurement"),resultSet.getDouble("tempValue")   );
         } catch (Exception e) {
          System.err.println("Got an exception! ");
          System.err.println(e.getMessage());
        }

      }
      
      
      if(DBMS.equalsIgnoreCase("mongodb")) {
      try{
              MongoClient mongoClient = new MongoClient();
                // Now connect to your databases
               DB db = mongoClient.getDB( "iotsuiteuser" );
               DBCollection collection = db.getCollection("ProfileDB");
               BasicDBObject findObject = new BasicDBObject();
               findObject.put("badgeID",index);     
               DBCursor cursor = collection.find(findObject);  
                while (cursor.hasNext()) {        
                 BasicDBObject dbObject = (BasicDBObject)cursor.next();
                 tempPreference = new TempStruct(dbObject.
                 getDouble("tempValue"),dbObject.
                 getString("unitOfMeasurement"),dbObject.
                 getDouble("tempValue"),dbObject.
                 getString("unitOfMeasurement"),dbObject.
                 getDouble("tempValue"),dbObject.
                 getDouble("tempValue"),dbObject.
                 getString("unitOfMeasurement"),dbObject.
                 getDouble("tempValue")   );
                       
                 }
             
      }
       catch(Exception e){
               System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            }
            }
      
  		return tempPreference;
    
    } 


private boolean checkTableExists() {
	System.out.println("Checking Table exists or not in the database in MySQL");
try {
		DatabaseMetaData md = connect.getMetaData();
		ResultSet rs = md.getTables(null, null, DBNAME, null);

		if (rs.next()){ 
			return true;
		} else {
			return false;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}

}