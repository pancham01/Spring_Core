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
		Employee emp1 = new Employee(16, "Anurag Singh","Male", 99000);
//		edao.saveEmployee(emp1);
		
//		edao.updateEmployee(emp1);
		
//		edao.deleteEmployee(16);

		
		List<Employee> allEmp = edao.getAllEmp();
		
		System.out.println(allEmp);
		
	}
}
