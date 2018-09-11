package Org.Bhavya.Infosys.HRApplication.Database;

import java.util.HashMap;
import java.util.Map;

import Org.Bhavya.Infosys.HRApplication.Model.Employee;

public class EmployeeDatabase {
	
	private static Map<String, Employee> emps = new HashMap<>();

	public static Map<String, Employee> getEmps() {
		return emps;
	}
	
	

}
