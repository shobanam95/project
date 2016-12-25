package com.urwardrobe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AddressDetails {
	


	    @Id
	    @GeneratedValue
	    private int address_Id;
	    private String street_Name;
	    private String House_Number;
	    private String city;
	    private String state;
	    private String country;
	    private String zipCode;

	   

	   

	    public int getAddress_Id() {
			return address_Id;
		}

		public void setAddress_Id(int address_Id) {
			this.address_Id = address_Id;
		}

		public String getStreet_Name() {
			return street_Name;
		}

		public void setStreet_Name(String street_Name) {
			this.street_Name = street_Name;
		}

		public String getHouse_Number() {
			return House_Number;
		}

		public void setHouse_Number(String house_Number) {
			House_Number = house_Number;
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

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    public String getZipCode() {
	        return zipCode;
	    }

	    public void setZipCode(String zipCode) {
	        this.zipCode = zipCode;
	    }

	   

	    
}
