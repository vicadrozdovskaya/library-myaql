package by.htp.controller.creator;

import by.htp.controller.ILibraryController;
import by.htp.controller.impl.AuthorControllerImpl;

public class AuthorControllerCreator extends ControllersCreator {

	@Override
	public ILibraryController factoryMethod() {
		return new AuthorControllerImpl();
	}

}
