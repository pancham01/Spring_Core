package spring_core.dpInjectPro.repo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import spring_core.dpInjectPro.Entity.Employee;
import spring_core.dpInjectPro.Entity.EmployeeMapper;
@Component
public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	
	
	public EmployeeDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public EmployeeDaoImpl(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Employee> getAllEmp()
	{
		return jdbcTemplate.query("select * from employee", new EmployeeMapper());

	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee (id,name,salary) values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id='" + e.getId() + "' ";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}
}
