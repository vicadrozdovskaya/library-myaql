package by.htp.dao;

import java.util.List;

import by.htp.entity.Author;

public interface AuthorDao {
	
	Author getAuthor(int id);
	boolean insertAuthor(Author author);
	boolean updateAuthor(Author author);
	boolean deleteAuthor(Author author);
	List<Author> getAllAuthors();

}
