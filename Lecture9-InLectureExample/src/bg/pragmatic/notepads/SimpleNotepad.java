package bg.pragmatic.notepads;

import java.util.ArrayList;
import java.util.List;

import bg.pragmatic.notepads.exceptions.PageNotFoundException;

public class SimpleNotepad implements INotepad {
	private List<Page> pages;

	public SimpleNotepad() {
		this.pages = new ArrayList<>();
	}
	
	
	
	@Override
	public void createPageAndWrite(String title, String text) {
		Page curPage = new Page();
		curPage.setTitle(title);
		curPage.addText(text);
		pages.add(curPage);
		curPage.setPageNumber(pages.size());
	}
	
	@Override
	public void replaceTextOnPage(int pageNumber, String text) throws PageNotFoundException {
		Page foundPage = findPage(pageNumber);
		foundPage.deleteText();
		foundPage.addText(text);
	}
	
	private Page findPage(int pageNumber) throws PageNotFoundException {
		for (Page curPage : pages) {
			if(curPage.getPageNumber() == pageNumber) {
				return curPage;
			}
		}
		
		throw new PageNotFoundException("A page with number " + pageNumber + " was not found.");
	}

	@Override
	public void deleteText(int pageNumber) throws PageNotFoundException {
		Page foundPage = findPage(pageNumber);
		foundPage.deleteText();
	}

	@Override
	public void showAllPages() {
		for (Page page : pages) {
			System.out.println(page.viewPage());
		}
	}

}
