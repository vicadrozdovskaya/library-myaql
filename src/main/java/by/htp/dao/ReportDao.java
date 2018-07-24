package by.htp.dao;

import java.util.List;

import by.htp.entity.LibraryCard;

public interface ReportDao {

	public List<LibraryCard> reportEmployeeReadBooks(String month);
}
