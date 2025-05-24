package spring_core.dpInjectPro.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_core.dpInjectPro.Entity.Employee;
import spring_core.dpInjectPro.config.Appconfig;
import spring_core.dpInjectPro.repo.EmployeeDao;
import spring_core.dpInjectPro.repo.EmployeeDaoImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(Appconfig.class);
		EmployeeDao edao = app.getBean(EmployeeDaoImpl.class);
		Employee emp = new Employee(8, "Vishwash", 80000);
//    	edao.saveEmployee(emp);
//    	System.out.println("save successfully");

//		emp = new Employee(6, "Arjun", 70_000);
//    	edao.updateEmployee(emp);
//    	System.out.println("updated successfully");

//    	edao.deleteEmployee(emp);
		List<Employee> allEmp=edao.getAllEmp();
		
		for (Employee employee : allEmp) {
			System.out.println(employee);
		}
		System.out.println("updated successfully");

	}
}
