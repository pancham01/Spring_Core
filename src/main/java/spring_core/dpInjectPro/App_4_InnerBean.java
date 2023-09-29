package spring_core.dpInjectPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Employee1;

public class App_4_InnerBean {
	 public static void main( String[] args )
	    {
	    	ApplicationContext factory = new ClassPathXmlApplicationContext("innerBean.xml"); 
	    	Employee1 obj =  factory.getBean(Employee1.class);
			System.out.println(obj);
			obj.getAddress().setCity("Happy");
			System.out.println(obj);
			
			Employee1 obj1 =  factory.getBean(Employee1.class);
			System.out.println(obj1);
			obj1.getAddress().setCity("Paalika");
			System.out.println(obj1);
			
	    }
}
