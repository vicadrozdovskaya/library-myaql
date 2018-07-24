package by.htp.controller.impl;


import by.htp.controller.ILibraryController;
import by.htp.dao.AuthorDao;
import by.htp.dao.BookDao;
import by.htp.dao.impl.AuthorDaoImpl;
import by.htp.dao.impl.BookDaoImpl;
import by.htp.entity.Author;
import by.htp.entity.Book;
import by.htp.run.Read;

public class BookControllerImpl implements ILibraryController {

	private BookDao dao;
	private AuthorDao authorDao;
	private Book book;
	private Read read;

	public BookControllerImpl() {
		dao = new BookDaoImpl();
		authorDao = new AuthorDaoImpl();
		read = new Read();
		book = new Book();
	}

	@Override
	public void showAll() {
		for (Book b : dao.getAll()) {
			System.out.println(b);
		}
	}

	@Override
	public boolean insert() {
		System.out.println("Введите название книги");
		String title = read.readLine();		
		for (Author a : authorDao.getAllAuthors()) {
			System.out.println(a);
		}
		System.out.println("Выберите автора книги: введите его ID");
		int id_author = read.readNumber();
		Author author = authorDao.getAuthor(id_author);
		book.setTitle(title);
		book.setAuthor(author);
		if(dao.insert(book) == true) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean update() {
		showAll();
		System.out.println("Выберите книгу для редактирования: введите ее ID");
		int id_book = read.readNumber();
		System.out.println("Введите название книги");
		String title = read.readLine();
		for (Author a : authorDao.getAllAuthors()) {
			System.out.println(a);
		}
		System.out.println("Выберите автора книги: введите его ID");
		int id_author = read.readNumber();
		Author author = authorDao.getAuthor(id_author);
		book.setIdBook(id_book);
		book.setTitle(title);
		book.setAuthor(author);
		if(dao.update(book)) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean delete() {
		showAll();
		System.out.println("Выберите книгу для удаления: введите ее ID");
		int id_book = read.readNumber();
		book.setIdBook(id_book);
		if(dao.update(book)) {
			return true;
		}else {
		return false;
		}
	}

}
