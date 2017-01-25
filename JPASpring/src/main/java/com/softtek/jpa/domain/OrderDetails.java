package com.softtek.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;

public class OrderDetails implements Serializable{

	private static final long serialVersionUID = 1L;

	@Embedded
	private Cart cart;
	
	private int OrderNumber;
	private Date dateOrdered;
}
