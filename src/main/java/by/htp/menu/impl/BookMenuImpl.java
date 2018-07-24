package by.htp.menu.impl;

import java.util.List;

import by.htp.controller.ILibraryController;
import by.htp.controller.creator.BookControllerCreator;
import by.htp.controller.creator.ControllersCreator;
import by.htp.dao.LibraryCardDao;
import by.htp.dao.ReportDao;
import by.htp.dao.impl.LibraryCardDaoImpl;
import by.htp.dao.impl.ReportDaoImpl;
import by.htp.entity.LibraryCard;
import by.htp.run.Read;

public class BookMenuImpl extends MainMenu {

	private static final String MENU = "1 - ���������� ������ � ������ � ���������� " + "\n" + "2 - �������� ����� � ���������� "
			+ "\n" + "3 - �������� ������ � ����� � ����������  " + "\n" + "4 - ������� ����� �� ���������� " + "\n"
			+ "5 - ����� � ����������� �������� ����� �� ����� " + "\n" + "6 - ����� �� ��������� \n";
	
	public BookMenuImpl(){
		libraryController = new BookControllerCreator().factoryMethod(); 
	}
	
	@Override
	public void menu() {
		Read read = new Read();
		ReportDao reportDao = new ReportDaoImpl();
		
		while (true) {
			System.out.println(MENU);
			int choice2 = read.readNumber();
			switch (choice2) {
			case 1:
				libraryController.showAll();
				break;

			case 2:
				libraryController.insert();
				break;
			case 3:
				libraryController.update();
				break;
			case 4:
				libraryController.delete();				
				break;
			case 5:
				System.out.println("������� ����� ������ � ������� ��");
				String month = read.readString();
				List<LibraryCard> listLCards = reportDao.reportEmployeeReadBooks(month);
				int number = 1;
				if (listLCards.isEmpty()) {
					System.out.println("� ���� ������ ������ �� ������");
				} else {
					System.out.println("����� �� �����������");
					for (LibraryCard e : listLCards) {
						System.out.println(number);
						System.out.println(e);
						number++;
					}
				}
				break;
			case 6:
				super.exitMenu();
				break;

			}
			break;
		}

	
	}



}
