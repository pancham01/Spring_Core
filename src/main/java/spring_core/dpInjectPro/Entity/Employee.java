package spring_core.dpInjectPro.Entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class Employee {
	private int id =101;
	private String name="Guest";
	private int salary = 10_000;
	
	@Autowired
	private Address adddress;
	@PostConstruct
	public void turnOn() {
		System.out.println("Load operating system emp");
	}
	@PreDestroy
	public void turnOff() {
		System.out.println("Close all programs emp");
	}
	

	public Employee() {
		System.out.println("Employee.Employee()");
	}
	
	public Employee(Address adddress) {
		this.adddress = adddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("id.....");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAdddress() {
		return adddress;
	}
	public void setAdddress(Address adddress) {
		this.adddress = adddress;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", adddress=" + adddress + "]";
	}
}
