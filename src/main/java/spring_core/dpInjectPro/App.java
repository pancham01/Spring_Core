package spring_core.dpInjectPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
//    
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Employee e =(Employee)factory.getBean("empBean11");
    	System.out.println(e);
    }
}
