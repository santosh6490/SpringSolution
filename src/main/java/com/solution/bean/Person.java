package com.solution.bean;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@Component
@XmlRootElement(name = "person")
public class Person {

	
	private String name;
	private int age;
	private String sex;
	private Address address;

	public Person() {
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	@XmlElement
	public void setSex(String sex) {
		this.sex = sex;
	}

	public Address getAddress() {
		return address;
	}

	@XmlElement
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
