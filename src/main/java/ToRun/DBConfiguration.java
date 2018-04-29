package ToRun;

import myDBFramework.DataBaseConfig;

public class DBConfiguration implements DataBaseConfig {
	
	public String getURL() {
		return "jdbc:sqlserver://localhost\\sqlexpress:65525";
	}

	public String getUser() {
		return "exampleUsr";
	}

	public String getPassword() {
		return "123";
	}

}
