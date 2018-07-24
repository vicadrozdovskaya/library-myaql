package by.htp.run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import by.htp.dao.AuthorDao;
import by.htp.dao.BookDao;
import by.htp.dao.EmployeeDao;
import by.htp.dao.LibraryCardDao;
import by.htp.dao.impl.AuthorDaoImpl;
import by.htp.dao.impl.BookDaoImpl;
import by.htp.dao.impl.EmployeeDaoImpl;
import by.htp.dao.impl.LibraryCardDaoImpl;
import by.htp.entity.Author;
import by.htp.entity.Book;
import by.htp.entity.Employee;
import by.htp.entity.LibraryCard;
import by.htp.menu.IMenu;
import by.htp.menu.impl.MainMenu;
import by.htp.menu.impl.AuthorMenuImpl;
import by.htp.menu.impl.BookMenuImpl;
import by.htp.menu.impl.EmployeeMenuImpl;

public class MainLibraryController {

	public static void main(String[] args) {

		BookDao dao = new BookDaoImpl();
		AuthorDao authorDao = new AuthorDaoImpl();
		Book book = new Book();

		EmployeeDao daoEmpl = new EmployeeDaoImpl();

		LibraryCardDao lCardDao = new LibraryCardDaoImpl();
		// List<LibraryCard> listLCards =
		// lCardDao.findLibraryCardByDate("07");//lCardDao.getAllLibraryCards();
		// int number = 1;
		// System.out.println("Отчет по сотрудникам");
		// for(LibraryCard e: listLCards) {
		// System.out.println(number);
		// System.out.println(e);
		// number++;
		// }
		Menu menu = new Menu();
		Read read = new Read();
		MainMenu mMenu = new MainMenu();
		IMenu bmenu = new BookMenuImpl();


		do {
			mMenu.menu();			
			int choice = read.readNumber();
			switch (choice) {

			case 1:
				bmenu.menu();
				menu.contineu();
				break;
			case 2:
				IMenu amenu = new AuthorMenuImpl();
					amenu.menu();					
					mMenu.continueMenu();
				break;

			case 3:
				IMenu eMenu = new EmployeeMenuImpl();
				eMenu.menu();
				mMenu.continueMenu();

				break;
			case 4:

				mMenu.continueMenu();
				break;
			case 5:

				mMenu.continueMenu();
			case 6:
				mMenu.exitMenu();

			}
		} while (true);
	}

}
