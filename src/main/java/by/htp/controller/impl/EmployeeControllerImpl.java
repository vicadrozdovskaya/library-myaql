package by.htp.controller.impl;

import by.htp.controller.ILibraryController;
import by.htp.dao.EmployeeDao;
import by.htp.dao.impl.EmployeeDaoImpl;
import by.htp.entity.Employee;
import by.htp.run.Read;

public class EmployeeControllerImpl implements ILibraryController {

	private EmployeeDao daoEmpl;
	private Read read;
	
	public EmployeeControllerImpl() {
		daoEmpl = new EmployeeDaoImpl();
		read = new Read();
	}
	@Override
	public void showAll() {	
		for (Employee e : daoEmpl.getAll()) {
			System.out.println(e);
		}
	}

	@Override
	public boolean insert() {
		System.out.println("Введите имя сотрудника");
		String name = read.readLine();
		System.out.println("Введите фамилию сотрудника");
		String surname = read.readLine();
		System.out.println("Введите телефон сотрудника");
		String phone = read.readLine();
		System.out.println("Введите подразделение, в котором работает сотрудник");
		String department = read.readLine();
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSurname(surname);
		employee.setPhone(phone);
		employee.setDepartment(department);
		if (daoEmpl.insert(employee)) {
			System.out.println("Сотрудник успешно добавлен");
			return true;
		} else {
			System.out.println("Произошла ошибка при добавлении, попрубуйте снова");
			return false;
		}
	}

	@Override
	public boolean update() {
		showAll();
		System.out.println("Выбирете Id сотрудника, которого хотите изменить");
		int id_employee = read.readNumber();
		System.out.println("Введите имя сотрудника");
		String name = read.readLine();
		System.out.println("Введите фамилию сотрудника");
		String surname = read.readLine();
		System.out.println("Введите телефон сотрудника");
		String phone = read.readLine();
		System.out.println("Введите подразделение, в котором работает сотрудник");
		String department = read.readLine();
		Employee employee = new Employee();
		employee.setIdEmployee(id_employee);
		employee.setName(name);
		employee.setSurname(surname);
		employee.setPhone(phone);
		employee.setDepartment(department);
		if (daoEmpl.update(employee)) {
			System.out.println("Сотрудник успешно изменен");
			return true;
		} else {
			System.out.println("Произошла ошибка при изменении, попрубуйте снова");
			return false;
		}
	}

	@Override
	public boolean delete() {
		showAll();
		System.out.println("Выбирете Id сотрудника, которого хотите изменить");
		int id_employee = read.readNumber();
		Employee employee = new Employee();
		employee.setIdEmployee(id_employee);		
		if (daoEmpl.delete(daoEmpl.get(id_employee))) {
			System.out.println("Сотрудник успешно удален");
			return true;
		} else {
			System.out.println("Произошла ошибка при удалении, попрубуйте снова");
			return false;
		}
	}

}
