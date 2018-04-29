package ToRun;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import myDBFramework.DataBaseFactory;
import myDBFramework.DataBaseObject;
import myDBFramework.DataBaseResult;

public class mainClass {

	public static void main(String[] args) throws SQLException {
		DataBaseFactory.connect(DBConfiguration.class);
		
		Test test1 = new Test();
		test1.setID(1, 1);
		test1.setName("");
		Test test2 = new Test();
		test2.setID(1, 2);
		test2.setName("");
		
		test1.saveWithID();
		test1.setName("test");
		DataBaseResult r = test1.executeQuery("SELECT Name FROM Test");
		for(int i=0;i<r.getMappedObjects().size();i++) {
			System.out.println(r.getMappedObjects().get(i));
		}
		for(int i=0;i<r.getMappedColumns().size();i++){
			System.out.println(r.getMappedColumns().get(i));
		}
		new Computer().saveAutoID();	

		DataBaseFactory.close();	
	}

}
