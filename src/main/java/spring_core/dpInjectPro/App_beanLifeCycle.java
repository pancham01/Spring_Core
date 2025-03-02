package spring_core.dpInjectPro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Employee2;

public class App_beanLifeCycle {
	 public static void main( String[] args )
	    {
		 	ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beanLifecycle.xml"); 
	    	Employee2 obj =  factory.getBean("empA",Employee2.class);
			System.out.println(obj);
			
//			Employee2 obj1 =  factory.getBean(Employee2.class);
//			System.out.println(obj1);
			
//			factory.registerShutdownHook();
	    }
}
