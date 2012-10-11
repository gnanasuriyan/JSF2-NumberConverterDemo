package com.pointerunits;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class NumberBean {
	private Number number;
	public NumberBean() {
		// TODO Auto-generated constructor stub
	}
	
	public Number getNumber() {
		return number;
	}
	public void setNumber(Number number) {
		this.number = number;
	}

}
