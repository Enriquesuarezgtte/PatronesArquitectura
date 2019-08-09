package Customer;

import java.io.Serializable;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int customerNUmber;
	String name;
	String streetAddress;
	String city;
	String email;

	public Customer(int id) {
		customerNUmber = id;
		name = "";
		streetAddress = "";
		city = "";
		email = "";
	}

	public Customer() {
		customerNUmber = (int) serialVersionUID;
		name = "";
		streetAddress = "";
		city = "";
		email = "";
	}

	public int getCustomerNUmber() {
		return customerNUmber;
	}

	public void setCustomerNUmber(int customerNUmber) {
		this.customerNUmber = customerNUmber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;
	}

}
