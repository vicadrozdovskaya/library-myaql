package by.htp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import by.htp.entity.Employee;

public interface EmployeeDao extends IDao<Employee> {
	
	Employee getEmployee(ResultSet rs) throws SQLException;
	Employee get(int id);
	boolean insert(Employee employee);
	boolean update(Employee employee);
	boolean delete(Employee employee);
	List<Employee> getAll();

}
