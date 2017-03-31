package com.solution.bean;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@Component
@XmlRootElement(name="address")
public class Address {
	private String flatNo;
	private String lane;
	private String locality;
	private String city;
	private String state;
	private String country;

	public Address() {
	}

	public String getFlatNo() {
		return flatNo;
	}

	@XmlElement
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getLane() {
		return lane;
	}

	@XmlElement
	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getLocality() {
		return locality;
	}

	@XmlElement
	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	@XmlElement
	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	@XmlElement
	public void setCountry(String country) {
		this.country = country;
	}

}
