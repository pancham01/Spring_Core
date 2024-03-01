package spring_core.dpInjectPro.repo;

import java.util.List;

import spring_core.dpInjectPro.Entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> getAllEmp();
	public int saveEmployee(Employee e );
	public int updateEmployee(Employee e);
	public int deleteEmployee(Employee e);


}
