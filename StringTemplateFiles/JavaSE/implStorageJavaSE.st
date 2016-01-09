package $Storageservice.deviceImplPackageName$;

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

public class JavaSE$Storageservice.name$ implements I$Storageservice.name$ {

  
  private Connection connect = null;
  private Statement statement = null;
  private ResultSet resultSet = null;
  static PreparedStatement ps ;
  $Storageservice.allDataAccess:{dataAccess |
  private $dataAccess.generatedInfo.type$ tempPreference;
  }$  
  
   String USERNAME = "";
   String PASSWORD = "";  
   private String DBMS;
  
  static final String DBNAME = "$Storageservice.name$";
    
  public JavaSE$Storageservice.name$(Device deviceInfo) {
    DBMS=deviceInfo.getDatabase();
    
   if(DBMS.equalsIgnoreCase("mysql"))
   {
    try {
      
      Class.forName("com.mysql.jdbc.Driver");
      connect = DriverManager.getConnection("jdbc:mysql://localhost/", 
               USERNAME , PASSWORD );
      
      statement = (Statement) connect.createStatement();
      ps = connect.prepareStatement("CREATE DATABASE IF NOT EXISTS $Storageservice.databaseName$ ");
      ps.execute();
      
      connect = DriverManager.getConnection("jdbc:mysql://localhost/$Storageservice.databaseName$", 
           USERNAME , PASSWORD );
      
      if(checkTableExists()){ // If table exists        
         
         System.out.println("Table exists in the database im MySQL"); 
         $Storageservice.allDataAccess:{dataAccess |
            }$
        }
        else{       
        System.out.println("Table does not exist in the database in MySQL");  
        
        
        ps = connect.prepareStatement("CREATE TABLE iotsuiteuser.$Storageservice.name$ " +
        
              "($Storageservice.allfieldwithSQlvariable:{fieldwithSQL | $fieldwithSQL$};separator="," $)");
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
          DBCollection table =db.getCollection("$Storageservice.name$");
          System.out.println("Established connection to MongoDB.....");
            
      }catch(Exception e){
       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    }    
    }    
    }
  
  
  $Storageservice.allActions:{ action |   
    
    @Override
     public void $action.name$($action.allParameter:{ param | $param.type$ newprofileValue }; separator=", "$) {
    
    if(DBMS.equalsIgnoreCase("mysql")){
        
      
      try {  
        ps = 
          connect.prepareStatement("INSERT INTO $Storageservice.name$ " +
              "($Storageservice.allfieldName:{fieldName |$fieldName$};separator=","$) VALUES" +
              " ($Storageservice.allStorageActionStructFieldName:{structFieldName |"+newprofileValue.get$structFieldName$()+"}; separator=","$)");
        
        ps.executeUpdate(); 
        
        
      } catch (SQLException e) {
        e.printStackTrace();
      } 
      }
      
      
    if(DBMS.equalsIgnoreCase("azuresql")){
      
      
      try {          
        String sqlString=("INSERT INTO $Storageservice.name$ " +
              "($Storageservice.allfieldName:{fieldName |$fieldName$};separator=","$) VALUES" +
              " ($Storageservice.allStorageActionStructFieldName:{structFieldName |"+newprofileValue.get$structFieldName$()+"}; separator=","$)");
                      statement = connect.createStatement();
                statement.executeUpdate(sqlString);
        
      } catch (SQLException e) {
        e.printStackTrace();
      }
       
      }
      
      
     if(DBMS.equalsIgnoreCase("mongodb")){  
      try{   

            MongoClient mongoClient = new MongoClient();
            DB db = mongoClient.getDB( "iotsuiteuser" );
            DBCollection table =db.getCollection("$Storageservice.name$");
            BasicDBObject document = new BasicDBObject();           
            $Storageservice.allStorageActionStructFieldName:{structFieldName |
            document.put("$structFieldName$",newprofileValue.get$structFieldName$());
            }$
            table.insert(document);
            
          
        }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }  
      
      }
         
      } 
          
    }; separator="\n"$ 
 
  
  

  $Storageservice.allDataAccess:{dataAccess |
 
  @Override
  public $dataAccess.generatedInfo.type$ get$dataAccess.dataAccessName$($dataAccess.query.type; format="capital" $ index){
    if(DBMS.equalsIgnoreCase("mysql")) {
    try {
      String query  = "SELECT * FROM  iotsuiteuser.$Storageservice.name$ WHERE $Storageservice.id$=" + index;
      resultSet = statement.executeQuery(query);
      resultSet.next();
                  
      tempPreference = new $dataAccess.generatedInfo.type$( $Storageservice.ConsumeInfoFieldsForSensor:{consumeInfoFieldsForSensor |
            resultSet.get$consumeInfoFieldsForSensor.consumeInfoStructFieldType;format="capital"$("$consumeInfoFieldsForSensor.consumeInfoStructField$")};separator=","$   );
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    } 
    }
    
    if (DBMS.equalsIgnoreCase("azuresql")) {

      try {

        resultSet = statement
            .executeQuery("SELECT * FROM $Storageservice.name$ WHERE $Storageservice.id$ = "
                + index);
        resultSet.next();
        
        
       
       tempPreference = new $dataAccess.generatedInfo.type$(  $Storageservice.ConsumeInfoFieldsForSensor:{consumeInfoFieldsForSensor |
        resultSet.get$consumeInfoFieldsForSensor.consumeInfoStructFieldType;format="capital"$("$consumeInfoFieldsForSensor.consumeInfoStructField$")};separator=","$   );
        
        //tempPreference = new $dataAccess.generatedInfo.type$($Storageservice.allStructField:{structField | resultSet.get$structField.type;format="capital"$("$structField.name$")};separator=","$   );
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
             DBCollection collection = db.getCollection("$Storageservice.name$");
             BasicDBObject findObject = new BasicDBObject();
             findObject.put("$Storageservice.id$",index);     
             DBCursor cursor = collection.find(findObject);  
              while (cursor.hasNext()) {        
               BasicDBObject dbObject = (BasicDBObject)cursor.next();
               
           
          
          tempPreference = new $dataAccess.generatedInfo.type$($Storageservice.ConsumeInfoFieldsForSensor:{consumeInfoFieldsForSensor | dbObject.
          get$consumeInfoFieldsForSensor.consumeInfoStructFieldType;format="capital"$("$consumeInfoFieldsForSensor.consumeInfoStructField$")};separator=","$);
             /*  tempPreference = new $dataAccess.generatedInfo.type$($Storageservice.allStructField:{structField | dbObject.
               get$structField.type;format="capital"$("$structField.name$")};separator=","$   ); */ 
                     
               }
           
    }
     catch(Exception e){
             System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          }
          }
    
    return tempPreference;
  
  } 
}$

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



