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
//		Employee emp1 = new Employee(2, "Ansh", 80000);
//		Employee emp2 = new Employee(3, "Lokesh", 80000);
//		Employee emp3 = new Employee(4, "Rawat", 80000);
//		Employee emp4 = new Employee(5, "Deepak", 80000);
//		Employee emp5 = new Employee(6, "Ayush", 80000);
//		edao.saveEmployee(emp1);
//		edao.saveEmployee(emp2);
//		edao.saveEmployee(emp3);
//		edao.saveEmployee(emp4);
//		edao.saveEmployee(emp5);
//    	emp = new Employee(1, "Kuldeep", 7000);
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
