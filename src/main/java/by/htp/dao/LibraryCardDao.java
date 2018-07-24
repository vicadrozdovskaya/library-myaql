package by.htp.dao;

import java.util.List;
import by.htp.entity.LibraryCard;

public interface LibraryCardDao extends IDao<LibraryCard> {
	
	LibraryCard get(int id);
	boolean insert(LibraryCard lCard);
	boolean update(LibraryCard lCard);
	boolean delete(LibraryCard lCard);
	List<LibraryCard> getAll();
}
