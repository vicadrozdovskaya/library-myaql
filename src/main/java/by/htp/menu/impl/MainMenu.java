package by.htp.menu.impl;

import java.util.Scanner;

import by.htp.controller.ILibraryController;
import by.htp.menu.IMenu;

public class MainMenu implements IMenu {

	public static final String MENU = "1 - ������ � ������� � ������ � ���������� " + "\n"
			+ "2 - ������ � ������� �� ������� � ���������� " + "\n"
			+ "3 - ������ � ������� � ����������� � ����������  " + "\n"
			+ "4 - ������ � ������� � ������������ ������� � ���������� " + "\n"
			+ "5 - ����� � ����������� �������� ����� �� ����� " + "\n" + "6 - ����� �� ��������� \n";
	protected ILibraryController libraryController;
	
	

	public void continueMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n�� ������ ����������? �(��)/�(���)" + "\n");
		String str = sc.nextLine();
		switch (str) {
		case "�":
		case "�":
			exitMenu();
			break;
		}
	}

	public void exitMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������������� ������ �����? �(��)/�(���)" + "\n");
		String str = sc.nextLine();
		switch (str) {
		case "�":
		case "�":
			
			System.out.println("�������, ��� ������� ���� ���������. ��������� � ��� ���");
			System.exit(0);
			break;
		}

	}

	@Override
	public void menu() {
		System.out.println(MENU);
	}

}
