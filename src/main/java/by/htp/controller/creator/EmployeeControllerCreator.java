package by.htp.controller.creator;

import by.htp.controller.ILibraryController;
import by.htp.controller.impl.EmployeeControllerImpl;

public class EmployeeControllerCreator extends ControllersCreator {

	@Override
	public ILibraryController factoryMethod() {
		return new EmployeeControllerImpl();
	}

}
