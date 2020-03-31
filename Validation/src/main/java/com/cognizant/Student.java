package com.cognizant;

import java.util.List;

public class Student {

	private String name;
	private String email;
	private String gender;
	private List<String> languages;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public Student(String name, String email, String gender, List<String> languages) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.languages = languages;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", gender=" + gender + ", languages=" + languages + "]";
	}

}
