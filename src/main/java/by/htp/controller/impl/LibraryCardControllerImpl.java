package by.htp.controller.impl;

import by.htp.controller.ILibraryController;
import by.htp.dao.EmployeeDao;
import by.htp.dao.LibraryCardDao;
import by.htp.dao.impl.LibraryCardDaoImpl;
import by.htp.entity.Employee;
import by.htp.entity.LibraryCard;
import by.htp.run.Read;

public class LibraryCardControllerImpl implements ILibraryController {
	
	private LibraryCardDao daoLibCard;
	private Read read;
	
	public LibraryCardControllerImpl() {
		daoLibCard = new LibraryCardDaoImpl();
		read = new Read();
	}

	@Override
	public void showAll() {
		for (LibraryCard lCard : daoLibCard.getAll()) {
			System.out.println(lCard);
		}
	}

	@Override
	public boolean insert() {
		return false;
	}

	@Override
	public boolean update() {
		return false;
	}

	@Override
	public boolean delete() {
		return false;
	}

}
