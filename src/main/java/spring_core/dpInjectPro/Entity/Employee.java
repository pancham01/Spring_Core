package spring_core.dpInjectPro.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private Address address;
	private String name;
	private int id;
	

	public Employee() {
		super();
	}

	
	public Employee(Address address, String name, int id) {
		super();
		System.out.println("Hello1");

		this.address = address;
		this.name = name;
		this.id = id;
		System.out.println("Hello2");
	}


	public Address getAddress() {
		return address;
	}
	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		System.out.println("Employee.setAddress()");
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

}
