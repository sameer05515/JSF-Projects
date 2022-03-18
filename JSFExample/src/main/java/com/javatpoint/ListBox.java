package com.javatpoint;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ListBox {
	private String option;

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
}