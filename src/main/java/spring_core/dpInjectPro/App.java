package spring_core.dpInjectPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Child;
import spring_core.dpInjectPro.Entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//    	Employee e =(Employee)factory.getBean("emp2");
//    	System.out.println(e);
    	
    	
    	//Parent Child
    	ApplicationContext bean = new ClassPathXmlApplicationContext("parent_child.xml");
    	Child e2 =(Child)bean.getBean("child");
    	System.out.println(e2);
    	
    }
}
