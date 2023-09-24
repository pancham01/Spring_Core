package spring_core.dpInjectPro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring_core.dpInjectPro.Entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
//    
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Employee e =(Employee)factory.getBean("emp");
    	System.out.println(e);
    }
}
