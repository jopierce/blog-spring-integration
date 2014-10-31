package com.credera.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"name","email","age","gender"})
public class Person {
	private String name;
	private String email;
	private Integer age;
	private Gender gender;
	
	public Person(String name, String email, Integer age, Gender gender) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	
	@XmlElement
	public void setAge(Integer age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	
	@XmlElement
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}


