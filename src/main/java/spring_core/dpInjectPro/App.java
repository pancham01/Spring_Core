package spring_core.dpInjectPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
		Employee bean = app.getBean("employee",Employee.class);
		System.out.println(bean);

		Employee bean1 = app.getBean(Employee.class);
		System.out.println(bean1);
    	
    }
}
