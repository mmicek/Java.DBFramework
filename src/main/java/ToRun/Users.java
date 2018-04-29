package ToRun;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import myDBFramework.DataBaseObject;

public class Users extends DataBaseObject {

	private int id;
	public  String name;
	private String password;
	public int perm;
	
	@Override
	public Map<String, String> getMappedAttributes() {
		Map<String,String> result = new HashMap();
		result.put("UserID","id");
		result.put("ULogin","name");
		result.put("UPassword","password");
		result.put("Perm","perm");
		return result;
	}
	
	@Override
	public String getTable() {
		return "Users";
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return id + " " + name + " " + password + " " + perm; 
	}

}
