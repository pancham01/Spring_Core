package spring_core.dpInjectPro.Entity;

public class Address2 {
	private String street;
	private String city;
	
	public Address2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address2(String street, String city) {
		super();
		this.street = street;
		this.city = city;
		System.out.println("Address.Address()");
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
}
