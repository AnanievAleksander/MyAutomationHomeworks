package bg.pragmatic.notepads;

import bg.pragmatic.notepads.exceptions.PageNotFoundException;

public class Demo {
	public static void main(String[] args) {

		// INotepad simpleNotepad = new SimpleNotepad();
		// simpleNotepad.createPageAndWrite("title1", "text1");
		// simpleNotepad.createPageAndWrite("title2", "text2");
		// simpleNotepad.createPageAndWrite("title3", "text3");
		//
		// simpleNotepad.showAllPages();
		//
		// try {
		// simpleNotepad.replaceTextOnPage(2, "bla");
		// } catch (PageNotFoundException e) {
		// e.printStackTrace();
		// }
		// System.out.println("---------------------");
		// simpleNotepad.showAllPages();
		//
		// System.out.println("---------------------");
		//
		// try {
		// simpleNotepad.deleteText(1);
		// } catch (PageNotFoundException e) {
		// e.printStackTrace();
		// }
		//
		// simpleNotepad.showAllPages();

		INotepad securedNotepad = new SecuredNotepad("0000");
		securedNotepad.createPageAndWrite("title1", "text1");
	
		securedNotepad.showAllPages();
		IElectronicDevice electronicDevice = new ElectronicSecuredNotepad("0000");
		electronicDevice.createPageAndWrite("dhfdlsalkjh", "skdjhksd,f");
//		electronicDevice.isDeviceStarted();
//		electronicDevice.passwordIs();
		
		

		
	
	}
}
