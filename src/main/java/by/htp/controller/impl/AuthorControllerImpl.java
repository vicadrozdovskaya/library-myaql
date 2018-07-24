package by.htp.controller.impl;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import by.htp.controller.ILibraryController;
import by.htp.dao.AuthorDao;
import by.htp.dao.impl.AuthorDaoImpl;
import by.htp.entity.Author;
import by.htp.run.Read;

public class AuthorControllerImpl implements ILibraryController {

	private AuthorDao authorDao;
	private Read read;
	
	public AuthorControllerImpl() {
		authorDao = new AuthorDaoImpl();
		read = new Read();
	}
	@Override
	public void showAll() {
		for (Author a : authorDao.getAllAuthors()) {
			System.out.println(a);
		}
	}

	@Override
	public boolean insert() {
		System.out.println("������� ��� ������");
		String name = read.readLine();
		System.out.println("������� ������� ������");
		String surname = read.readLine();
		System.out.println("������� ���� �������� ������ � ������� ��-��-����");
		try {
			Calendar birthDate = Calendar.getInstance();
			String str = read.readLine();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			birthDate.setTime(dateFormat.parse(str));
			Author author = new Author();
			author.setName(name);
			author.setSurname(surname);
			author.setBirthDate(birthDate);
			if (authorDao.insertAuthor(author)) {
				System.out.println("����� ������� ��������");
				return true;
			} else {
				System.out.println("��������� ������ ��� ����������, ���������� �����");
				return false;
			}
		} catch (ParseException e1) {

			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update() {
		showAll();
		System.out.println("�������� ������ ��� ��������������: ������� ��� ID");
		int id_author = read.readNumber();
		System.out.println("������� ��� ������");
		String name = read.readLine();
		System.out.println("������� ������� ������");
		String surname = read.readLine();
		System.out.println("������� ���� �������� ������ � ������� ��-��-����");
		try {
			Calendar birthDate = Calendar.getInstance();
			String str = read.readLine();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			birthDate.setTime(dateFormat.parse(str));
			Author author = new Author();
			author.setIdAuthor(id_author);
			author.setName(name);
			author.setSurname(surname);
			author.setBirthDate(birthDate);
			if (authorDao.updateAuthor(author)) {
				System.out.println("����� ������� �������");
				return true;
			} else {
				System.out.println("��������� ������ ��� ���������, ���������� �����");
				return false;
			}
		} catch (ParseException e1) {

			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete() {
		showAll();
		System.out.println("�������� ������ ��� ��������: ������� ��� ID");
		int id_author = read.readNumber();
		Author author = authorDao.getAuthor(id_author);
		if (authorDao.deleteAuthor(author)) {
			System.out.println("����� ������� ������");
			return true;
		} else {
			System.out.println("��������� ������ ��� ��������, ���������� �����");
			return false;
		}
	}

}
