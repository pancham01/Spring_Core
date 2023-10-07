package spring_core.dpInjectPro.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Employee;
import spring_core.dpInjectPro.repo.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
    	EmployeeDao edao = app.getBean("edao", EmployeeDao.class);
    	Employee emp = new Employee(22,"Kartik",90000);
    	edao.saveEmployeeByPreparedStatement(emp);
    	System.out.println("save successfully");
    	
    }
}
