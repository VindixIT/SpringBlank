package br.com.blank.to;

public class CustomerTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// member variables
	int CustomerNumber;
	String name;
	String streetAddress;
	String city;

	public int getCustomerNumber() {
		return CustomerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
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
}