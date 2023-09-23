package spring_core.dpInjectPro.Entity;

public class Employee {
	private String name;
	private int id;

	public Employee() {
		super();
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		System.out.println("Param-called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Name-setter");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Id-setter");

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}
