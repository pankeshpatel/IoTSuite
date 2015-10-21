package $Storageservice.deviceImplPackageName$;

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
	private String queryCreateTable = null;

	
	
	// Configuration Parameter
	// TODO: Device Developers will write USERNAME and PASSWORD to access the database
	static final String USERNAME = "";
	static final String PASSWORD = "";	
	
	static final String DBNAME = "$Storageservice.name$";
	

	
		
  public JavaSE$Storageservice.name$() {
	  
	  
	 
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
				 
				 System.out.println("Table exisits in the database.....");	
				 $Storageservice.allDataAccess:{dataAccess |
						}$
				}
				else{				
				System.out.println("Table does not exist in the database.....");	
				
				
				ps = connect.prepareStatement("CREATE TABLE iotsuiteuser.$Storageservice.name$ " +
				
              "($Storageservice.allfieldwithSQlvariable:{fieldwithSQL |	$fieldwithSQL$};separator="," $)");
              ps.execute();
				
	  

				
				
				$Storageservice.allDataAccess:{dataAccess |
					
			
				}$
				}
				
						
			
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
  
  }

  $Storageservice.allDataAccess:{dataAccess |    
  
  @Override
  public void set$dataAccess.dataAccessName; format="avoidCapital"$ 
      ($dataAccess.query.type; format="capital" $ newIndex, $dataAccess.generatedInfo.type$  new$dataAccess.dataAccessName; format="avoidCapital"$Value ) {
    
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
 
  @Override
  public $dataAccess.generatedInfo.type$ get$dataAccess.dataAccessName$($dataAccess.query.type; format="capital" $ index){
 	  
	  try {
			String query  = "SELECT * FROM  iotsuiteuser.$Storageservice.name$ WHERE $Storageservice.id$=" + index;
			resultSet = statement.executeQuery(query);
			resultSet.next();
			tempPreference = new $dataAccess.generatedInfo.type$($Storageservice.allStructField:{structField | resultSet.get$structField$};separator=","$   );
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}	
		return tempPreference;
  
  } 
}$

private boolean checkTableExists() {
	System.out.println("Checking Table exisits or not in the database...");
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



