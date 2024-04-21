package com.nt.TicketForm;

import java.io.Serializable;

public class TicketData implements Serializable {
	String pasanger_name;
	Integer age;
	String passanger_Cl;
	String passanger_Dst;
	public String getPasanger_name() {
		return pasanger_name;
	}
	public void setPasanger_name(String pasanger_name) {
		this.pasanger_name = pasanger_name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassanger_Cl() {
		return passanger_Cl;
	}
	public void setPassanger_Cl(String passanger_Cl) {
		this.passanger_Cl = passanger_Cl;
	}
	public String getPassanger_Dst() {
		return passanger_Dst;
	}
	public void setPassanger_Dst(String passanger_Dst) {
		this.passanger_Dst = passanger_Dst;
	}
	
}
