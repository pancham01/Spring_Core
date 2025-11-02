package spring_core.dpInjectPro.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Employee;
import spring_core.dpInjectPro.repo.EmployeeDao;



public class App {
	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application.xml");
		EmployeeDao edao = ioc.getBean("edao", EmployeeDao.class);
		
		
		Employee emp1 = new Employee(3, "Nakul","Male", 96000);
//		edao.saveEmployee(emp1);
		
		
//    	edao.updateEmployee(emp1);
//    	System.out.println("updated successfully");
//    	edao.deleteEmployee(7);
//    	edao.deleteEmployee(9);

		List<Employee> allEmp=edao.getAllEmp();
//		
		for (Employee employee : allEmp) {
			System.out.println(employee);
		}
		System.out.println("Get successfully");

	}
}
