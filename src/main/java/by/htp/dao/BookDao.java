package by.htp.dao;

import java.util.List;

import by.htp.entity.Book;

public interface BookDao extends IDao<Book> {
	
	Book get(int id);
	List<Book> getAll();
	boolean insert(Book book);
	boolean delete(Book book);
	boolean update(Book book);

}
