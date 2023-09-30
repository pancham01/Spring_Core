package spring_core.dpInjectPro.Entity;

public class Address {
	private String city = "city";
	private String state = "state";

	public void turnOn() {
		System.out.println("Load operating system for address");
	}

	public void turnOff() {
		System.out.println("Close all programs for address");
	}

	public Address() {
		System.out.println("Address.Address()");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

}
