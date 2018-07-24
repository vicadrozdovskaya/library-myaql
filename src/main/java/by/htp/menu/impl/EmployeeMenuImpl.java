package by.htp.menu.impl;

import java.util.List;

import by.htp.controller.ILibraryController;
import by.htp.controller.creator.BookControllerCreator;
import by.htp.controller.creator.EmployeeControllerCreator;
import by.htp.entity.Employee;
import by.htp.entity.LibraryCard;
import by.htp.run.Read;

public class EmployeeMenuImpl extends MainMenu {
	
	public static final String MENU = "1 - ���������� ������ � ����������� � ���������� " + "\n"
			+ "2 - �������� ���������� � ���������� " + "\n" + "3 - �������� ������ � ���������� � ����������  "
			+ "\n" + "4 - ������� ���������� �� ���������� " + "\n"
			+ "5 - ����� � ����������� �������� ����� �� ����� " + "\n" + "6 - ����� �� ��������� \n";
	
	public EmployeeMenuImpl() {
		
		libraryController = new EmployeeControllerCreator().factoryMethod(); 
	}
	
	@Override
	public void menu() {
		Read read = new Read();
		
		while (true) {
			System.out.println(MENU);
			int choiceEmpl = read.readNumber();
			switch (choiceEmpl) {
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
//				System.out.println("������� ����� ������ � ������� ��");
//				String month = read.readString();
//				List<LibraryCard> listLCards = lCardDao.findLibraryCardByDate(month);
//				int number = 1;
//				if (listLCards.isEmpty()) {
//					System.out.println("� ���� ������ ������ �� ������");
//				} else {
//					System.out.println("����� �� �����������");
//					for (LibraryCard e : listLCards) {
//						System.out.println(number);
//						System.out.println(e);
//						number++;
//					}
//				}
				break;
			case 6:
				super.exitMenu();
				break;
			}

			break;
		}
		
	}
	
	

}
