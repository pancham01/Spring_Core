package spring_core.dpInjectPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Address;
import spring_core.dpInjectPro.Entity.Employee3;

public class App_5_lookup {
	 public static void main( String[] args )
	    {
	    	ApplicationContext factory = new ClassPathXmlApplicationContext("lookup.xml");
	    	Employee3 obj =  (Employee3)factory.getBean("empA");
	    	obj.setAddress(obj.applyAddress());
	    	Address a1=obj.applyAddress();
	    	Address a2=obj.applyAddress();
	    	System.out.println(a1.hashCode());
	    	System.out.println(a2.hashCode());
			System.out.println(obj);
			obj.getAddress().setCity("CITY");
			System.out.println(obj);
			
			Employee3 obj1 = (Employee3) factory.getBean("empA");
			obj1.setAddress(obj1.applyAddress());
			System.out.println(obj1);
			obj1.getAddress().setCity("CITY1");
			System.out.println(obj1);
			
		 
	    	

			
	    }
}
