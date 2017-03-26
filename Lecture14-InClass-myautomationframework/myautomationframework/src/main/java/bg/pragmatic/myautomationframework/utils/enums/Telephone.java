package bg.pragmatic.myautomationframework.utils.enums;

public enum Telephone {
	
	ALEXTELEPHONE("09999111222");
	
	private String telephone;
	
	private Telephone(String telephone){
		this.telephone = telephone;
	}

	public String getTelephone() {
		return telephone;
	}

}
