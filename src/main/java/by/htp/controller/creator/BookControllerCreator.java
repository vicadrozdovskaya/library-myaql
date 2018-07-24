package by.htp.controller.creator;

import by.htp.controller.ILibraryController;
import by.htp.controller.impl.BookControllerImpl;

public class BookControllerCreator extends ControllersCreator {

	@Override
	public ILibraryController factoryMethod() {
		return new BookControllerImpl();
	}

}
