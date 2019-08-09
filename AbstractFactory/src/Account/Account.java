package Account;

import java.io.Serializable;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int AccountNUmber;
	String name;
	String detail;
	String city;

	public int getAccountNUmber() {
		return AccountNUmber;
	}

	public void setAccountNUmber(int accountNUmber) {
		AccountNUmber = accountNUmber;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}