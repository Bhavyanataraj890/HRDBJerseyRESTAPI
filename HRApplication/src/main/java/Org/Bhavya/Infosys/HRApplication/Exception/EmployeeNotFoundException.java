package Org.Bhavya.Infosys.HRApplication.Exception;

public class EmployeeNotFoundException extends RuntimeException{

	
	private static long serialVersionID = -376829387;
	
	public EmployeeNotFoundException(String msg)
	{
		super(msg);
	}
}
