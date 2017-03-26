package bg.pragmatic.myautomationframework.utils.enums;

public enum FirstName {

	ALEX("Alex"),
	PESHO("Pesho");

	private String firstName;

	private FirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
		
	}

	
	
	
}
