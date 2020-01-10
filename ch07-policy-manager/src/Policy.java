
public class Policy {
	
	// instance variables
	private String policyNumber;
	private String versionNumber;
	
	// default / empty constructor
	public Policy() {
		policyNumber = "";
		versionNumber = "";
	}
	
	// fully qualified constructor
	public Policy(String policyNumber, String versionNumber) {
		this.policyNumber = policyNumber;
		this.versionNumber = versionNumber;
	}
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	public String getVersionNumber() {
		return versionNumber;
	}
	
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	
	
	
	
	
	
	
	
	
}
