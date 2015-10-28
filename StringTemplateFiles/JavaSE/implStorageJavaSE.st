package $Storageservice.deviceImplPackageName$;

import iotsuite.semanticmodel.Device;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import framework.*;

public class JavaSE$Storageservice.name$ implements I$Storageservice.name$ {

	
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	static PreparedStatement ps ;
	$Storageservice.allDataAccess:{dataAccess |
	private $dataAccess.generatedInfo.type$ tempPreference;
	}$
		
	// Configuration Parameter
	// TODO: Device Developers will write USERNAME, PASSWORD and DBMS (ex-MySQL,Azure SQL etc.) to access the database
	 String USERNAME = "";
	 String PASSWORD = "";	
	 static String DBMS;
	
	static final String DBNAME = "$Storageservice.name$";
	

	
		
  public JavaSE$Storageservice.name$(Device deviceInfo) {
	  this.DBMS=deviceInfo.getDatabase();
	  
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
				 
				 System.out.println(".......Table exisits in the database im MySQL.....");	
				 $Storageservice.allDataAccess:{dataAccess |
						}$
				}
				else{				
				System.out.println("...........Table does not exist in the database in MySQL.....");	
				
				
				ps = connect.prepareStatement("CREATE TABLE iotsuiteuser.$Storageservice.name$ " +
				
              "($Storageservice.allfieldwithSQlvariable:{fieldwithSQL |	$fieldwithSQL$};separator="," $)");
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
    
    }
 

  $Storageservice.allDataAccess:{dataAccess |    
  
  @Override
  public void set$dataAccess.dataAccessName; format="avoidCapital"$ 
      ($dataAccess.query.type; format="capital" $ newIndex, $dataAccess.generatedInfo.type$  new$dataAccess.dataAccessName; format="avoidCapital"$Value ) {
   
   if(DBMS.equalsIgnoreCase("mysql")){
    
	  try {  
			ps = 
				connect.prepareStatement("INSERT INTO $Storageservice.name$ " +
						"($Storageservice.allfieldName:{fieldName |$fieldName$};separator=","$) VALUES" +
						" ("+newIndex+"$Storageservice.allStructFieldName:{structFieldName |,"+newprofileValue.get$structFieldName$()+"}$)");
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		}
		
		
	if(DBMS.equalsIgnoreCase("azuresql")){
    
    try {  
       String sqlString="INSERT INTO $Storageservice.name$ " +
            "($Storageservice.allfieldName:{fieldName |$fieldName$};separator=","$) VALUES" +
            " ("+newIndex+"$Storageservice.allStructFieldName:{structFieldName |,"+newprofileValue.get$structFieldName$()+"}$)";
      
             // Use the connection to create the SQL statement.
              statement = connect.createStatement();

              // Execute the statement.
              statement.executeUpdate(sqlString);
              connect.close();

              // Provide a message when processing is complete.
              System.out.println(".......Inserted Value in to Azure SQL......");
      
      
    } catch (SQLException e) {
      e.printStackTrace();
    } 
    }	
	  
    } 
 
  @Override
  public $dataAccess.generatedInfo.type$ get$dataAccess.dataAccessName$($dataAccess.query.type; format="capital" $ index){
 	  if(DBMS.equalsIgnoreCase("mysql")) {
	  try {
			String query  = "SELECT * FROM  iotsuiteuser.$Storageservice.name$ WHERE $Storageservice.id$=" + index;
			resultSet = statement.executeQuery(query);
			resultSet.next();
			tempPreference = new $dataAccess.generatedInfo.type$($Storageservice.allStructField:{structField | resultSet.get$structField.type$("$structField.name$")};separator=","$   );
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
        tempPreference = new $dataAccess.generatedInfo.type$($Storageservice.allStructField:{structField | resultSet.get$structField.type$("$structField.name$")};separator=","$   );
       } catch (Exception e) {
        System.err.println("Got an exception! ");
        System.err.println(e.getMessage());
      }

    }
		return tempPreference;
  
  } 
}$

private boolean checkTableExists() {
	System.out.println(".........Checking Table exisits or not in the database in MySQL...");
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



