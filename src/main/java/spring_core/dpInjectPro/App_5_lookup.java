package spring_core.dpInjectPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Address;
import spring_core.dpInjectPro.Entity.Employee3;

public class App_5_lookup {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("lookup.xml");
		Employee3 obj = (Employee3) factory.getBean("empA");
		System.out.println(obj);
		
		obj.setAddress(obj.applyAddress());
		System.out.println(obj);
		Address a1 = obj.applyAddress();
		System.out.println(a1);
		
		
		Address a2 = obj.applyAddress();
		System.out.println(a2);
		a2.setCity("Noida");
		System.out.println(a2);

	}
}
