package bg.pragmatic.notepads;

import java.util.Scanner;

import bg.pragmatic.notepads.exceptions.PageNotFoundException;

public class SecuredNotepad extends SimpleNotepad {
	private String password;
	
	public SecuredNotepad(String password) {
		this.password = password;
	}

	@Override
	public void createPageAndWrite(String title, String text) {
		if(this.checkPassword()) {
			super.createPageAndWrite(title, text);
		} else {
			System.out.println("tva nqma da go praim");
		}
	}

	
	@Override
	public void replaceTextOnPage(int pageNumber, String text) throws PageNotFoundException {
		if(this.checkPassword()) {
			super.replaceTextOnPage(pageNumber, text);
		} else {
			System.out.println("tva nqma da go praim");
		}
	}

	@Override
	public void deleteText(int pageNumber) throws PageNotFoundException {
		if(this.checkPassword()) {
			super.deleteText(pageNumber);
		} else {
			System.out.println("tva nqma da go praim");
		}
		
	}

	@Override
	public void showAllPages() {
		if(this.checkPassword()) {
			super.showAllPages();
		} else {
			System.out.println("tva nqma da go praim");
		}
	}
	
	
	private boolean checkPassword() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Dai parola ue: ");
			String enteredPassword = scan.nextLine();
			if(enteredPassword.equals(this.password)) {
				return true;
			} else {
				System.out.println("greshna parola");
			}
		}
		
		return false;
		
	}
	
}
