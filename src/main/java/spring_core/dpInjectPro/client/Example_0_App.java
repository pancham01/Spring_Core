package spring_core.dpInjectPro.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Employee;
import spring_core.dpInjectPro.repo.EmployeeDao;

/**
 * Hello world!
 *
 */
public class Example_0_App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
    	EmployeeDao edao = app.getBean("edao", EmployeeDao.class);
    	//Employee emp = new Employee(22,"Guest",Arrays.asList("BTech","MTech"));
    	Employee emp = new Employee(22,"Guest2",8000);
    	edao.saveEmployee(emp);
    	System.out.println("save successfully");
    	
//    	emp = new Employee(22,"Ran",70_000);
//    	edao.updateEmployee(emp);
//    	edao.deleteEmployee(emp);
    }
}
