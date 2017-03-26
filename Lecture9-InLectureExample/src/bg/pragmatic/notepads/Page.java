package bg.pragmatic.notepads;

public class Page {
	private String title;
	private String text;
	private int pageNumber;
	
	Page() {
		this.text = "";
		this.title = "";
	}
	
	void addText(String text) {
		this.text += text;
		//this.text = this.text + text;
	}
	
	
	int getPageNumber() {
		return pageNumber;
	}



	void setTitle(String title) {
		this.title = title;
	}



	void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}



	void deleteText() {
		this.text = "";
	}
	
	String viewPage(){
		return this.title + "\n" + this.text;
	}
}
