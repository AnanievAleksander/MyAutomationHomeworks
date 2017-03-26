package bg.pragmatic.notepads;

import bg.pragmatic.notepads.exceptions.PageNotFoundException;

public interface IElectronicDevice extends INotepad {
		
		void startDevice();
		void stopDevice();
		void isDeviceStarted();
		void passwordIs();
		
		@Override
		default void createPageAndWrite(String title, String text) {
			// TODO Auto-generated method stub
			
		}
		@Override
		default void replaceTextOnPage(int pageNumber, String text) throws PageNotFoundException {
			// TODO Auto-generated method stub
			
		}
		@Override
		default void deleteText(int pageNumber) throws PageNotFoundException {
			// TODO Auto-generated method stub
			
		}
		@Override
		default void showAllPages() {
			// TODO Auto-generated method stub
			
		}
		
		
		
		

}
