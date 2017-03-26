package bg.pragmatic.myautomationframework.utils.enums;

public enum Email {
	
	ALEXEMAIL("alexananiev@abv.bg");
	
	private String eMail;
	
	private Email (String eMail){
		this.eMail =eMail;
	}

	public String geteMail() {
		return eMail;
	}
	

}
