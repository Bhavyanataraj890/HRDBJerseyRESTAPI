package Org.Bhavya.Infosys.HRApplication.Model;

public class ErrorMessage {

	private String ErrMsg;
	private int ErrCode;
	private String Documentation;
	public String getErrMsg() {
		return ErrMsg;
	}
	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}
	public int getErrCode() {
		return ErrCode;
	}
	public void setErrCode(int errCode) {
		ErrCode = errCode;
	}
	public String getDocumentation() {
		return Documentation;
	}
	public void setDocumentation(String documentation) {
		Documentation = documentation;
	}
	public ErrorMessage(String errMsg, int errCode, String documentation) {
		super();
		ErrMsg = errMsg;
		ErrCode = errCode;
		Documentation = documentation;
	}
	public ErrorMessage() {
		super();
	}
	
}
