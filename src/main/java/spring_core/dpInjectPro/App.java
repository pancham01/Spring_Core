package spring_core.dpInjectPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_core.dpInjectPro.Entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new AnnotationConfigApplicationContext("spring_core.dpInjectPro");
		Employee bean = app.getBean("employee",Employee.class);
		System.out.println(bean);
		
//		bean = app.getBean("employee",Employee.class);
//		System.out.println(bean);
//		bean = app.getBean("employee",Employee.class);
//		System.out.println(bean);

    	
    }
}


