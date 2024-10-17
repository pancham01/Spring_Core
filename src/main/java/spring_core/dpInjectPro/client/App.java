package spring_core.dpInjectPro.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Employee;
import spring_core.dpInjectPro.repo.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
		EmployeeDao edao = app.getBean("edao", EmployeeDao.class);
		Employee emp = new Employee(2, "Nakul", 80000);
//    	edao.saveEmployee(emp);
//    	emp = new Employee(3, "Arun", 80000);
//    	edao.saveEmployee(emp);
//    	emp = new Employee(4, "Mukul", 80000);
//    	edao.saveEmployee(emp);
//    	System.out.println("save successfully");

//		emp = new Employee(1, "Arjun", 70_000);
//    	edao.updateEmployee(emp);
//    	System.out.println("updated successfully");

//    	edao.deleteEmployee(emp);
		List<Employee> allEmp=edao.getAllEmp();
		
		for (Employee employee : allEmp) {
			System.out.println(employee);
		}
		System.out.println("Get successfully");

	}
}
