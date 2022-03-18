package com.javatpoint;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class User implements Serializable {
	String name;
	String lastName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}