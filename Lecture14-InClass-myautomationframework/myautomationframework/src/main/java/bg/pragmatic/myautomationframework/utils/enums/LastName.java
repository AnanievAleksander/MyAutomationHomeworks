package bg.pragmatic.myautomationframework.utils.enums;

public enum LastName {

	ALEXLASTNAME("Ananiev");

	private String lastName;

	private LastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
}
