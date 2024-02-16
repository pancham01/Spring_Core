package spring_core.dpInjectPro.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {

		Employee emp = new Employee();
		emp.setId(resultSet.getInt("id"));
		emp.setName(resultSet.getString("name"));
		emp.setSalary(resultSet.getInt("salary"));
		return emp;
	}
}