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
	private $dataAccess.generatedInfo.type.name$ tempPreference;
	}$
	private String queryCreateTable = null;

	
	
	// Configuration Parameter
	// TODO: Device Developers will write USERNAME and PASSWORD to access the database
	static final String USERNAME = "";
	static final String PASSWORD = "";	
	
	//TODO: Should be generated from StringTemplate file
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
						//setprofile("-400", new $dataAccess.generatedInfo.type.name$(-400.0,"C"));
						}$
				}
				else{				
				System.out.println("Table does not exist in the database.....");	
				
				
				ps = connect.prepareStatement("CREATE TABLE iotsuiteuser.$Storageservice.name$ " +
				
              "($Storageservice.allfieldwithSQlvariable:{fieldwithSQL |	$fieldwithSQL$};separator="," $)");
              ps.execute();
				
	  
				//ProfileDB   
	           //generate  profile: TempStruct accessed-by badgeID: String;
				
				
				$Storageservice.allDataAccess:{dataAccess |
					
				//setprofile("-300", new $dataAccess.generatedInfo.type.name$(-100.0,"C"));
				}$
				}
				
						
			
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
  
  }

  $Storageservice.allDataAccess:{dataAccess |    
  
  @Override
  public void set$dataAccess.dataAccessName; format="capital"$ 
      ($dataAccess.query.type.name; format="capital" $ newIndex, $dataAccess.generatedInfo.type.name$  new$dataAccess.dataAccessName; format="capital"$Value ) {
    // Use this function, when storage is considered  
	//  as an actuator - It stores data from various sources. 

	  try {  
			ps = 
				connect.prepareStatement("INSERT INTO $Storageservice.name$ " +
						"($Storageservice.allfieldName:{fieldName |$fieldName$};separator=","$) VALUES" +
						" ("+newIndex+"$Storageservice.allStructFieldName:{structFieldName |,"+newprofileValue.get$structFieldName$()+"}$)");
			/*pstmt.setString(1, newIndex);
  			pstmt.setDouble(2, newprofileValue.gettempValue());
  			pstmt.setString(3, newprofileValue.getunitOfMeasurement());*/
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	  
    } 
 
  @Override
  public $dataAccess.generatedInfo.type.name$ get$dataAccess.dataAccessName$($dataAccess.query.type.name; format="capital" $ index){
    // Use this function, when  storage is considered as 
	  // sensor - It allows to reterive stored data.
	  
	  try {
			String query  = "SELECT * FROM  iotsuiteuser.$Storageservice.name$ WHERE id=" + index;
			resultSet = statement.executeQuery(query);
			resultSet.next();
			//double tempValue =resultSet.getDouble("tempValue");
			//String unitOfMeasurement = resultSet.getString("unitOfMeasurement");
			//tempPreference = new $dataAccess.generatedInfo.type.name$(tempValue, unitOfMeasurement);
			tempPreference = new $dataAccess.generatedInfo.type.name$($Storageservice.allStructField:{structField | resultSet.get$structField$};separator=","$   );
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



