package spring_core.dpInjectPro.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_core.dpInjectPro.Entity.Parent;
import spring_core.dpInjectPro.Entity.ParentLookup;
import spring_core.dpInjectPro.config.AppConfig;

/**
 * Hello world!
 *
 */
public class _1_App {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
//		Parent parent = app.getBean(Parent.class);
//		System.out.println(parent);
//		System.out.println(parent.getChild());
//		System.out.println(parent.getChild());
//		
		
		System.out.println("--------Lookup---------");
		ParentLookup beanPL = app.getBean(ParentLookup.class);
		System.out.println(beanPL);
		System.out.println("abstract method: "+beanPL.getChildDetails());
		System.out.println("abstract method: "+beanPL.getChildDetails());
		System.out.println("--------Lookup.2---------");

		beanPL = app.getBean(ParentLookup.class);
		System.out.println(beanPL);
		System.out.println(beanPL.getChildDetails());
		System.out.println(beanPL.getChildDetails());
	}
}
