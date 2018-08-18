package com.spring.practice;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	@NotNull
	@Size(min=1,message="is required")
	private String firstName;
	
	@NotNull
	@Size(min=1,message="is required")
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private LinkedHashMap<String,String> countryOptions;
	private String[] operatingSystems;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IN", "India");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("KA", "Koria");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	

}
