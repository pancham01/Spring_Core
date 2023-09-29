package spring_core.dpInjectPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Address;

public class App_5_lookup {
	 public static void main( String[] args )
	    {
	    	ApplicationContext factory = new ClassPathXmlApplicationContext("lookup.xml");
//	    	Employee3 obj =  (Employee3)factory.getBean("empA");
//	    	obj.setAddress(obj.applyAddress());
//			System.out.println(obj);
//			obj.getAddress().setCity("CITY");
//			System.out.println(obj);
//			
//			Employee3 obj1 = (Employee3) factory.getBean("empA");
//			obj1.setAddress(obj1.applyAddress());
//			System.out.println(obj1);
//			obj1.getAddress().setCity("CITY1");
//			System.out.println(obj1);
		 
	    	Address obj =  (Address)factory.getBean("address1");
	    	Address obj1 =  (Address)factory.getBean("address1");

		 
			System.out.println(obj.hashCode());
			System.out.println(obj.hashCode());

			
	    }
}
