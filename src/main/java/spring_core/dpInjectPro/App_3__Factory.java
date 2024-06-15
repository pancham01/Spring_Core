package spring_core.dpInjectPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.DatabaseSingleton;

public class App_3__Factory {
	 public static void main( String[] args )
	    {
	    	ApplicationContext factory =    new ClassPathXmlApplicationContext("factory.xml"); 
	    	DatabaseSingleton obj =  factory.getBean("dbSingleton",DatabaseSingleton.class);
			System.out.println(obj);
			
			ApplicationContext factory1 =    new ClassPathXmlApplicationContext("factory.xml"); 
			DatabaseSingleton obj1 = (DatabaseSingleton) factory1.getBean("dbSingleton");
			System.out.println(obj1);
		
	    }
}
