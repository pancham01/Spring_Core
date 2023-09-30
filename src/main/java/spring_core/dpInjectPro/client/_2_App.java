package spring_core.dpInjectPro.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_core.dpInjectPro.Entity.EmployeeLazy;
import spring_core.dpInjectPro.config.AppConfig;

/**
 * Hello world!
 *
 */
public class _2_App {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeLazy employee = app.getBean(EmployeeLazy.class);
		System.out.println(employee);
		System.out.println(employee.getAdddress());
		
	}
}
