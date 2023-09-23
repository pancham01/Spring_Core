package spring_core.dpInjectPro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring_core.dpInjectPro.Entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Resource resource = new ClassPathResource("ApplicationContext.xml");
//    	BeanFactory factory = new XmlBeanFactory(resource);
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Employee e =(Employee)factory.getBean("emp");
    	Employee e2 =(Employee)factory.getBean("emp2");
    	System.out.println(e);
    	System.out.println(e2);
    }
}
