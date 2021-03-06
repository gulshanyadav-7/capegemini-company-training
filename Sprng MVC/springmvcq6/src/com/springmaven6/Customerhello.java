package com.springmaven6;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customerhello {
	@NotNull(message = "Name may not be null")
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z0-9]\s*")
	@Size(min=8,max=20,message="Enter valid details")
	private String username;
	@NotNull
	@NotEmpty
	@Size(min=8,max=20)
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\s)(?=.*[@$!%*#?&])[A-Za-z\s@$!%*#?&]{8,20}$")
	private String password;
	@NotNull
	@NotEmpty
	/* @IsValidEmail */
	private String email;
	@Size(min=6,max=6, message="size of name must be 6 digits")
	@NotNull
	@NotEmpty
	@Zip
	private int Zipcode;
	@Phone
	private long contact;
	private String city;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getZipcode() {
		return Zipcode;
	}
	public void setZipcode(int zipcode) {
		this.Zipcode = zipcode;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
