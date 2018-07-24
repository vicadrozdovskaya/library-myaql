package by.htp.menu.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import by.htp.controller.ILibraryController;
import by.htp.controller.creator.AuthorControllerCreator;
import by.htp.controller.creator.ControllersCreator;
import by.htp.entity.Author;
import by.htp.menu.IMenu;
import by.htp.run.Read;

public class AuthorMenuImpl extends MainMenu {
	private static final String MENU = "1 - ���������� ������ �� ������� � ���������� " + "\n" + "2 - �������� ������ � ���������� "
			+ "\n" + "3 - �������� ������ �� ������ � ����������  " + "\n" + "4 - ������� ������ �� ���������� "
			+ "\n" + "5 - ����� �� ��������� \n";

	public AuthorMenuImpl() {
		libraryController = new AuthorControllerCreator().factoryMethod(); 
	}
	@Override
	public void menu() {
		Read read = new Read();
		 
		while (true) {
			System.out.println(MENU);
			int choice = read.readNumber();
			switch (choice) {
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
				super.exitMenu();
				break;
			}
			break;
		}
		
	}


}
